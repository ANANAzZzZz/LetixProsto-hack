@file:OptIn(org.jetbrains.compose.resources.InternalResourceApi::class)

package prostoleti.composeapp.generated.resources

import kotlin.OptIn
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.FontResource

@ExperimentalResourceApi
private object Font0 {
  public val MPLUSRounded1c: FontResource by 
      lazy { init_MPLUSRounded1c() }
}

@ExperimentalResourceApi
internal val Res.font.MPLUSRounded1c: FontResource
  get() = Font0.MPLUSRounded1c

@ExperimentalResourceApi
private fun init_MPLUSRounded1c(): FontResource = org.jetbrains.compose.resources.FontResource(
  "font:MPLUSRounded1c",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(), "font/MPLUSRounded1c.ttf"),
    )
)
