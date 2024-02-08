package com.example.meditationuiapp.presentation.ui

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.DarkMode
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.MusicNote
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.SelfImprovement
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.meditationuiapp.presentation.ui.composables.BottomNavItem
import com.example.meditationuiapp.presentation.ui.composables.BottomNavigationBar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ScaffoldBottomNavBar() {
    val navController = rememberNavController()
    val navItemList = listOf(
        BottomNavItem(
            title = "Home",
            route = Screen.HomeScreen.route,
            icon = Icons.Rounded.Home
        ),
        BottomNavItem(
            title = "Meditate",
            route = Screen.MeditateScreen.route,
            icon = Icons.Rounded.SelfImprovement
        ),
        BottomNavItem(
            title = "Sleep",
            route = Screen.SleepScreen.route,
            icon = Icons.Rounded.DarkMode
        ),
        BottomNavItem(
            title = "Music",
            route = Screen.MusicScreen.route,
            icon = Icons.Rounded.MusicNote
        ),
        BottomNavItem(
            title = "Profile",
            route = Screen.ProfileScreen.route,
            icon = Icons.Rounded.Person
        ),
    )
    Scaffold(
        bottomBar = {
            BottomNavigationBar(
                navController = navController,
                items = navItemList,
                onItemClick = {
                    navController.navigate(it.route)
                }
            )
        }
    ) {
        AppNavigation(navController = navController, paddingValues = it)
    }
}
