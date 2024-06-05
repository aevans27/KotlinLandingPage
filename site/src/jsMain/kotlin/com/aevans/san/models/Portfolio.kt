package com.aevans.san.models

import com.aevans.san.util.Res

enum class Portfolio(
    val image: String,
    val title: String,
    val description: String
)
{
    One(
        image = Res.Image.mon_recette,
        title = "Mon-Risette",
        description = "Recipe simplifier"
    ),
    Two(
        image = Res.Image.web_page,
        title = "Kotlin Web Page",
        description = "This websites repo"
    ),
    Three(
        image = Res.Image.sweater_weather,
        title = "Sweater Weather",
        description = "Ruby application checking the weather"
    ),
    Four(
        image = Res.Image.authentication,
        title = "Authentication",
        description = "Trying out authentication options"
    ),
    Five(
        image = Res.Image.tea_subscription,
        title = "Tea Subscription",
        description = "App using relational database"
    )
}