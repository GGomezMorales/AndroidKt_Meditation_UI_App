package com.example.meditationuiapp.presentation.ui.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.meditationuiapp.presentation.ui.theme.DeepBlue
import com.example.meditationuiapp.presentation.ui.composables.ChipSection
import com.example.meditationuiapp.presentation.ui.composables.GreetingSection

@Composable
fun HomeScreen(
    navController: NavHostController,
    homeViewModel: HomeViewModel
) {
    Box(
        modifier = Modifier
            .background(DeepBlue)
            .fillMaxSize()
    ) {
        Column {
            GreetingSection()
            ChipSection(chips = listOf("Sweet sleep", "Insomnia", "Depression", "Soft Siesta", "Mindfulness"))
        }
    }
}


