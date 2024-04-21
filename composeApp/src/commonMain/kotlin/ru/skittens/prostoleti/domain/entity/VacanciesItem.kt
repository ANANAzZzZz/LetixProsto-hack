package ru.skittens.prostoleti.domain.entity

import kotlinx.serialization.Serializable

@Serializable
data class VacanciesItem(
    val address: Address,
    val beforeTax: Boolean,
    val contactName: String,
    val description: String,
    val desirableVacancyCompetencies: List<String>,
    val educationLevel: EducationLevel,
    val email: String,
    val employmentType: EmploymentType,
    val experience: Experience,
    val hhUrl: String,
    val id: Int,
    val isBlocked: Boolean,
    val isFavorite: Boolean,
    val mainVacancyCompetencies: List<MainVacancyCompetency>,
    val name: String,
    val organization: Organization,
    val personalQualities: List<String> = listOf(),
    val phone: String,
    val professions: List<String> = listOf(),
    val publishedAt: String,
    val salaryFrom: String? = null,
    val salaryUpTo: Int,
    val schedule: List<Schedule>
)