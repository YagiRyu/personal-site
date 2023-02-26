package pages

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

@Composable
fun Article() {
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
            Text("Coming soon.....\uD83D\uDE80")
        }
    }
}