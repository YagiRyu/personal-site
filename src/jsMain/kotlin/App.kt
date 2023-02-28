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
    BrowserRouter(initPath = "/personal-site") {
        val router = Router.current

        Layout {
            Header(navigationMenu = navigationMenu)
            MainContentLayout {
                route("/personal-site") {
                    HomeRoot()
                }
                route("/personal-site/about") {
                    About()
                }
                route("/personal-site/article") {
                    Article()
                }
                route("/personal-site/project") {
                    Project()
                }
                noMatch {
                    PageNotFound()
                }
            }
        }
    }
}
