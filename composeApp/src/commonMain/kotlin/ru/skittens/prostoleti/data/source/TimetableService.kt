package ru.skittens.prostoleti.data.source

import ru.skittens.prostoleti.data.util.Postman
import ru.skittens.prostoleti.domain.entity.Lesson
import ru.skittens.prostoleti.domain.util.Resource

class TimetableService(private val postman: Postman) {
    val baseUrl = "http://localhost:8080/"
    private fun timetableTag(date: String) = "getPlanOnDay/$date"

    suspend fun getTimetable(date: String, groupNumber: String): Resource<List<Lesson>> {
        return postman.get(baseUrl, timetableTag(groupNumber))
    }
}