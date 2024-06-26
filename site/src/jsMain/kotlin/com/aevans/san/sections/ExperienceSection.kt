package com.aevans.san.sections

import androidx.compose.runtime.*
import com.aevans.san.components.ExperienceCard
import com.aevans.san.components.SectionTitle
import com.aevans.san.models.Experience
import com.aevans.san.models.Section
import com.aevans.san.util.Constants
import com.aevans.san.util.ObserveViewportEntered
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun ExperienceSection() {
//    val breakpoint = rememberBreakpoint()
    Box(
        modifier =  Modifier
            .id(Section.Experience.id)
            .maxWidth(Constants.SECTION_WIDTH.px)
            .padding(topBottom = 100.px),
        contentAlignment = Alignment.Center
    )
    {
        ExperienceContent()
    }
}
@Composable
fun ExperienceContent() {
    val breakpoint = rememberBreakpoint()
    var animatedMargin by remember {
        mutableStateOf(200.px)
    }
    ObserveViewportEntered(
        sectionId = Section.Experience.id,
        distanceFromTop = 500.0,
        onViewportEntered = {
            animatedMargin = 50.px
        }
    )
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
            modifier = Modifier
                .fillMaxWidth(
                    if (breakpoint >= Breakpoint.MD)
                        60.percent
                    else
                        90.percent
                )
                .margin(bottom = 25.px),
            section = Section.Experience
        )
        Experience.entries.forEach { experience ->
            ExperienceCard(
                breakpoint = breakpoint,
                active = experience == Experience.First,
                experience = experience,
                animatedMargin = animatedMargin
            )
        }
    }
}