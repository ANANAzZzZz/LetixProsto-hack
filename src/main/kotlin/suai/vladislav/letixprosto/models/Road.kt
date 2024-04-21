package suai.vladislav.letixprosto.models

import kotlinx.serialization.Serializable
import suai.vladislav.letixprosto.util.DataTime

@Serializable
data class Road(
    val startRoute: String,
    val endRoute: String,
    val startTime: String,
    val endTime: String,
    override var ord: Int,
    override var dateTime: DataTime = DataTime.parseFromTimeTable(startTime)
): LessonEvent
