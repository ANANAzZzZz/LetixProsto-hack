package suai.vladislav.letixprosto.models

import kotlinx.serialization.Serializable

@Serializable
data class Semester(
    val endDate: String,
    val season: String,
    val startDate: String,
    val year: Int
)