package suai.vladislav.letixprosto.models

import kotlinx.serialization.Serializable

@Serializable
data class TempChange(
    val end_date: String,
    val end_timestamp: Int,
    val room: String,
    val start_date: String,
    val start_timestamp: Int,
    val teacher: String,
    val type: String
)