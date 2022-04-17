package com.itinordic.themechanger.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable


private val DarkColors = darkColors(
    primary = PrimaryColor,
    onPrimary = TextWhite,
    background = DeepBlue,
    secondary = BlueViolet1,
    //surface = TextWhite
)
private val LightColors = lightColors(
    primary = PrimaryColor,
    onPrimary = TextBlack,
    background = FadedWhite,
    secondary = BlueViolet1,
    //surface = TextBlack
)

@Composable
fun ThemeChangerTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    MaterialTheme(
        colors = if (darkTheme) DarkColors else LightColors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}