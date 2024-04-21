package ru.skittens.prostoleti.presentation.screens.main.service

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.painterResource
import prostoleti.composeapp.generated.resources.Res
import prostoleti.composeapp.generated.resources.small_logo
import prostoleti.composeapp.generated.resources.sparkles
import ru.skittens.prostoleti.NavigationFun
import ru.skittens.prostoleti.presentation.elements.BodyText
import ru.skittens.prostoleti.presentation.elements.LargeTitleText
import ru.skittens.prostoleti.presentation.elements.Title2Text

@Composable
fun ServicesScreen(navigateToInternship: NavigationFun, navigateToSelectHousing: NavigationFun) {
    Scaffold(Modifier.fillMaxSize().systemBarsPadding(), topBar = {
        Column(Modifier.fillMaxWidth().background(Color.Black).padding(horizontal = 16.dp)) {
            Image(
                painterResource(Res.drawable.small_logo),
                "",
                Modifier.align(Alignment.CenterHorizontally)
            )
            Row(Modifier.fillMaxWidth(), Arrangement.SpaceBetween) {
                LargeTitleText("Сервисы", Modifier)
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
            BodyText("Учеба и карьера", Modifier.fillMaxWidth())

            Row(Modifier.fillMaxWidth(), Arrangement.spacedBy(8.dp)) {
                Card(
                    Modifier.weight(1f).aspectRatio(1f),
                    colors = CardDefaults.cardColors(Color(0xFF85FFA0), Color(0xFF85FFA0)),
                    shape = RoundedCornerShape(24.dp, 4.dp, 24.dp, 4.dp)
                ) {
                    Title2Text("Вакансии", Modifier.padding(16.dp), Color.Black)
                }

                Card(
                    Modifier.weight(1f).aspectRatio(1f),
                    colors = CardDefaults.cardColors(Color(0xFF70DDFF), Color(0xFF70DDFF)),
                    shape = RoundedCornerShape(4.dp, 24.dp, 24.dp, 24.dp)
                ) {
                    Title2Text("Вакансии", Modifier.padding(16.dp), Color.Black)
                }
            }
        }
    }
}