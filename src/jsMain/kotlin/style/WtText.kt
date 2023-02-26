package style

import org.jetbrains.compose.web.css.*

object WtText : StyleSheet(AppStylesheet) {
    val headerMenu by style {
        hover.style {
            color(rgb(233, 0, 100))
        }
        cursor("pointer")
        fontSize(30.px)
        fontWeight(700)
        media(mediaMaxWidth(640.px)) {
            self style {
                fontSize(20.px)
                fontWeight(700)
                AppCSSVariables.wtHomeLineHeight(48.px)
            }
        }
    }

    val homeTitle by style {
        color(rgb(233, 0, 100))
        fontSize(70.px)
        fontWeight(700)
        media(mediaMaxWidth(640.px)) {
            self style {
                fontSize(40.px)
                fontWeight(700)
            }
        }
    }

    val basic by style {
        fontSize(24.px)
        media(mediaMaxWidth(640.px)) {
            self style {
                fontSize(20.px)
                lineHeight(30.px)
            }
        }
    }
}