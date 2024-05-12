package com.aevans.san.pages

import androidx.compose.runtime.*
import com.aevans.san.components.BackToTopButton
import com.aevans.san.components.OverflowMenu
import com.aevans.san.sections.*
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page
import org.jetbrains.compose.web.dom.Text
import com.varabyte.kobweb.worker.rememberWorker
import com.aevans.san.worker.EchoWorker
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column

@Page
@Composable
fun HomePage() {
//    val worker = rememberWorker { EchoWorker { output -> console.log("Echoed: $output") } }
//    LaunchedEffect(Unit) {
//        worker.postInput("Hello, worker!")
//    }
var menuOpened by remember {
    mutableStateOf(false)
}
    Box(
        modifier = Modifier
            .fillMaxSize()
    )
    {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            MainSection(onMenuClicked = {
                menuOpened = true
            })
            AboutSection()
            ServiceSection()
//            PortfolioSection() Update for own repo
            AchievementsSection()
//            TestimonialSection()
            ExperienceSection()
            ContactSection()
            FooterSection()
        }
        BackToTopButton()
        if (menuOpened) {
            OverflowMenu(onMenuClosed = {
                menuOpened = false
            })
        }
    }
}
