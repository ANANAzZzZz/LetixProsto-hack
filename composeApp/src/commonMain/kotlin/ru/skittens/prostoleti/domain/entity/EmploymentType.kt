package ru.skittens.prostoleti.domain.entity

import kotlinx.serialization.Serializable

@Serializable
data class EmploymentType(
    val id: Int,
    val name: String
)