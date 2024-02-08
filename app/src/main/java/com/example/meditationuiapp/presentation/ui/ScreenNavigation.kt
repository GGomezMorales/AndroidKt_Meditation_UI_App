package com.example.meditationuiapp.presentation.ui

sealed class Screen(val route: String) {

//    sealed class MainScreen(subRoute: String): Screen("MainScreen/${subRoute}") {
//        data object TemplateRoute: MainScreen("{sub_route}")
//        data object HomeScreen: MainScreen("HomeScreen")
//        data object MeditateScreen: MainScreen("MeditateScreen")
//        data object SleepScreen: MainScreen("SleepScreen")
//        data object MusicScreen: MainScreen("MusicScreen")
//        data object ProfileScreen: MainScreen("ProfileScreen")
//    }
    data object HomeScreen: Screen("HomeScreen")
    data object MeditateScreen: Screen("MeditateScreen")
    data object SleepScreen: Screen("SleepScreen")
    data object MusicScreen: Screen("MusicScreen")
    data object ProfileScreen: Screen("ProfileScreen")
}