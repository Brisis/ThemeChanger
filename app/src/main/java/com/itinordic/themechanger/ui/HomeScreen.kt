package com.itinordic.themechanger.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.itinordic.themechanger.data.BottomMenuItem
import com.itinordic.themechanger.R
import com.itinordic.themechanger.ui.data.Feature
import com.itinordic.themechanger.ui.data.ThemeChip
import com.itinordic.themechanger.ui.sections.*
import com.itinordic.themechanger.ui.theme.*

val theme = MaterialTheme


@ExperimentalFoundationApi
@Composable
fun HomeScreen(){

    Box(modifier = Modifier
        .background(theme.colors.background)
        .fillMaxSize()) {
        Column {
            GreetingSection()
            ChipSection(
                chips = listOf(
                    ThemeChip(
                        "Primary Theme",
                        "Light",
                    ),
                    ThemeChip(
                        "Dark Theme",
                        "Dark",
                    ),
                    ThemeChip(
                        "Green Theme",
                        "Green",
                    ),
                    ThemeChip(
                        "Orange Theme",
                        "Orange",
                    ),
                )
            )
            CurrentMeditation()
            FeatureSection(
                features = listOf(
                Feature(
                    title = "Sleep meditation",
                    R.drawable.ic_headphone,
                    BlueViolet1,
                    BlueViolet2,
                    BlueViolet3
                ),
                Feature(
                    title = "Tips for sleeping",
                    R.drawable.ic_videocam,
                    LightGreen1,
                    LightGreen2,
                    LightGreen3
                ),
                Feature(
                    title = "Night island",
                    R.drawable.ic_headphone,
                    OrangeYellow1,
                    OrangeYellow2,
                    OrangeYellow3
                ),
                Feature(
                    title = "Calming sounds",
                    R.drawable.ic_headphone,
                    Beige1,
                    Beige2,
                    Beige3
                )
            ))
        }

        BottomMenu(
            items = listOf(
                BottomMenuItem(
                    "Home",
                    R.drawable.ic_home,
                ),
                BottomMenuItem(
                    "Meditate",
                    R.drawable.ic_bubble,
                ),
                BottomMenuItem(
                    "Sleep",
                    R.drawable.ic_moon,
                ),
                BottomMenuItem(
                    "Music",
                    R.drawable.ic_music,
                ),
                BottomMenuItem(
                    "Profile",
                    R.drawable.ic_profile,
                )
            ),
            modifier = Modifier.align(Alignment.BottomCenter)
        )
    }
}









