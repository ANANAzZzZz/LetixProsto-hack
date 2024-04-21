package ru.skittens.prostoleti.domain.entity

import ru.skittens.prostoleti.data.util.DataTime

data class Lesson(
    val comment: String,
    val dateTime: DataTime,
    val end_time: String,
    val end_time_seconds: Int,
    val form: String,
    val name: String,
    val room: String,
    val second_teacher: String,
    val start_time: String,
    val start_time_seconds: Int,
    val subjectType: String,
    val teacher: String,
    val temp_changes: List<Any>,
    val url: Any,
    val week: String
)