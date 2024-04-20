@file:OptIn(org.jetbrains.compose.resources.InternalResourceApi::class)

package prostoleti.composeapp.generated.resources

import kotlin.OptIn
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.FontResource

@ExperimentalResourceApi
private object Font0 {
  public val IndieFlower_Regular: FontResource by 
      lazy { init_IndieFlower_Regular() }
}

@ExperimentalResourceApi
internal val Res.font.IndieFlower_Regular: FontResource
  get() = Font0.IndieFlower_Regular

@ExperimentalResourceApi
private fun init_IndieFlower_Regular(): FontResource = org.jetbrains.compose.resources.FontResource(
  "font:IndieFlower_Regular",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(), "font/IndieFlower-Regular.ttf"),
    )
)
