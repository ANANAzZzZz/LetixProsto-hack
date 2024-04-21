package ru.skittens.prostoleti.domain.entity

import kotlinx.serialization.Serializable

@Serializable
data class Logo(
    val id: String? = null,
    val name: String? = null,
    val url: String
)