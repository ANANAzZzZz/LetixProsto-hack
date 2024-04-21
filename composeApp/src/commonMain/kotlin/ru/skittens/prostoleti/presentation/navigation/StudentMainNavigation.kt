package ru.skittens.prostoleti.presentation.navigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import moe.tlaster.precompose.navigation.NavHost
import moe.tlaster.precompose.navigation.Navigator
import moe.tlaster.precompose.navigation.RouteBuilder
import moe.tlaster.precompose.navigation.rememberNavigator
import moe.tlaster.precompose.navigation.transition.NavTransition
import org.jetbrains.compose.resources.painterResource
import prostoleti.composeapp.generated.resources.Res
import prostoleti.composeapp.generated.resources.calendar
import prostoleti.composeapp.generated.resources.category
import prostoleti.composeapp.generated.resources.user_2
import ru.skittens.prostoleti.domain.entity.VacanciesItem
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

fun RouteBuilder.StudentMainNavigation(navigator: Navigator) {
    group(GroupRoutes.ScheduleStudent.name, ScreenRoutes.Student.Schedule.name) {
        scene(ScreenRoutes.Student.Schedule.name) {
            ScheduleScreen(
                { navigator.navigate(ScreenRoutes.Student.Events.name) },
                { navigator.navigate(GroupRoutes.ServicesStudent.name) },
                { navigator.navigate(GroupRoutes.ProfileStudent.name) })
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

    group(GroupRoutes.ServicesStudent.name, ScreenRoutes.Student.Services.name) {
        scene(ScreenRoutes.Student.Services.name) {
            ServicesScreen(
                { navigator.navigate(ScreenRoutes.Student.Internship.name) },
                { navigator.navigate(ScreenRoutes.Student.SelectHousing.name) },
            )
        }

        scene(ScreenRoutes.Student.Internship.name) {
            InternshipScreen()
        }

        scene(ScreenRoutes.Student.Vacancies.name){
            VacanciesScreen()
        }

        scene(ScreenRoutes.Student.SelectHousing.name) {
            SelectHousingScreen()
        }
    }
}

@Composable
fun MainNavigation() {
    val navigator = rememberNavigator()
    val currentEntry = navigator.currentEntry.collectAsState(null).value?.route?.route.orEmpty()

    Scaffold(
        contentColor = Color.Black,
        containerColor = Color.Black,
        modifier = Modifier.fillMaxSize().systemBarsPadding(),
        bottomBar = {
            NavigationBar(containerColor = Color.Black, contentColor = Color.Black) {
                NavigationBarItem(
                    currentEntry == GroupRoutes.ScheduleStudent.name,
                    { navigator.navigate(GroupRoutes.ScheduleStudent.name) },
                    { Image(painterResource(Res.drawable.calendar), null) }
                )
                NavigationBarItem(
                    currentEntry == GroupRoutes.ServicesStudent.name,
                    { navigator.navigate(GroupRoutes.ServicesStudent.name) },
                    { Image(painterResource(Res.drawable.category), null) }
                )
                NavigationBarItem(
                    currentEntry == GroupRoutes.ProfileStudent.name,
                    { navigator.navigate(GroupRoutes.ProfileStudent.name) },
                    { Image(painterResource(Res.drawable.user_2), null) }
                )
            }
        }
    ) {
        NavHost(
            navigator = navigator,
            navTransition = NavTransition(),
            initialRoute = GroupRoutes.ScheduleStudent.name
        ) {
            StudentMainNavigation(navigator)
        }
    }
}