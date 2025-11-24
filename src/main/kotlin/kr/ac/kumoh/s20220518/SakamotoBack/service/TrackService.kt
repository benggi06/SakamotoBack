package kr.ac.kumoh.s20220518.SakamotoBack.service

import kr.ac.kumoh.s20220518.SakamotoBack.domain.Track
import kr.ac.kumoh.s20220518.SakamotoBack.repository.TrackRepository
import org.springframework.stereotype.Service

@Service
class TrackService(private val trackRepository: TrackRepository) {

    fun getAllTracks(): List<Track> {
        return trackRepository.findAll()
    }

    fun getTrackById(id: String): Track {
        return trackRepository.findById(id)
            .orElseThrow { RuntimeException("곡을 찾을 수 없습니다. ID: $id") }
    }

    fun createTrack(track: Track): Track {
        return trackRepository.save(track)
    }
}