package com.example.meditationuiapp.presentation.ui.screens.home.adapter

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.PlayArrow
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.meditationuiapp.R
import com.example.meditationuiapp.presentation.ui.theme.ButtonBlue
import com.example.meditationuiapp.presentation.ui.theme.LightRed
import com.example.meditationuiapp.presentation.ui.theme.TextWhite

@Preview
@Composable
fun CurrentMeditationSection(
    color: Color = LightRed,
    meditationTime: String = "3 - 10 min"
) {
    Row(
        modifier = Modifier
            .padding(15.dp)
            .clip(RoundedCornerShape(10))
            .background(color)
            .padding(horizontal = 15.dp, vertical = 20.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Column(
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Daily Thought",
                color = TextWhite,
                style = MaterialTheme.typography.titleLarge,
                fontFamily = FontFamily(Font(R.font.oxygen_bold))

            )
            Text(
                text = "Meditation • $meditationTime",
                color = TextWhite,
                style = MaterialTheme.typography.bodyMedium,
                fontFamily = FontFamily(Font(R.font.oxygen_regular))
            )
        }
        IconButton(
            modifier = Modifier.size(48.dp),
            onClick = { },
            colors = IconButtonDefaults.filledIconButtonColors(
                containerColor = ButtonBlue
            )
        ) {
            Icon(
                modifier = Modifier.size(20.dp),
                imageVector = Icons.Rounded.PlayArrow,
                contentDescription = "Play",
                tint = Color.White
            )
        }
    }
}
