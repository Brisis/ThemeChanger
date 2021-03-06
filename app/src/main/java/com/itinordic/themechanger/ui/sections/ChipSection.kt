package com.itinordic.themechanger.ui.sections

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.itinordic.themechanger.ui.data.ThemeChip
import com.itinordic.themechanger.ui.theme.*

/**
 * Should be saved in a datastore or cache on a prod app
 * for persistence on app launches
 */
val isDark =  mutableStateOf(false)
fun toggleTheme(){
    isDark.value = !isDark.value
}

@Composable
fun ChipSection(
    chips: List<ThemeChip>
){
    var selectedChipIndex by remember {
        mutableStateOf(0)
    }

    LazyRow {
        items(chips.size){
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .padding(start = 15.dp, top = 15.dp, bottom = 15.dp)
                    .clickable {
                        selectedChipIndex = it
                        //Change Theme

                        when(chips[it].themeMode){
                            "Dark" -> {
                                if (!isDark.value) toggleTheme()
                            }
                            "Light" -> {
                                if (isDark.value) toggleTheme()
                            }
                        }

                    }
                    .clip(RoundedCornerShape(10.dp))
                    .background(if (selectedChipIndex == it) ButtonBlue else DarkerButtonBlue)
                    .padding(15.dp)
            ) {
                Text(text =  chips[it].title, color = TextWhite)
            }
        }
    }
}