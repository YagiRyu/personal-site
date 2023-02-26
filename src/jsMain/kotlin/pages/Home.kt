package pages

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import style.AppStylesheet

@Composable
fun HomeRoot() {
    val text = listOf(
        "I'm a software engineer in Japan\uD83C\uDDEF\uD83C\uDDF5",
        "I mainly develop Android applications and I'm also interested in developing iOS applications\uD83E\uDDD1\uD83C\uDFFB\u200D\uD83D\uDCBB",
        "I love Kotlin and mobile app development\uD83D\uDC9A",
    )

    val icons = mapOf(
        "twitter.png" to "https://twitter.com/yagiryuuu",
        "github.png" to "https://github.com/YagiRyu",
        "zenn.png" to "https://zenn.dev/yagiryuuu",
    )

    Home(
        text = text,
        icons = icons
    )
}

@Composable
private fun Home(
    text: List<String>,
    icons: Map<String, String>,
) {
    Div({
        style {
            display(DisplayStyle.Flex)
            justifyContent(JustifyContent.Center)
            alignItems(AlignItems.Center)
            flexDirection(FlexDirection.Column)
            height(90.vh)
            property("margin-top", "auto")
            property("margin-bottom", "auto")
        }
    }) {
        Img(
            src = "sun.jpg",
            attrs = {
                classes(AppStylesheet.composeLogo)
            }
        )
        Span(attrs = {
            style {
                color(rgb(233, 0, 100))
                fontSize(70.px)
            }
        }) {
            Text("Hi! I'm Ryutaro Yagi👋")
        }
        text.map {
            Span(attrs = {
                style {
                    color(Color.white)
                    fontSize(20.px)
                }
            }) {
                Text(it)
            }
        }
        Div({
            style {
                display(DisplayStyle.Flex)
                justifyContent(JustifyContent.Center)
                alignItems(AlignItems.Center)
                marginTop(20.px)
            }
        }) {
            icons.map { icon ->
                A(href = icon.value) {
                    Img(
                        src = icon.key,
                        attrs = {
                            classes(AppStylesheet.socialIcon)
                        }
                    )
                }
            }
        }
    }
}
