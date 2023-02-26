package pages

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.keywords.auto
import org.jetbrains.compose.web.dom.*
import style.AppStylesheet

@Composable
fun HomeRoot(
    icons: Map<String, String>
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
                color(rgb(221, 170, 0))
                fontSize(70.px)
            }
        }) {
            Text("Hi! I'm Ryutaro Yagi👋")
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
