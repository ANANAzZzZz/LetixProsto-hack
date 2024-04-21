package ru.skittens.prostoleti.presentation.screens.start

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.outlined.AddCircle
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.russhwolf.settings.Settings
import com.russhwolf.settings.set
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource
import prostoleti.composeapp.generated.resources.Res
import prostoleti.composeapp.generated.resources.arrow_right
import prostoleti.composeapp.generated.resources.avatar_1
import prostoleti.composeapp.generated.resources.avatar_10
import prostoleti.composeapp.generated.resources.avatar_2
import prostoleti.composeapp.generated.resources.avatar_3
import prostoleti.composeapp.generated.resources.avatar_4
import prostoleti.composeapp.generated.resources.avatar_5
import prostoleti.composeapp.generated.resources.avatar_6
import prostoleti.composeapp.generated.resources.avatar_7
import prostoleti.composeapp.generated.resources.avatar_8
import prostoleti.composeapp.generated.resources.avatar_9
import prostoleti.composeapp.generated.resources.check_circle
import prostoleti.composeapp.generated.resources.small_logo
import ru.skittens.prostoleti.NavigationFun
import ru.skittens.prostoleti.presentation.elements.HeadlineText
import ru.skittens.prostoleti.presentation.elements.SubheadText
import ru.skittens.prostoleti.presentation.elements.Title2Text

@OptIn(
    ExperimentalMaterial3Api::class, ExperimentalLayoutApi::class,
    ExperimentalFoundationApi::class
)
@Composable
fun AuthorizationScreen(
    navigateToRegistration: NavigationFun,
    navigateToMainStudent: NavigationFun,
    navigateToMainEnrollee: NavigationFun
) {
    val settings = Settings()
    val (name, setName) = remember { mutableStateOf("") }
    val (surname, setSurname) = remember { mutableStateOf("") }
    var chips by remember { mutableStateOf(List(10) { "Test $it" }) }
    var image by remember { mutableStateOf(getImages()[settings.getInt("image", 0)]) }

    Scaffold(
        Modifier.fillMaxSize().systemBarsPadding(),
        containerColor = Color.Black,
        contentColor = Color.Black
    ) {
        Column {
            Column(Modifier.fillMaxWidth().background(Color.Black)) {
                Image(
                    painterResource(Res.drawable.small_logo),
                    "",
                    Modifier.align(Alignment.CenterHorizontally)
                )
            }
            LazyColumn(
                Modifier.fillMaxSize().padding(it).padding(horizontal = 16.dp, vertical = 4.dp),
                verticalArrangement = Arrangement.spacedBy(6.dp),
            ) {
                stickyHeader {

                }
                item {
                    Box(Modifier.fillMaxWidth().padding(bottom = 24.dp)) {
                        Box(
                            Modifier.fillMaxWidth(0.4f).aspectRatio(1f).clip(CircleShape)
                                .border(4.dp, Color.White, CircleShape).padding(8.dp)
                                .align(Alignment.Center)
                        ) {
                            AnimatedContent(image) {
                                Image(
                                    painterResource(it),
                                    null,
                                    Modifier.fillMaxSize().clip(CircleShape),
                                    contentScale = ContentScale.Crop
                                )
                            }
                        }
                    }
                }
                item {
                    getImages().chunked(5).forEachIndexed { index, drawableResource ->
                        Row(
                            Modifier.fillMaxWidth().padding(bottom = 4.dp),
                            Arrangement.spacedBy(8.dp)
                        ) {
                            drawableResource.forEach {
                                ItemAvatar(it, it == image) {
                                    image = it
                                    settings["image"] = index
                                }
                            }
                        }
                    }
                }

                item {
                    Title2Text("Личные данные", Modifier.fillMaxWidth().padding(top = 16.dp))
                }

                item {
                    TextField(
                        name,
                        setName,
                        Modifier.fillMaxWidth().padding(top = 4.dp).background(
                            color = Color(0xFF2B2C34),
                            shape = RoundedCornerShape(size = 30.dp)
                        ).clip(RoundedCornerShape(size = 30.dp)),
                        placeholder = { HeadlineText("Имя", Modifier, Color(0x99FFFFFF)) },
                        colors = TextFieldDefaults.colors(
                            unfocusedContainerColor = Color(0xFF2B2C34),
                            focusedContainerColor = Color(0xFF2B2C34),
                            focusedIndicatorColor = Color(0xFF2B2C34),
                            unfocusedIndicatorColor = Color(0xFF2B2C34),
                            focusedTextColor = Color.White,
                            unfocusedTextColor = Color.White
                        )
                    )
                }

                item {
                    TextField(
                        surname,
                        setSurname,
                        Modifier.fillMaxWidth().padding(top = 4.dp).background(
                            color = Color(0xFF2B2C34),
                            shape = RoundedCornerShape(size = 30.dp)
                        ).clip(RoundedCornerShape(size = 30.dp)),
                        placeholder = { HeadlineText("Фамилия", Modifier, Color(0x99FFFFFF)) },
                        colors = TextFieldDefaults.colors(
                            unfocusedContainerColor = Color(0xFF2B2C34),
                            focusedContainerColor = Color(0xFF2B2C34),
                            focusedIndicatorColor = Color(0xFF2B2C34),
                            unfocusedIndicatorColor = Color(0xFF2B2C34),
                            focusedTextColor = Color.White,
                            unfocusedTextColor = Color.White
                        )
                    )
                }

                item {
                    Title2Text("Увлечения", Modifier.fillMaxWidth().padding(top = 8.dp))
                }

                item {
                    FlowRow(
                        Modifier.fillMaxWidth(),
                        Arrangement.spacedBy(8.dp),
                        Arrangement.spacedBy(4.dp),
                        5
                    ) {
                        Button(
                            {},
                            shape = RoundedCornerShape(size = 24.dp),
                            colors = ButtonDefaults.buttonColors(Color(0xFF70DDFF)),
                            contentPadding = PaddingValues(12.dp, 8.dp)
                        ) {
                            Icon(Icons.Outlined.AddCircle, null, tint = Color.Black)
                            SubheadText("Добавить", Modifier.padding(start = 8.dp), Color.Black)
                        }

                        chips.forEach {
                            ItemPreference(it) {
                                chips = chips - it
                            }
                        }
                    }
                }

                item {
                    Button(
                        navigateToMainStudent,
                        Modifier.fillMaxWidth()
                            .clip(RoundedCornerShape(size = 59.dp))
                            .shadow(
                                5.dp,
                                RoundedCornerShape(size = 59.dp),
                                true,
                                Color(0x8CFFFFFF),
                                Color(0x8CFFFFFF)
                            ),
                        colors = ButtonDefaults.buttonColors(Color(0xFF70DDFF))
                    ) {
                        Row(Modifier.fillMaxWidth().padding(4.dp), Arrangement.SpaceBetween) {
                            Title2Text("Создать аккаунт", Modifier, color = Color.Black)
                            Image(
                                painterResource(Res.drawable.arrow_right),
                                null,
                                Modifier.defaultMinSize(24.dp, 24.dp)
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun ItemPreference(preference: String, deletePreference: (String) -> Unit) {
    Button(
        { deletePreference(preference) },
        colors = ButtonDefaults.buttonColors(Color(0xFF2B2C34)),
        contentPadding = PaddingValues(12.dp, 8.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            SubheadText(preference, Modifier)
            Icon(Icons.Filled.Close, null, Modifier.padding(start = 8.dp), tint = Color.White)
        }
    }
}

@Composable
fun RowScope.ItemAvatar(
    drawable: DrawableResource,
    isCurrent: Boolean,
    updateChoice: () -> Unit
) {
    Box(Modifier.weight(1f).aspectRatio(1f)) {
        Image(
            painterResource(drawable),
            null,
            Modifier.fillMaxWidth().aspectRatio(1f).clip(CircleShape).clickable {
                updateChoice()
            },
            contentScale = ContentScale.Crop
        )

        androidx.compose.animation.AnimatedVisibility(
            isCurrent,
            enter = enterAnimation,
            exit = exitAnimation
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(1f)
                    .background(Color.Black.copy(0.5f), shape = CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    painterResource(Res.drawable.check_circle),
                    null,
                    Modifier.padding(16.dp).fillMaxWidth().aspectRatio(1f),
                    tint = Color(0xFF70DDFF)
                )
            }
        }
    }
}

fun getImages() = listOf(
    Res.drawable.avatar_1,
    Res.drawable.avatar_2,
    Res.drawable.avatar_3,
    Res.drawable.avatar_4,
    Res.drawable.avatar_5,
    Res.drawable.avatar_6,
    Res.drawable.avatar_7,
    Res.drawable.avatar_8,
    Res.drawable.avatar_9,
    Res.drawable.avatar_10
)

val enterAnimation = fadeIn()
val exitAnimation = fadeOut()