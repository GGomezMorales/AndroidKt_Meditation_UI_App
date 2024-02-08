package com.example.meditationuiapp.presentation.ui.screens.meditate

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.meditationuiapp.presentation.ui.Screen


@Composable
fun MeditateScreen(
    modifier: Modifier =Modifier,
    navController: NavController
) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = Screen.MeditateScreen.route)
    }
}
