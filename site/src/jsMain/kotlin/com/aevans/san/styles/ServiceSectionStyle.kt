package com.aevans.san.styles

import com.aevans.san.models.Theme
import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.cssRule
import com.varabyte.kobweb.silk.components.style.hover
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.px

val ServiceCardStyle by ComponentStyle {
    base {
        Modifier
            .border(
                2.px,
                LineStyle.Solid,
                Theme.LighterGray.rgb
            )
            .backgroundColor(Colors.White)
            .transition(
                CSSTransition(property = "border", duration = 200.ms),
                CSSTransition(property = "background", duration = 200.ms)
            )
    }

    hover {
        Modifier
            .border(
                2.px,
                LineStyle.Solid,
                Theme.Primary.rgb
            )
            .backgroundColor(Theme.Primary.rgb)
    }
    cssRule(" > #iconBox") {
        Modifier
            .backgroundColor(Colors.Transparent)
            .transition(
                CSSTransition(property = "background", duration = 200.ms)
            )
    }
    cssRule(":hover > #iconBox") {
        Modifier
            .backgroundColor(Colors.White)
    }
    cssRule(" > p") {
        Modifier
            .color(Theme.Secondary.rgb)
            .transition(
                CSSTransition(property = "color", duration = 200.ms)
            )
    }
    cssRule(":hover > p") {
        Modifier
            .color(Colors.White)
    }
}