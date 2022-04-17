package com.itinordic.themechanger.ui.sections

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.itinordic.themechanger.ui.components.FeatureItem
import com.itinordic.themechanger.ui.data.Feature

@ExperimentalFoundationApi
@Composable
fun FeatureSection(
    features: List<Feature>
){
    val theme = MaterialTheme

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "Daily Thought",
            style = theme.typography.h1.copy(color = theme.colors.onPrimary),
            modifier = Modifier.padding(15.dp)
        )
        LazyVerticalGrid(
            cells = GridCells.Fixed(2),
            contentPadding = PaddingValues(start = 7.5.dp, end = 7.5.dp, bottom = 100.dp),
            modifier = Modifier.fillMaxHeight(),

            ){
            items(features.size){
                FeatureItem(feature = features[it])
            }
        }
    }
}