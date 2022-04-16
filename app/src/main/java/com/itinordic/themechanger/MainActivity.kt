package com.itinordic.themechanger

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import com.itinordic.themechanger.ui.HomeScreen
import com.itinordic.themechanger.ui.theme.ThemeChangerTheme

class MainActivity : ComponentActivity() {
    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ThemeChangerTheme {
                HomeScreen()
            }

        }
    }
}

