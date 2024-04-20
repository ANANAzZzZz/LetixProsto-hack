package ru.skittens.prostoleti.domain.entity

import kotlinx.serialization.Serializable

@Serializable
data class Lesson(
    val comment: String,
    val end_time: String,
    val end_time_seconds: Int,
    val is_distant: Boolean? = null,
    val name: String,
    val room: String,
    val form: String,
    val second_teacher: String,
    val start_time: String,
    val start_time_seconds: Int,
    val subjectType: String,
    val teacher: String,
    val temp_changes: List<TempChange>,
    val url: String?,
    val week: String
)