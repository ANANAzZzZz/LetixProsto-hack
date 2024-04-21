import androidx.compose.ui.window.ComposeUIViewController
import ru.skittens.prostoleti.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController { App() }

fun initKoin() = ru.skittens.prostoleti.di.initKoin {}