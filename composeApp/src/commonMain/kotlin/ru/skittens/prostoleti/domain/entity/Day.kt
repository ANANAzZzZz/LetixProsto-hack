package ru.skittens.prostoleti.domain.entity

import kotlinx.serialization.Serializable

@Serializable
data class Day(
    val lessons: List<Lesson>,
    val name: String
)