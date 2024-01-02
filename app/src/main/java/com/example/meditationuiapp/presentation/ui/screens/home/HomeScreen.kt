package com.example.meditationuiapp.presentation.ui.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.meditationuiapp.R
import com.example.meditationuiapp.domain.Feature
import com.example.meditationuiapp.presentation.ui.composables.BottomNavigationMenu
import com.example.meditationuiapp.presentation.ui.composables.ChipSection
import com.example.meditationuiapp.presentation.ui.composables.CurrentMeditationSetion
import com.example.meditationuiapp.presentation.ui.composables.FeatureSection
import com.example.meditationuiapp.presentation.ui.composables.GreetingSection
import com.example.meditationuiapp.presentation.ui.screens.BottomMenuContent
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
//    navController: NavHostController,
//    homeViewModel: HomeViewModel
) {
    Box(
        modifier = Modifier
            .background(DeepBlue)
            .fillMaxSize()
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
            CurrentMeditationSetion()
            FeatureSection(
                features = listOf(
                    Feature(
                        title = "Slepp meditation",
                        iconId = R.drawable.ic_headphone,
                        BlueViolet1,
                        BlueViolet2,
                        BlueViolet3
                    ),
                    Feature(
                        title = "Tips for sleeping",
                        iconId = R.drawable.ic_videocam,
                        LightGreen1,
                        LightGreen2,
                        LightGreen3
                    ),
                    Feature(
                        title = "Night island",
                        iconId = R.drawable.ic_headphone,
                        OrangeYellow1,
                        OrangeYellow2,
                        OrangeYellow3
                    ),
                    Feature(
                        title = "Calming sounds",
                        iconId = R.drawable.ic_headphone,
                        Beige1,
                        Beige2,
                        Beige3
                    ),
                )
            )
        }
        BottomNavigationMenu(
            items = listOf(
                BottomMenuContent(title = "Home", iconId = R.drawable.ic_home),
                BottomMenuContent(title = "Meditate", iconId = R.drawable.ic_bubble),
                BottomMenuContent(title = "Sleep", iconId = R.drawable.ic_moon),
                BottomMenuContent(title = "Music", iconId = R.drawable.ic_music),
                BottomMenuContent(title = "Profile", iconId = R.drawable.ic_profile)
            )
        )
    }
}


