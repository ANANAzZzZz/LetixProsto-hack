package ru.skittens.prostoleti.presentation.screens.start

import androidx.compose.animation.core.animate
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import kotlinx.coroutines.delay
import org.jetbrains.compose.resources.painterResource
import prostoleti.composeapp.generated.resources.Res
import prostoleti.composeapp.generated.resources.logo
import ru.skittens.prostoleti.NavigationFun

@Composable
fun SplashScreen(
    navigateToAuth: NavigationFun,
    navigateToMainStudent: NavigationFun,
    navigateToMainEnrollee: NavigationFun
) {
    var fractionWidth by remember { mutableFloatStateOf(0.1f) }
    LaunchedEffect(Unit) {
        animate(0.1f, 1f, animationSpec = tween(1500)) { value, _ ->
            fractionWidth = value
        }
    }

    Column(
        Modifier.fillMaxSize().background(Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(Modifier.weight(1f))
        BoxWithConstraints(Modifier.fillMaxWidth(0.9f), contentAlignment = Alignment.Center) {
            Image(
                painterResource(Res.drawable.logo),
                "",
                Modifier.fillMaxSize().scale(fractionWidth)
            )
        }
        Spacer(Modifier.weight(1f))
    }

    if (fractionWidth == 1f) {
        LaunchedEffect(Unit) {
            delay(300)
            navigateToAuth()
        }
    }
}