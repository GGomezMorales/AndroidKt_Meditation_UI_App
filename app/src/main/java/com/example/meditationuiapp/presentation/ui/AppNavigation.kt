package com.example.meditationuiapp.presentation.ui

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.meditationuiapp.presentation.ui.screens.home.HomeScreen
import com.example.meditationuiapp.presentation.ui.screens.meditate.MeditateScreen
import com.example.meditationuiapp.presentation.ui.screens.music.MusicScreen
import com.example.meditationuiapp.presentation.ui.screens.profile.ProfileScreen
import com.example.meditationuiapp.presentation.ui.screens.sleep.SleepScreen

@Composable
fun AppNavigation(
    navController: NavHostController,
    paddingValues: PaddingValues
) {
    NavHost(
        navController = navController,
        startDestination = Screen.HomeScreen.route
    ) {
        composable(Screen.HomeScreen.route) {
            HomeScreen(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
                navController = navController
            )
        }
        composable(Screen.MeditateScreen.route) {
            MeditateScreen(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
                navController = navController
            )
        }
        composable(Screen.SleepScreen.route) {
            SleepScreen(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
                navController = navController
            )
        }
        composable(Screen.MusicScreen.route) {
            MusicScreen(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
                navController = navController
            )
        }
        composable(Screen.ProfileScreen.route) {
            ProfileScreen(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
                navController = navController
            )
        }
    }
}
