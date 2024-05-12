package com.aevans.san.models

import com.aevans.san.util.Constants.ANDROID_SERVICE
import com.aevans.san.util.Constants.BACKEND_SERVICE
import com.aevans.san.util.Constants.CONTRACT_SERVICE
import com.aevans.san.util.Constants.DATA_SERVICE
import com.aevans.san.util.Constants.IOS_SERVICE
import com.aevans.san.util.Constants.LOREM_IPSUM_SHORTEST
import com.aevans.san.util.Constants.WEB_SERVICE
import com.aevans.san.util.Res

enum class Service(
    val icon: String,
    val imageDesc: String,
    val title: String,
    val description: String
)
{
    Android(
        icon = Res.Icon.android,
        imageDesc = "Android Icon",
        title = "Android Development",
        description = ANDROID_SERVICE
    ),
    IOS(
        icon = Res.Icon.apple,
        imageDesc = "Apple Icon",
        title = "iOS Development",
        description = IOS_SERVICE
    ),
    Web(
        icon = Res.Icon.web,
        imageDesc = "Desktop Icon",
        title = "Web Development",
        description = WEB_SERVICE
    ),
    Backend(
        icon = Res.Icon.design,
        imageDesc = "Pen Icon",
        title = "Backend",
        description = BACKEND_SERVICE
    ),
    Data(
        icon = Res.Icon.business,
        imageDesc = "Chart Icon",
        title = "Data Analysis",
        description = DATA_SERVICE
    ),
    Contract(
        icon = Res.Icon.seo,
        imageDesc = "Megaphone Icon",
        title = "Contracts",
        description = CONTRACT_SERVICE
    )
}