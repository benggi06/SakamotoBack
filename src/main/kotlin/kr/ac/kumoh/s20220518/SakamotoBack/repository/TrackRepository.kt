package kr.ac.kumoh.s20220518.SakamotoBack.repository

import kr.ac.kumoh.s20220518.SakamotoBack.domain.Track
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface TrackRepository : MongoRepository<Track, String>