package com.example.meditationuiapp.presentation.ui.screens.home.adapter

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.meditationuiapp.R
import com.example.meditationuiapp.presentation.ui.theme.TextWhite

@Preview
@Composable
fun GreetingSection(
    username: String = "Username"
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Good Morning, $username",
                color = TextWhite,
                style = MaterialTheme.typography.titleMedium,
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.oxygen_bold)),
            )
            Text(
                text = "We wish you have a good day!",
                color = TextWhite,
                style = MaterialTheme.typography.bodyMedium,
                fontFamily = FontFamily(Font(R.font.oxygen_light)),
            )
        }
        IconButton(
            modifier = Modifier,
            onClick = {  }
        ) {
            Icon(
                modifier = Modifier
                    .padding(7.5.dp),
                imageVector = Icons.Rounded.Search,
                contentDescription = "Search",
                tint = Color.White
            )
        }
    }
}
