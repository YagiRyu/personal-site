package pages

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

@Composable
fun PageNotFound() {
    Div({
        style {
            display(DisplayStyle.Flex)
            justifyContent(JustifyContent.Center)
            alignItems(AlignItems.Center)
            height(90.vh)
            property("margin-top", "auto")
            property("margin-bottom", "auto")
        }
    }) {
        Span({
            style {
                fontSize(50.px)
            }
        }) {
            Text("Page not found.....\uD83E\uDD72")
        }
    }
}