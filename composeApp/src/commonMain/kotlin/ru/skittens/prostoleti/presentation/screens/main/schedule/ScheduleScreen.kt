package ru.skittens.prostoleti.presentation.screens.main.schedule

import androidx.compose.animation.AnimatedContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.painterResource
import org.koin.compose.koinInject
import prostoleti.composeapp.generated.resources.Res
import prostoleti.composeapp.generated.resources.small_logo
import prostoleti.composeapp.generated.resources.sparkles
import ru.skittens.prostoleti.data.util.DataTime
import ru.skittens.prostoleti.NavigationFun
import ru.skittens.prostoleti.presentation.MainViewModel
import ru.skittens.prostoleti.presentation.elements.Caption1Text
import ru.skittens.prostoleti.presentation.elements.LargeTitleText
import ru.skittens.prostoleti.presentation.elements.Title3Text

@Composable
fun ScheduleScreen(navigateToEvents: NavigationFun, mainViewModel: MainViewModel = koinInject()) {
    var selectedItem by remember { mutableIntStateOf(0) }
    val today = DataTime.now()
    val dates = List(7) { today.goToNNextDay(it) }

    Scaffold(Modifier.fillMaxSize().systemBarsPadding(), topBar = {
        Column(Modifier.fillMaxWidth().background(Color.Black).padding(horizontal = 16.dp)) {
            Image(
                painterResource(Res.drawable.small_logo),
                "",
                Modifier.align(Alignment.CenterHorizontally)
            )
            Row(Modifier.fillMaxWidth(), Arrangement.SpaceBetween) {
                LargeTitleText("Расписание", Modifier)
                IconButton(
                    {},
                    Modifier.clip(RoundedCornerShape(size = 34.dp)),
                    colors = IconButtonDefaults.iconButtonColors(Color(0xFF70DDFF))
                ) {
                    Icon(
                        painterResource(Res.drawable.sparkles),
                        null,
                        Modifier.padding(11.dp, 8.dp)
                    )
                }
            }
        }
    }, contentColor = Color.Black, containerColor = Color.Black) {
        Column(Modifier.fillMaxSize().padding(it)) {
            Row(
                Modifier.fillMaxWidth().padding(top = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                dates.forEachIndexed { index, date ->
                    AnimatedContent(selectedItem == index, Modifier.weight(1f)) {
                        Card(
                            { selectedItem = index },
                            Modifier
                                .weight(1f),
                            shape = RoundedCornerShape(19.dp),
                            colors = CardDefaults.cardColors(
                                if (it)
                                    Color(0xFF70DDFF)
                                else
                                    Color(0xFF2B2C34)
                            )
                        ) {
                            Column(
                                Modifier.fillMaxWidth().padding(12.dp, 6.dp),
                                Arrangement.Center,
                                Alignment.CenterHorizontally
                            ) {
                                Caption1Text(
                                    date.getShortcutDayOfWeek(),
                                    Modifier.align(Alignment.CenterHorizontally),
                                    if (it)
                                        Color.Black
                                    else
                                        Color.White
                                )
                                Title3Text(
                                    date.dayOfMonth.toString(),
                                    Modifier.align(Alignment.CenterHorizontally),
                                    if (it)
                                        Color.Black
                                    else
                                        Color.White
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}