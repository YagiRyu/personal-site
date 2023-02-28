package utils

enum class NavigationMenu(val link: String, val menu: String) {
    Home(
        link = "personal-site/",
        menu = "Home"
    ),
    About(
        link = "personal-site/about",
        menu = "About"
    ),
    Article(
        link = "personal-site/article",
        menu = "Article"
    ),
    Project(
        link = "personal-site/project",
        menu = "Project"
    ),
}
