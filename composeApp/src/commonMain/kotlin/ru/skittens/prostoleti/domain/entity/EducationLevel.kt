package ru.skittens.prostoleti.domain.entity

import kotlinx.serialization.Serializable

@Serializable
data class EducationLevel(
    val id: Int,
    val name: String
)