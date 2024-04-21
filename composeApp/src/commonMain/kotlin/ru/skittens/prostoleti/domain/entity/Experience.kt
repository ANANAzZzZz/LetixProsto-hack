package ru.skittens.prostoleti.domain.entity

import kotlinx.serialization.Serializable

@Serializable
data class Experience(
    val id: Int,
    val name: String
)