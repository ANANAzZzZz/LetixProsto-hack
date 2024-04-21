package ru.skittens.prostoleti.domain.entity

import kotlinx.serialization.Serializable

@Serializable
data class OrganizationX(
    val accreditationCertificate: AccreditationCertificate,
    val address: String,
    val addressEng: String,
    val cover: Cover,
    val createdAt: String,
    val description: String,
    val descriptionEng: String,
    val educationalLevel: String? = null,
    val educationalStandard: String? = null,
    val educationalType: EducationalType,
    val email: String,
    val fullTitle: String,
    val fullTitleEng: String,
    val id: Int,
    val inn: String,
    val isEducational: Boolean,
    val isHead: Boolean,
    val isParticipant: Boolean,
    val isPublished: Boolean,
    val licenze: Licenze,
    val logo: LogoX,
    val ogrn: String,
    val parent: String? = null,
    val phone: String,
    val publishedAt: String,
    val shortTitle: String,
    val shortTitleEng: String,
    val site: String,
    val status: Boolean,
    val supervisorFio: String,
    val supervisorFioEng: String,
    val supervisorJobTitle: String,
    val supervisorJobTitleEng: String,
    val telegram: String? = null,
    val type: String? = null,
    val updatedAt: String,
    val vk: String? = null
)