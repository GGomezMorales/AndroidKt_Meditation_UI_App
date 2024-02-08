package com.example.meditationuiapp.presentation.ui.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Headphones
import androidx.compose.material.icons.rounded.Nightlight
import androidx.compose.material.icons.rounded.Videocam
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.meditationuiapp.domain.Feature
import com.example.meditationuiapp.presentation.ui.screens.home.adapter.ChipSection
import com.example.meditationuiapp.presentation.ui.screens.home.adapter.CurrentMeditationSection
import com.example.meditationuiapp.presentation.ui.screens.home.adapter.FeatureSection
import com.example.meditationuiapp.presentation.ui.screens.home.adapter.GreetingSection
import com.example.meditationuiapp.presentation.ui.theme.Beige1
import com.example.meditationuiapp.presentation.ui.theme.Beige2
import com.example.meditationuiapp.presentation.ui.theme.Beige3
import com.example.meditationuiapp.presentation.ui.theme.BlueViolet1
import com.example.meditationuiapp.presentation.ui.theme.BlueViolet2
import com.example.meditationuiapp.presentation.ui.theme.BlueViolet3
import com.example.meditationuiapp.presentation.ui.theme.DeepBlue
import com.example.meditationuiapp.presentation.ui.theme.LightGreen1
import com.example.meditationuiapp.presentation.ui.theme.LightGreen2
import com.example.meditationuiapp.presentation.ui.theme.LightGreen3
import com.example.meditationuiapp.presentation.ui.theme.OrangeYellow1
import com.example.meditationuiapp.presentation.ui.theme.OrangeYellow2
import com.example.meditationuiapp.presentation.ui.theme.OrangeYellow3

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    navController: NavHostController
) {
    Box(
        modifier = modifier
            .background(DeepBlue)
            .fillMaxSize(),
        contentAlignment = Alignment.BottomCenter
    ) {
        Column {
            GreetingSection()
            ChipSection(
                chips = listOf(
                    "Sweet sleep",
                    "Insomnia",
                    "Depression",
                    "Soft Siesta",
                    "Mindfulness"
                )
            )
            CurrentMeditationSection()
            FeatureSection(
                features = listOf(
                    Feature(
                        title = "Sleep meditation",
                        icon = Icons.Rounded.Nightlight,
                        BlueViolet1,
                        BlueViolet2,
                        BlueViolet3
                    ),
                    Feature(
                        title = "Tips for sleeping",
                        icon = Icons.Rounded.Videocam,
                        LightGreen1,
                        LightGreen2,
                        LightGreen3
                    ),
                    Feature(
                        title = "Night island",
                        icon = Icons.Rounded.Headphones,
                        OrangeYellow1,
                        OrangeYellow2,
                        OrangeYellow3
                    ),
                    Feature(
                        title = "Calming sounds",
                        icon = Icons.Rounded.Headphones,
                        Beige1,
                        Beige2,
                        Beige3
                    ),
                )
            )
        }
    }
}


