package com.itinordic.themechanger.ui.sections

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.itinordic.themechanger.R

@Composable
fun GreetingSection(
    name: String = "Benevolent"
){
    val theme = MaterialTheme

    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp)
    ) {
        Column(verticalArrangement = Arrangement.Center) {
            Text(
                text = "Good afternoon, $name",
                style = theme.typography.h2.copy(color = theme.colors.onPrimary)
            )
            Text(
                text = "We wish you have a good day!",
                style = theme.typography.body1.copy(color = theme.colors.onPrimary)
            )
        }
        Icon(
            painter = painterResource(id = R.drawable.ic_search),
            contentDescription = "Search",
            tint = theme.colors.onPrimary,
            modifier = Modifier.size(24.dp).clickable {
                print("searching...")
            }
        )
    }
}