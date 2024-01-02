package com.example.meditationuiapp.presentation.theme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.example.meditationuiapp.presentation.ui.screens.home.HomeScreen
import com.example.meditationuiapp.presentation.ui.screens.home.HomeViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        val homeViewModel by viewModels<HomeViewModel>()

        super.onCreate(savedInstanceState)
        setContent {
            HomeScreen()
        }
    }
}
