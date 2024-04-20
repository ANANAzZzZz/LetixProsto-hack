package ru.skittens.prostoleti.presentation.navigation

import androidx.compose.runtime.Composable
import moe.tlaster.precompose.navigation.Navigator
import moe.tlaster.precompose.navigation.RouteBuilder
import ru.skittens.prostoleti.presentation.routes.GroupRoutes
import ru.skittens.prostoleti.presentation.routes.ScreenRoutes
import ru.skittens.prostoleti.presentation.screens.main.profile.student.AdditionalEducationScreen
import ru.skittens.prostoleti.presentation.screens.main.profile.student.PreferencesScreen
import ru.skittens.prostoleti.presentation.screens.main.profile.student.RecordBookScreen
import ru.skittens.prostoleti.presentation.screens.main.profile.student.StudentProfileScreen
import ru.skittens.prostoleti.presentation.screens.main.profile.student.StudyPlaneScreen
import ru.skittens.prostoleti.presentation.screens.main.schedule.EventsScreen
import ru.skittens.prostoleti.presentation.screens.main.schedule.ScheduleScreen
import ru.skittens.prostoleti.presentation.screens.main.service.InternshipScreen
import ru.skittens.prostoleti.presentation.screens.main.service.SelectHousingScreen
import ru.skittens.prostoleti.presentation.screens.main.service.ServicesScreen

@Composable
fun RouteBuilder.StudentMainNavigation(navigator: Navigator) {
    group(GroupRoutes.Schedule.name, ScreenRoutes.Student.Schedule.name) {
        scene(ScreenRoutes.Student.Schedule.name) {
            ScheduleScreen { navigator.navigate(ScreenRoutes.Student.Events.name) }
        }

        scene(ScreenRoutes.Student.Events.name) {
            EventsScreen()
        }
    }

    group(GroupRoutes.ProfileStudent.name, ScreenRoutes.Student.Profile.name) {
        scene(ScreenRoutes.Student.Profile.name) {
            StudentProfileScreen(
                { navigator.navigate(ScreenRoutes.Student.StudyPlane.name) },
                { navigator.navigate(ScreenRoutes.Student.AdditionalEducation.name) },
                { navigator.navigate(ScreenRoutes.Student.RecordBook.name) },
                { navigator.navigate(ScreenRoutes.Student.Preferences.name) }
            )
        }

        scene(ScreenRoutes.Student.StudyPlane.name) {
            StudyPlaneScreen()
        }

        scene(ScreenRoutes.Student.AdditionalEducation.name) {
            AdditionalEducationScreen()
        }

        scene(ScreenRoutes.Student.RecordBook.name) {
            RecordBookScreen()
        }

        scene(ScreenRoutes.Student.Preferences.name) {
            PreferencesScreen()
        }
    }

    group(GroupRoutes.Services.name, ScreenRoutes.Student.Services.name) {
        scene(ScreenRoutes.Student.Services.name) {
            ServicesScreen(
                { navigator.navigate(ScreenRoutes.Student.Internship.name) },
                { navigator.navigate(ScreenRoutes.Student.SelectHousing.name) },
            )
        }

        scene(ScreenRoutes.Student.Internship.name) {
            InternshipScreen()
        }

        scene(ScreenRoutes.Student.SelectHousing.name) {
            SelectHousingScreen()
        }
    }
}