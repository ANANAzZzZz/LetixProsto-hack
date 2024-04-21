package ru.skittens.prostoleti.domain.entity

import kotlinx.serialization.Serializable

@Serializable
data class MainVacancyCompetency(
    val id: Int,
    val name: String
)