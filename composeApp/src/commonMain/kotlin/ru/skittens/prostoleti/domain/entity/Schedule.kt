package ru.skittens.prostoleti.domain.entity

import kotlinx.serialization.Serializable

@Serializable
data class Schedule(
    val id: Int,
    val name: String
)