package com.aevans.san.sections

import androidx.compose.runtime.Composable
import com.aevans.san.components.ServiceCard
import com.aevans.san.models.Section
import com.aevans.san.models.Service
import com.aevans.san.util.Constants
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.id
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.compose.ui.modifiers.padding
import org.jetbrains.compose.web.css.px

@Composable
fun ServiceSection() {
    Box(
        modifier = Modifier
            .id(Section.Service.id)
            .maxWidth(Constants.SECTION_WIDTH.px)
            .padding(100.px),
        contentAlignment = Alignment.TopCenter
    )
    {
        ServiceContent()
    }
}

@Composable
fun ServiceContent() {
    ServiceCard(service = Service.Android)
}