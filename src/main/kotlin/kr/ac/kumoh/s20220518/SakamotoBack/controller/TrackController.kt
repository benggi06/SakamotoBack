package kr.ac.kumoh.s20220518.SakamotoBack.controller

import kr.ac.kumoh.s20220518.SakamotoBack.domain.Track
import kr.ac.kumoh.s20220518.SakamotoBack.service.TrackService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/tracks")
class TrackController(private val trackService: TrackService) {

    @GetMapping
    fun getAllTracks(): ResponseEntity<List<Track>> {
        return ResponseEntity.ok(trackService.getAllTracks())
    }

    @GetMapping("/{id}")
    fun getTrackById(@PathVariable id: String): ResponseEntity<Track> {
        return try {
            ResponseEntity.ok(trackService.getTrackById(id))
        } catch (e: RuntimeException) {
            ResponseEntity.notFound().build()
        }
    }
}