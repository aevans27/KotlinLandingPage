package com.aevans.san.models

import com.aevans.san.util.Res

enum class Portfolio(
    val image: String,
    val title: String,
    val description: String,
    val github_link: String
)
{
    One(
        image = Res.Image.mon_recette,
        title = "Mon-Risette",
        description = "Recipe simplifier",
        github_link = "https://github.com/orgs/mon-recette/repositories"
    ),
    Two(
        image = Res.Image.web_page,
        title = "Kotlin Web Page",
        description = "This websites repo",
        github_link = "https://github.com/aevans27/KotlinLandingPage"
    ),
    Three(
        image = Res.Image.sweater_weather,
        title = "Sweater Weather",
        description = "Ruby application checking the weather",
        github_link = "https://github.com/aevans27/Sweater_Weather"
    ),
    Four(
        image = Res.Image.authentication,
        title = "Authentication",
        description = "Trying out authentication options",
        github_link = "https://github.com/aevans27/authentication-7"
    ),
    Five(
        image = Res.Image.tea_subscription,
        title = "Tea Subscription",
        description = "App using relational database",
        github_link = "https://github.com/aevans27/tea_subscription_service"
    )
}