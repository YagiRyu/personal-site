package components

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Main
import org.jetbrains.compose.web.dom.Section
import style.WtContainer

@Composable
fun Layout(content: @Composable () -> Unit) {
    Div({
        style {
            height(100.vh)
            margin(0.px)
            padding(0.px)
            backgroundColor(rgb(33, 33, 33))
        }
    }) {
        content()
    }
}

@Composable
fun MainContentLayout(content: @Composable () -> Unit) {
    Main({
        style {
            flex("1 0 auto")
            boxSizing("border-box")
        }
    }) {
        content()
    }
}

@Composable
fun ContainerInSection(
    sectionThemeStyleClass: String? = null,
    content: @Composable () -> Unit
) {
    Section({

    }) {
        Div({
            classes(WtContainer.wtContainer)
        }) {
            content()
        }
    }
}
