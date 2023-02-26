package style

import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.selectors.CSSSelector

object AppCSSVariables {
    val wtColorGreyLight by variable<CSSColorValue>()
    val wtColorGreyDark by variable<CSSColorValue>()

    val wtOffsetTopUnit by variable<CSSUnitValue>()
    val wtHorizontalLayoutGutter by variable<CSSUnitValue>()
    val wtFlowUnit by variable<CSSUnitValue>()

    val wtHomeFontSize by variable<CSSUnitValue>()
    val wtHomeLineHeight by variable<CSSUnitValue>()
    val wtSubtitle2FontSize by variable<CSSUnitValue>()
    val wtSubtitle2LineHeight by variable<CSSUnitValue>()
    val wtH2FontSize by variable<CSSUnitValue>()
    val wtH2LineHeight by variable<CSSUnitValue>()
    val wtH3FontSize by variable<CSSUnitValue>()
    val wtH3LineHeight by variable<CSSUnitValue>()

    val wtColCount by variable<StylePropertyNumber>()
}

object AppStylesheet : StyleSheet() {

    val composeLogo by style {
        maxWidth(200.px)
        maxHeight(200.px)
        borderRadius(50.percent)
    }

    val socialIcon by style {
        maxWidth(30.px)
        maxHeight(30.px)
        marginRight(40.px)
    }
    init {
        "label, a, button" style {
            property(
                "font-family",
                "system-ui,-apple-system,BlinkMacSystemFont,Segoe UI,Roboto,Oxygen,Ubuntu,Cantarell,Droid Sans,Helvetica Neue,Arial,sans-serif"
            )
        }

        universal style {
            margin(0.px)
            color(Color.white)
            property("font-family", "Gill Sans")
        }

        attrContains(
            name = "class"
        ) style {
            boxSizing("border-box")
        }
    }
}
