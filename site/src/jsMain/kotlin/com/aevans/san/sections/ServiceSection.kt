package com.aevans.san.sections

import androidx.compose.runtime.Composable
import com.aevans.san.components.SectionTitle
import com.aevans.san.components.ServiceCard
import com.aevans.san.models.Section
import com.aevans.san.models.Service
import com.aevans.san.util.Constants
import com.varabyte.kobweb.compose.css.margin
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Col

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
    val breakpoint = rememberBreakpoint()
    Column(
        modifier = Modifier
            .fillMaxWidth(
                if (breakpoint >= Breakpoint.MD)
                    100.percent
                else
                    90.percent
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        SectionTitle(
            modifier = Modifier.fillMaxWidth().margin(bottom = 20.px),
            section = Section.Service,
            alignment = Alignment.CenterHorizontally
        )
        SimpleGrid(
            numColumns = numColumns(
                base = 1,
                sm = 2,
                md = 3
            )
        )
        {
            Service.entries.forEach {
                service ->
                ServiceCard(service = service)
            }
        }
    }
}