package ru.skittens.prostoleti.data.source

import ru.skittens.prostoleti.data.util.Postman
import ru.skittens.prostoleti.domain.entity.Lesson
import ru.skittens.prostoleti.domain.entity.VacanciesItem
import ru.skittens.prostoleti.domain.util.Resource

class TimetableService(private val postman: Postman) {
    private val baseUrl = "https://humorous-ringtail-abnormally.ngrok-free.app/"
    private fun timetableTag(date: String) = "getPlanOnDay/$date"
    val vacancyTag = "searchByVacancy"

    suspend fun getTimetable(date: String, groupNumber: String): Resource<List<Lesson>> {
        return postman.get(baseUrl, timetableTag(date), arguments = mapOf("groupNumber" to groupNumber))
    }

    suspend fun getVacancy(competencies: List<String>): Resource<List<VacanciesItem>> {
        return postman.get(baseUrl, vacancyTag, arguments = mapOf("Competencies" to competencies.joinToString(";") { it }))
    }
}