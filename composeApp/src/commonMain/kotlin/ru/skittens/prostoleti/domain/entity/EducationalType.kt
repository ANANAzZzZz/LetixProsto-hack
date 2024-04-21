package ru.skittens.prostoleti.domain.entity

import kotlinx.serialization.Serializable

@Serializable
data class EducationalType(
    val id: Int,
    val name: String,
    val url: String
)