package kr.ac.kumoh.s20220518.SakamotoBack.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "tracks")
data class Track(
    @Id
    val id: String? = null,

    val title: String,
    val releaseYear: Int,
    val originType: String,
    val description: String,

    val tags: List<String> = emptyList(),
    val artists: List<String> = emptyList(),

    val albumCoverUrl: String? = null,

    // ✅ 이 필드가 꼭 있어야 합니다!
    val youtubeUrl: String? = null
)