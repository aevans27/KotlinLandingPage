package com.aevans.san.models

import com.aevans.san.util.Res

enum class Achievement(
    val icon: String,
    val number: Int,
    val description: String
)
{
    Completed(
        icon = Res.Icon.checkmark,
        number = 40,
        description = "Completed Projects"
    ),
    Active(
        icon = Res.Icon.shield,
        number = 5,
        description = "Active Projects"
    ),
    Satisfied(
        icon = Res.Icon.happy,
        number = 30,
        description = "Satisfied Clients"
    ),
    Team(
        icon = Res.Icon.user,
        number = 10,
        description = "Team Members"
    )
}