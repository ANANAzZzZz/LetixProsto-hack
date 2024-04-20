package ru.skittens.prostoleti.domain.entity

import kotlinx.serialization.Serializable

@Serializable
data class Timetable(
    val days: Days,
    val group: String
)