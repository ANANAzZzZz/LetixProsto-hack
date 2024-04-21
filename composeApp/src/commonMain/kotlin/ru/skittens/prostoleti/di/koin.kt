package ru.skittens.prostoleti.di

import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.module
import ru.skittens.prostoleti.data.source.TimetableService
import ru.skittens.prostoleti.data.util.Postman
import ru.skittens.prostoleti.presentation.MainViewModel

fun initKoin(appDeclaration: KoinAppDeclaration = {}) =
    startKoin {
        appDeclaration()
        modules(getModules())
    }

fun getModules() = listOf(
    module { single { Postman() } },
    module { single { TimetableService(get()) } },
    module { single { MainViewModel(get()) } }
)

/** Realization for iOS **/
fun initKoin() = initKoin { }