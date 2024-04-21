package ru.skittens.prostoleti.domain.entity

import kotlinx.serialization.Serializable

@Serializable
data class Licenze(
    val id: String,
    val name: String,
    val url: String
)