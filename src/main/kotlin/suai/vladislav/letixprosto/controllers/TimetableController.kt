package suai.vladislav.letixprosto.controllers

import com.google.gson.Gson
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import lombok.RequiredArgsConstructor
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.function.ServerResponse
import org.springframework.web.servlet.function.ServerResponse.async
import suai.vladislav.letixprosto.models.Timetable
import suai.vladislav.letixprosto.services.TimetableService


@RestController
@RequiredArgsConstructor
class TimetableController {

    @Autowired
    private lateinit var timetableService: TimetableService

    @GetMapping("/test")
    fun test(): Timetable? {
        return runBlocking { timetableService.obtainTimetable("1101").data }
//        return hashMapOf("test" to 1)
    }
}