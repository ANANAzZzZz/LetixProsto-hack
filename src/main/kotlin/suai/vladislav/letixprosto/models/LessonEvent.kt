package suai.vladislav.letixprosto.models

import kotlinx.serialization.Serializable
import suai.vladislav.letixprosto.util.DataTime

interface LessonEvent{
    var ord: Int
    var dateTime: DataTime
}