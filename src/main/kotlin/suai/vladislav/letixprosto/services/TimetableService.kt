package suai.vladislav.letixprosto.services

import suai.vladislav.letixprosto.models.Timetable
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import suai.vladislav.letixprosto.models.Semester
import suai.vladislav.letixprosto.util.Postman
import suai.vladislav.letixprosto.util.Resource

@Service
class TimetableService {
    private val baseUrl = "https://digital.etu.ru/"
    private val scheduleTag = "api/mobile/schedule"
    private val semesterTag = "api/mobile/semester"

    var postman: Postman = Postman()

    suspend fun getTimetable(groupNumber: String): Resource<HashMap<String, Timetable>> {
        return postman.get(baseUrl, scheduleTag, arguments = mapOf("groupNumber" to groupNumber))
    }

    suspend fun getSemester(): Resource<Semester>{
        return postman.get(baseUrl, semesterTag)
    }

    suspend fun obtainTimetable(groupNumber: String): Resource<Timetable> {
        return getTimetable(groupNumber).let {
            if (it is Resource.Success && it.data.containsKey(groupNumber))
                Resource.Success(it.data[groupNumber]!!)
            else
                Resource.Error(it.message.orEmpty())
        }
    }
}