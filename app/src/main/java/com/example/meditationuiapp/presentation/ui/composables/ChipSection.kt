package com.example.meditationuiapp.presentation.ui.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import com.example.meditationuiapp.R
import com.example.meditationuiapp.presentation.ui.theme.ButtonBlue
import com.example.meditationuiapp.presentation.ui.theme.DarkerButtonBlue
import com.example.meditationuiapp.presentation.ui.theme.TextWhite

@Composable
fun ChipSection(
    chips: List<String>,
//    selectChipIndexState: Int = 0
) {
    var selectedChipIndex by remember {
        mutableIntStateOf(0)
    }
    LazyRow(
        modifier = Modifier.padding(end = 15.dp)
    ) {
        items(chips.size) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .padding(start = 15.dp, top = 15.dp, bottom = 15.dp)
                    .clickable {
                        selectedChipIndex = it
                    }
                    .clip(RoundedCornerShape(20))
                    .background(
                        if (selectedChipIndex == it) ButtonBlue
                        else DarkerButtonBlue
                    )
                    .padding(15.dp)
            ) {
                Text(
                    text = chips[it],
                    color = TextWhite,
                    fontFamily = FontFamily(Font(R.font.oxygen_regular))
                )
            }

        }
    }
}
