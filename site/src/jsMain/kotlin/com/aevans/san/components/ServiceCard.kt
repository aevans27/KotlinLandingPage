package com.aevans.san.components

import androidx.compose.runtime.Composable
import com.aevans.san.models.Service
import com.aevans.san.models.Theme
import com.aevans.san.styles.AboutTextStyle
import com.aevans.san.util.Constants
import com.varabyte.kobweb.compose.css.FontStyle
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun ServiceCard(service: Service) {
    Column(
        modifier = Modifier
            .maxWidth(300.px)
            .margin(all = 20.px)
            .padding(all = 20.px)
    )
    {
        Box(
            modifier = Modifier
                .padding(all = 10.px)
                .margin(bottom = 20.px)
                .borderColor(Theme.LighterGray.rgb)
                .borderRadius(
                    topLeft = 20.px,
                    topRight = 20.px,
                    bottomLeft = 20.px,
                    bottomRight = 0.px
                )
        )
        {
             Image(
                 modifier = Modifier.size(40.px),
                 src = service.icon,
                 description = service.imageDesc
             )
        }
        P(
            attrs = Modifier
                .fillMaxWidth()
                .margin(top = 0.px, bottom = 10.px)
                .fontFamily(Constants.FONT_FAMILY)
                .fontSize(18.px)
                .fontWeight(FontWeight.Bold)
                .color(Theme.Secondary.rgb)
                .toAttrs()
        ) {
            Text(service.title)
        }
        P(
            attrs = Modifier
                .fillMaxWidth()
                .margin(top = 0.px, bottom = 0.px)
                .fontFamily(Constants.FONT_FAMILY)
                .fontSize(14.px)
                .fontWeight(FontWeight.Normal)
                .color(Theme.Secondary.rgb)
                .toAttrs()
        ) {
            Text(service.description)
        }
    }
}