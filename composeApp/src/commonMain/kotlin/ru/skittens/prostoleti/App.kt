package ru.skittens.prostoleti

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import moe.tlaster.precompose.PreComposeApp
import moe.tlaster.precompose.navigation.NavHost
import moe.tlaster.precompose.navigation.rememberNavigator
import ru.skittens.prostoleti.presentation.navigation.EnrolleeMainNavigation
import ru.skittens.prostoleti.presentation.navigation.StudentMainNavigation
import ru.skittens.prostoleti.presentation.routes.GroupRoutes
import ru.skittens.prostoleti.presentation.routes.ScreenRoutes
import ru.skittens.prostoleti.presentation.screens.start.AuthorizationScreen
import ru.skittens.prostoleti.presentation.screens.start.RegistrationScreen
import ru.skittens.prostoleti.presentation.screens.start.SplashScreen
import ru.skittens.prostoleti.presentation.theme.AppTheme

typealias NavigationFun = () -> Unit

@Composable
internal fun App() = AppTheme {
    println("Timetable test")
//    println(convert("{\"1101\":{\"group\":\"1101\",\"days\":{\"0\":{\"name\":\"ПОНЕДЕЛЬНИК\",\"lessons\":[{\"teacher\":\"\",\"second_teacher\":\"\",\"subjectType\":\"Лек\",\"week\":\"1\",\"name\":\"Военно-морская подготовка\",\"start_time\":\"09:50\",\"end_time\":\"17:00\",\"start_time_seconds\":35400,\"end_time_seconds\":61200,\"room\":\"\",\"comment\":\"\",\"form\":\"standard\",\"temp_changes\":[],\"url\":null},{\"teacher\":\"\",\"second_teacher\":\"\",\"subjectType\":\"Лек\",\"week\":\"2\",\"name\":\"Военно-морская подготовка\",\"start_time\":\"09:50\",\"end_time\":\"17:00\",\"start_time_seconds\":35400,\"end_time_seconds\":61200,\"room\":\"\",\"comment\":\"\",\"form\":\"standard\",\"temp_changes\":[],\"url\":null}]},\"1\":{\"name\":\"ВТОРНИК\",\"lessons\":[{\"teacher\":\"Гуркин Андрей Борисович\",\"second_teacher\":\"\",\"subjectType\":\"Пр\",\"week\":\"1\",\"name\":\"Правоведение\",\"start_time\":\"11:40\",\"end_time\":\"13:10\",\"start_time_seconds\":42000,\"end_time_seconds\":47400,\"room\":\"5230\",\"comment\":\"\",\"form\":\"standard\",\"temp_changes\":[],\"url\":null},{\"teacher\":\"Гуркин Андрей Борисович\",\"second_teacher\":\"\",\"subjectType\":\"Лек\",\"week\":\"2\",\"name\":\"Правоведение\",\"start_time\":\"13:40\",\"end_time\":\"15:10\",\"start_time_seconds\":49200,\"end_time_seconds\":54600,\"room\":\"1245\",\"comment\":\"\",\"form\":\"standard\",\"temp_changes\":[],\"url\":null},{\"teacher\":\"Гуркин Андрей Борисович\",\"second_teacher\":\"\",\"subjectType\":\"Лек\",\"week\":\"1\",\"name\":\"Правоведение\",\"start_time\":\"13:40\",\"end_time\":\"15:10\",\"start_time_seconds\":49200,\"end_time_seconds\":54600,\"room\":\"1245\",\"comment\":\"\",\"form\":\"standard\",\"temp_changes\":[],\"url\":null},{\"teacher\":\"Антонов Юрий Геннадьевич\",\"second_teacher\":\"\",\"subjectType\":\"Лек\",\"week\":\"2\",\"name\":\"Антенны и распространение радиоволн\",\"start_time\":\"15:30\",\"end_time\":\"17:00\",\"start_time_seconds\":55800,\"end_time_seconds\":61200,\"room\":\"1245\",\"comment\":\"\",\"form\":\"standard\",\"temp_changes\":[],\"url\":null},{\"teacher\":\"Антонов Юрий Геннадьевич\",\"second_teacher\":\"\",\"subjectType\":\"Лек\",\"week\":\"1\",\"name\":\"Антенны и распространение радиоволн\",\"start_time\":\"15:30\",\"end_time\":\"17:00\",\"start_time_seconds\":55800,\"end_time_seconds\":61200,\"room\":\"1245\",\"comment\":\"\",\"form\":\"standard\",\"temp_changes\":[],\"url\":null},{\"teacher\":\"Антонов Юрий Геннадьевич\",\"second_teacher\":\"\",\"subjectType\":\"Лек\",\"week\":\"1\",\"name\":\"Антенны и распространение радиоволн\",\"start_time\":\"17:20\",\"end_time\":\"18:50\",\"start_time_seconds\":62400,\"end_time_seconds\":67800,\"room\":\"1245\",\"comment\":\"\",\"form\":\"standard\",\"temp_changes\":[],\"url\":null}]},\"2\":{\"name\":\"СРЕДА\",\"lessons\":[{\"teacher\":\"Соколов Алексей Иванович\",\"second_teacher\":\"\",\"subjectType\":\"Пр\",\"week\":\"2\",\"name\":\"Радиоавтоматика\",\"start_time\":\"11:40\",\"end_time\":\"13:10\",\"start_time_seconds\":42000,\"end_time_seconds\":47400,\"room\":\"2427\",\"comment\":\"\",\"form\":\"standard\",\"temp_changes\":[],\"url\":null},{\"teacher\":\"Сергиенко Александр Борисович\",\"second_teacher\":\"\",\"subjectType\":\"Лек\",\"week\":\"1\",\"name\":\"Цифровая обработка сигналов\",\"start_time\":\"13:40\",\"end_time\":\"15:10\",\"start_time_seconds\":49200,\"end_time_seconds\":54600,\"room\":\"1245\",\"comment\":\"\",\"form\":\"standard\",\"temp_changes\":[],\"url\":null},{\"teacher\":\"Сергиенко Александр Борисович\",\"second_teacher\":\"\",\"subjectType\":\"Лек\",\"week\":\"2\",\"name\":\"Цифровая обработка сигналов\",\"start_time\":\"13:40\",\"end_time\":\"15:10\",\"start_time_seconds\":49200,\"end_time_seconds\":54600,\"room\":\"1245\",\"comment\":\"\",\"form\":\"standard\",\"temp_changes\":[],\"url\":null},{\"teacher\":\"Богданов Денис Валерьевич\",\"second_teacher\":\"\",\"subjectType\":\"Лаб\",\"week\":\"1\",\"name\":\"Микропроцессорные устройства\",\"start_time\":\"15:30\",\"end_time\":\"17:00\",\"start_time_seconds\":55800,\"end_time_seconds\":61200,\"room\":\"2212\",\"comment\":\"\",\"form\":\"standard\",\"temp_changes\":[],\"url\":null}]},\"3\":{\"name\":\"ЧЕТВЕРГ\",\"lessons\":[{\"teacher\":\"Гайворонский Дмитрий Вячеславович\",\"second_teacher\":\"\",\"subjectType\":\"Лек\",\"week\":\"1\",\"name\":\"Микропроцессорные устройства\",\"start_time\":\"13:40\",\"end_time\":\"15:10\",\"start_time_seconds\":49200,\"end_time_seconds\":54600,\"room\":\"1245\",\"comment\":\"\",\"form\":\"standard\",\"temp_changes\":[],\"url\":null},{\"teacher\":\"Гайворонский Дмитрий Вячеславович\",\"second_teacher\":\"\",\"subjectType\":\"Лек\",\"week\":\"2\",\"name\":\"Микропроцессорные устройства\",\"start_time\":\"13:40\",\"end_time\":\"15:10\",\"start_time_seconds\":49200,\"end_time_seconds\":54600,\"room\":\"1245\",\"comment\":\"\",\"form\":\"standard\",\"temp_changes\":[],\"url\":null},{\"teacher\":\"Апалина Полина Владимировна\",\"second_teacher\":\"\",\"subjectType\":\"Лаб\",\"week\":\"1\",\"name\":\"Радиотехнические цепи и сигналы\",\"start_time\":\"15:30\",\"end_time\":\"17:00\",\"start_time_seconds\":55800,\"end_time_seconds\":61200,\"room\":\"2222\",\"comment\":\"\",\"form\":\"standard\",\"temp_changes\":[],\"url\":null},{\"teacher\":\"Чистякова Светлана Сергеевна\",\"second_teacher\":\"\",\"subjectType\":\"Лаб\",\"week\":\"2\",\"name\":\"Радиоавтоматика\",\"start_time\":\"15:30\",\"end_time\":\"17:00\",\"start_time_seconds\":55800,\"end_time_seconds\":61200,\"room\":\"2427\",\"comment\":\"\",\"form\":\"standard\",\"temp_changes\":[],\"url\":null}]},\"4\":{\"name\":\"ПЯТНИЦА\",\"lessons\":[{\"teacher\":\"Соколов Алексей Иванович\",\"second_teacher\":\"\",\"subjectType\":\"Лек\",\"week\":\"1\",\"name\":\"Радиоавтоматика\",\"start_time\":\"09:50\",\"end_time\":\"11:20\",\"start_time_seconds\":35400,\"end_time_seconds\":40800,\"room\":\"1244\",\"comment\":\"\",\"form\":\"standard\",\"temp_changes\":[],\"url\":null},{\"teacher\":\"Соколов Алексей Иванович\",\"second_teacher\":\"\",\"subjectType\":\"Лек\",\"week\":\"2\",\"name\":\"Радиоавтоматика\",\"start_time\":\"09:50\",\"end_time\":\"11:20\",\"start_time_seconds\":35400,\"end_time_seconds\":40800,\"room\":\"1244\",\"comment\":\"\",\"form\":\"standard\",\"temp_changes\":[],\"url\":null},{\"teacher\":\"Ушаков Виктор Николаевич\",\"second_teacher\":\"\",\"subjectType\":\"Лек\",\"week\":\"1\",\"name\":\"Радиотехнические цепи и сигналы\",\"start_time\":\"11:40\",\"end_time\":\"13:10\",\"start_time_seconds\":42000,\"end_time_seconds\":47400,\"room\":\"1245\",\"comment\":\"\",\"form\":\"standard\",\"temp_changes\":[],\"url\":null},{\"teacher\":\"Ушаков Виктор Николаевич\",\"second_teacher\":\"\",\"subjectType\":\"Лек\",\"week\":\"2\",\"name\":\"Радиотехнические цепи и сигналы\",\"start_time\":\"11:40\",\"end_time\":\"13:10\",\"start_time_seconds\":42000,\"end_time_seconds\":47400,\"room\":\"1245\",\"comment\":\"\",\"form\":\"standard\",\"temp_changes\":[],\"url\":null},{\"teacher\":\"Костиков Григорий Александрович\",\"second_teacher\":\"\",\"subjectType\":\"Лаб\",\"week\":\"1\",\"name\":\"Антенны и распространение радиоволн\",\"start_time\":\"13:40\",\"end_time\":\"15:10\",\"start_time_seconds\":49200,\"end_time_seconds\":54600,\"room\":\"2233\",\"comment\":\"\",\"form\":\"standard\",\"temp_changes\":[],\"url\":null},{\"teacher\":\"Апалина Полина Владимировна\",\"second_teacher\":\"\",\"subjectType\":\"Лаб\",\"week\":\"2\",\"name\":\"Цифровая обработка сигналов\",\"start_time\":\"13:40\",\"end_time\":\"15:10\",\"start_time_seconds\":49200,\"end_time_seconds\":54600,\"room\":\"2319\",\"comment\":\"\",\"form\":\"standard\",\"temp_changes\":[],\"url\":null},{\"teacher\":\"Аронов Леонид Андреевич\",\"second_teacher\":\"\",\"subjectType\":\"Пр\",\"week\":\"1\",\"name\":\"Радиотехнические цепи и сигналы\",\"start_time\":\"15:30\",\"end_time\":\"17:00\",\"start_time_seconds\":55800,\"end_time_seconds\":61200,\"room\":\"2413\",\"comment\":\"\",\"form\":\"standard\",\"temp_changes\":[],\"url\":null},{\"teacher\":\"Аронов Леонид Андреевич\",\"second_teacher\":\"\",\"subjectType\":\"Пр\",\"week\":\"2\",\"name\":\"Радиотехнические цепи и сигналы\",\"start_time\":\"15:30\",\"end_time\":\"17:00\",\"start_time_seconds\":55800,\"end_time_seconds\":61200,\"room\":\"2413\",\"comment\":\"\",\"form\":\"standard\",\"temp_changes\":[],\"url\":null}]},\"5\":{\"name\":\"СУББОТА\",\"lessons\":[]},\"6\":{\"name\":\"ВОСКРЕСЕНЬЕ\",\"lessons\":[]}}}}", "1101"))
    PreComposeApp {
        val navigator = rememberNavigator()
        NavHost(navigator, GroupRoutes.Start.name, Modifier.fillMaxSize()) {
            group(GroupRoutes.Start.name, ScreenRoutes.Start.Splash.name) {
                scene(ScreenRoutes.Start.Splash.name) {
                    SplashScreen(
                        { navigator.navigate(ScreenRoutes.Start.Authorization.name) },
                        { navigator.navigate(ScreenRoutes.Student.MainStudent.name) },
                        { navigator.navigate(ScreenRoutes.Enrollee.MainEnrollee.name) }
                    )
                }
                scene(ScreenRoutes.Start.Authorization.name) {
                    AuthorizationScreen(
                        { navigator.navigate(ScreenRoutes.Start.Registration.name) },
                        { navigator.navigate(ScreenRoutes.Student.MainStudent.name) },
                        { navigator.navigate(ScreenRoutes.Enrollee.MainEnrollee.name) }
                    )
                }
                scene(ScreenRoutes.Start.Registration.name) {
                    RegistrationScreen(
                        { navigator.navigate(ScreenRoutes.Start.Authorization.name) },
                        { navigator.navigate(ScreenRoutes.Student.MainStudent.name) },
                        { navigator.navigate(ScreenRoutes.Enrollee.MainEnrollee.name) }
                    )
                }
            }

            scene(ScreenRoutes.Student.MainStudent.name) {
                StudentMainNavigation(navigator)
            }

            scene(ScreenRoutes.Enrollee.MainEnrollee.name) {
                EnrolleeMainNavigation(navigator)
            }
        }
    }
}