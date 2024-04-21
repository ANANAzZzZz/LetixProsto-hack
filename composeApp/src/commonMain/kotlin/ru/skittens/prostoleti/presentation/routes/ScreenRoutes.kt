package ru.skittens.prostoleti.presentation.routes

sealed class ScreenRoutes {

    enum class Start {
        Splash,
        Registration,
        Authorization
    }
    enum class Student {
        MainStudent,
        Schedule,
        Events,
        Profile,
        StudyPlane,
        AdditionalEducation,
        RecordBook,
        Preferences,
        Services,
        Internship,
        Vacancies,
        SelectHousing
    }

    enum class Enrollee {
        MainEnrollee,
        Calculator,
        StudyPrograms,
        Professions,
        Admission,
        Infrastructure,
        AdditionalEducation,
        SelectHousing,
        Profile,
        Preferences,
        SetPoints
    }
}