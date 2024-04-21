package suai.vladislav.letixprosto.controllers

import com.google.gson.Gson
import io.ktor.events.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.runBlocking
import kotlinx.datetime.LocalTime
import kotlinx.datetime.atDate
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import lombok.RequiredArgsConstructor
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.query.Param
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import suai.vladislav.letixprosto.models.Lesson
import suai.vladislav.letixprosto.models.LessonEvent
import suai.vladislav.letixprosto.models.Road
import suai.vladislav.letixprosto.models.Timetable
import suai.vladislav.letixprosto.services.ResponseEventsService
import suai.vladislav.letixprosto.services.TimetableService
import suai.vladislav.letixprosto.services.UserService
import suai.vladislav.letixprosto.util.DataTime
import kotlin.time.Duration
import kotlin.time.Duration.Companion.days
import kotlin.time.Duration.Companion.hours
import kotlin.time.Duration.Companion.minutes


@RestController
@RequiredArgsConstructor
class TimetableController {

    @Autowired
    private lateinit var timetableService: TimetableService

    @Autowired
    private lateinit var eventsService: ResponseEventsService

    @GetMapping("/test")
    fun test(): Timetable? {
        return runBlocking { timetableService.obtainTimetable("1101").data }
    }

    @GetMapping("/getPlanOnDay/{date}")
    fun getPlanOnDay(@PathVariable(value = "date") date: String, @RequestParam groupNumber: String): List<Lesson> {
        val timetable = runBlocking { timetableService.obtainTimetable(groupNumber) }
        val events = eventsService.allResponse.map { it.results }.flatten().map { it }
        val semester = runBlocking { timetableService.getSemester().data }
        val thisScheduleWeek =
            (DataTime.now().getWeek() - (semester?.startDate?.let { DataTime.parse(it.substring(0, 16)) }
                ?: DataTime.now()).getWeek()) % 2 + 1
        println(thisScheduleWeek)

        return (timetable.data?.days?.getAll(
            thisScheduleWeek.toString(),
            DataTime.parseFromTimeTable(date).getStartWeek()
        ).orEmpty()
            .filter { it.dateTime.getIsoFormat() == date }
//                + events.filter { it.dateTime.getIsoFormat() == date }
                ).sortedBy { it.dateTime.getDateAndTime() }
    }

    fun calculateDifferences(list: List<Lesson>): List<Road> {
        val differences = mutableListOf<Road>()

        for (i in 1 until list.size) {
            val endTime = list[i - 1].end_time.split(":").map { it.toInt() }
            val startTime = list[i].start_time.split(":").map { it.toInt() }
            val diff =
                (startTime.first().hours + startTime.last().minutes) - (endTime.first().hours + endTime.last().minutes)
//            if (diff.inWholeMinutes > 15)
//                differences.add()
        }

        return differences
    }
}