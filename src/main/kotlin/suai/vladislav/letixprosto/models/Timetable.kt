package suai.vladislav.letixprosto.models

import kotlinx.serialization.Serializable

@Serializable
data class Timetable(
    val days: Days,
    val group: String
)