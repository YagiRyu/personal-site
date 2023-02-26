package components

import androidx.compose.runtime.Composable
import app.softwork.routingcompose.Router
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import style.WtContainer
import style.WtSections

@Composable
fun Header(
    navigationMenu: List<String>,
) {
    Section(attrs = {
        classes(WtSections.wtSectionBgGrayDark)
    }) {
        Div({
            classes(WtContainer.wtContainer)
            style {
                paddingTop(40.px)
                display(DisplayStyle.Flex)
                justifyContent(JustifyContent.SpaceBetween)
            }
        }) {
            navigationMenu.map { menu ->
                Span({
                    style {
                        color(Color.white)
                        fontWeight(900)
                        fontSize(30.px)
                    }
                }) {
                    Text(menu)
                }
            }
        }
    }
}
