import androidx.compose.runtime.Composable
import app.softwork.routingcompose.BrowserRouter
import app.softwork.routingcompose.Router
import components.Header
import components.Layout
import components.MainContentLayout
import org.jetbrains.compose.web.css.Style
import pages.*
import style.AppStylesheet
import utils.NavigationMenu

@Composable
fun App() {
    val navigationMenu = listOf(
        NavigationMenu.Home,
        NavigationMenu.About,
        NavigationMenu.Article,
        NavigationMenu.Project
    )

    Style(AppStylesheet)
    BrowserRouter(initPath = "/") {
        Layout {
            Header(navigationMenu = navigationMenu)
            MainContentLayout {
                route("/") {
                    HomeRoot()
                }
                route("/about") {
                    About()
                }
                route("/article") {
                    Article()
                }
                route("/project") {
                    Project()
                }
                noMatch {
                    PageNotFound()
                }
            }
        }
    }
}
