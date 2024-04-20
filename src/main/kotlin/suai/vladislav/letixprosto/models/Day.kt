package suai.vladislav.letixprosto.models

import kotlinx.serialization.Serializable

@Serializable
data class Day(
    val lessons: List<Lesson>,
    val name: String
)