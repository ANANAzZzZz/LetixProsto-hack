package ru.skittens.prostoleti.presentation

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import ru.skittens.prostoleti.data.source.TimetableService
import ru.skittens.prostoleti.data.util.DataTime
import ru.skittens.prostoleti.domain.entity.Lesson
import ru.skittens.prostoleti.domain.util.Resource

class MainViewModel(private val timetableService: TimetableService) {
    private val coroutineScope = CoroutineScope(Dispatchers.IO)
    private val _timetableMapFlow = MutableStateFlow(mapOf<String, Resource<List<Lesson>>>())
    val timetableMapFlow = _timetableMapFlow.asStateFlow()
    val currentDay = MutableStateFlow(DataTime.now().getIsoFormat())

    fun loadDate(date: String, groupNumber: String = "1101") {
        coroutineScope.launch {
            _timetableMapFlow.update {
                it.plus(date to timetableService.getTimetable(date, groupNumber))
            }
        }
    }
}