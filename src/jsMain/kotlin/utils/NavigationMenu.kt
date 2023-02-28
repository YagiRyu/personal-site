package utils

enum class NavigationMenu(val link: String, val menu: String) {
    Home(
        link = "/",
        menu = "Home"
    ),
    About(
        link = "/about",
        menu = "About"
    ),
    Article(
        link = "/article",
        menu = "Article"
    ),
    Project(
        link = "/project",
        menu = "Project"
    ),
}
