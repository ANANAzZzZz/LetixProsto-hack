package suai.vladislav.letixprosto.models

import kotlinx.serialization.Serializable
import org.springframework.stereotype.Service

@Serializable
data class Plan(
    val lessons: List<Lesson>,
    val roads: List<Road>
)