import app.softwork.routingcompose.BrowserRouter
import app.softwork.routingcompose.HashRouter
import app.softwork.routingcompose.Router
import components.Header
import components.Layout
import components.MainContentLayout
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.renderComposable
import pages.About
import pages.HomeRoot
import style.AppStylesheet

fun main() {
    val navigationMenu = listOf(
        "Home",
        "About",
        "Article",
        "Project"
    )

    renderComposable(rootElementId = "root") {
        Style(AppStylesheet)
        Layout {
            Header(
                navigationMenu = navigationMenu,
            )
            MainContentLayout {
                HashRouter(initPath = "/") {
                    HomeRoot()
                    route("/about") {
                        About()
                    }
                }
            }
        }
    }
}

