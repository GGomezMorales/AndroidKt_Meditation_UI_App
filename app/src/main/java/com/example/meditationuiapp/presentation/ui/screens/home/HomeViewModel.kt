package com.example.meditationuiapp.presentation.ui.screens.home

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class HomeViewModel: ViewModel() {

    private val _selectedChipIndex = MutableStateFlow(Int)
    val selectedChipIndex = _selectedChipIndex.asStateFlow()

}