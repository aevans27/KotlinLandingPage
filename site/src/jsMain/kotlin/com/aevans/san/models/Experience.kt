package com.aevans.san.models

import com.aevans.san.util.Constants.CONTEMPLOR_DESC
import com.aevans.san.util.Constants.LOREM_IPSUM_LONG
import com.aevans.san.util.Constants.LTI_DESC
import com.aevans.san.util.Constants.RADIAN_DESC

enum class Experience(
    val number: String,
    val jobPosition: String,
    val description: String,
    val company: String,
    val from: String,
    val to: String
)
{
    First(
        number = "01",
        jobPosition = "Full-Stack Developer",
        description = CONTEMPLOR_DESC,
        company = "Contemplor Software",
        from = "March 2024",
        to = "NOW",
    ),
    Second(
        number = "02",
        jobPosition = "Native Mobile Application Developer",
        description = RADIAN_DESC,
        company = "Radian",
        from = "February 2021",
        to = "December 2022",
    ),
    Third(
        number = "03",
        jobPosition = "Software Engineer",
        description = LTI_DESC,
        company = "Laser Technologies Inc.",
        from = "December 2013",
        to = "September 2020",
    )
}