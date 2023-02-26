import app.softwork.routingcompose.BrowserRouter
import app.softwork.routingcompose.HashRouter
import app.softwork.routingcompose.Router
import components.Header
import components.Layout
import components.MainContentLayout
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.renderComposable
import pages.*
import style.AppStylesheet

fun main() {
    renderComposable(rootElementId = "root") {
        App()
    }
}
