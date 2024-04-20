package ru.skittens.prostoleti.presentation.navigation

import androidx.compose.runtime.Composable
import moe.tlaster.precompose.navigation.Navigator
import moe.tlaster.precompose.navigation.RouteBuilder
import ru.skittens.prostoleti.presentation.routes.GroupRoutes
import ru.skittens.prostoleti.presentation.routes.ScreenRoutes
import ru.skittens.prostoleti.presentation.screens.main.admission.AdditionalEducationScreen
import ru.skittens.prostoleti.presentation.screens.main.admission.AdmissionScreen
import ru.skittens.prostoleti.presentation.screens.main.admission.InfrastructureScreen
import ru.skittens.prostoleti.presentation.screens.main.calculator.CalculatorScreen
import ru.skittens.prostoleti.presentation.screens.main.calculator.ProfessionsScreen
import ru.skittens.prostoleti.presentation.screens.main.calculator.StudyProgramsScreen
import ru.skittens.prostoleti.presentation.screens.main.profile.enrollee.EnrolleeProfileScreen
import ru.skittens.prostoleti.presentation.screens.main.profile.enrollee.SetPointsScreen
import ru.skittens.prostoleti.presentation.screens.main.profile.student.PreferencesScreen
import ru.skittens.prostoleti.presentation.screens.main.service.SelectHousingScreen

@Composable
fun RouteBuilder.EnrolleeMainNavigation(navigator: Navigator) {
    group(GroupRoutes.Calculator.name, ScreenRoutes.Enrollee.Calculator.name) {
        scene(ScreenRoutes.Enrollee.Calculator.name) {
            CalculatorScreen { navigator.navigate(ScreenRoutes.Enrollee.StudyPrograms.name) }
        }

        scene(ScreenRoutes.Enrollee.StudyPrograms.name) {
            StudyProgramsScreen { navigator.navigate(ScreenRoutes.Enrollee.Preferences.name) }
        }

        scene(ScreenRoutes.Enrollee.Professions.name) {
            ProfessionsScreen()
        }
    }

    group(GroupRoutes.Admission.name, ScreenRoutes.Enrollee.Admission.name) {
        scene(ScreenRoutes.Enrollee.Admission.name) {
            AdmissionScreen(
                { navigator.navigate(ScreenRoutes.Enrollee.Infrastructure.name) },
                { navigator.navigate(ScreenRoutes.Enrollee.AdditionalEducation.name) },
                { navigator.navigate(ScreenRoutes.Enrollee.SelectHousing.name) }
            )
        }

        scene(ScreenRoutes.Enrollee.Infrastructure.name) {
            InfrastructureScreen()
        }

        scene(ScreenRoutes.Enrollee.AdditionalEducation.name) {
            AdditionalEducationScreen()
        }

        scene(ScreenRoutes.Enrollee.SelectHousing.name) {
            SelectHousingScreen()
        }
    }

    group(GroupRoutes.ProfileEnrollee.name, ScreenRoutes.Enrollee.Profile.name) {
        scene(ScreenRoutes.Enrollee.Profile.name) {
            EnrolleeProfileScreen(
                { navigator.navigate(ScreenRoutes.Enrollee.Preferences.name) },
                { navigator.navigate(ScreenRoutes.Enrollee.SetPoints.name) }
            )
        }

        scene(ScreenRoutes.Enrollee.Preferences.name) {
            PreferencesScreen()
        }

        scene(ScreenRoutes.Enrollee.SetPoints.name) {
            SetPointsScreen()
        }
    }
}