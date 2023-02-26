package components

import androidx.compose.runtime.Composable
import app.softwork.routingcompose.Router
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import style.WtContainer
import style.WtSections
import style.WtText
import utils.NavigationMenu

@Composable
fun Header(
    navigationMenu: List<NavigationMenu>,
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
                    classes(WtText.headerMenu)
                }) {
                    A(
                        href = menu.link
                    ) {
                        Text(menu.menu)
                    }
                }
            }
        }
    }
}
