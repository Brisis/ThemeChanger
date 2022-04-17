package com.itinordic.themechanger.ui.sections

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.itinordic.themechanger.data.BottomMenuItem
import com.itinordic.themechanger.ui.components.BottomMenuItem
import com.itinordic.themechanger.ui.theme
import com.itinordic.themechanger.ui.theme.AquaBlue

@Composable
fun BottomMenu(
    items: List<BottomMenuItem>,
    modifier: Modifier = Modifier,
    activeHighlightColor: Color = theme.colors.primary,
    activeTextColor: Color = theme.colors.onPrimary,
    inactiveTextColor: Color = AquaBlue,
    initialSelectedItemIndex: Int = 0,
){

    var selectedItemIndex by remember {
        mutableStateOf(initialSelectedItemIndex)
    }

    Row(
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
            .background(theme.colors.background)
            .padding(15.dp)
    ) {
        items.forEachIndexed{index, item ->
            BottomMenuItem(
                item = item,
                isSelected = index == selectedItemIndex,
                activeHighlightColor = activeHighlightColor,
                activeTextColor = activeTextColor,
                inactiveTextColor = inactiveTextColor
            ) {
                selectedItemIndex = index
            }
        }
    }
}