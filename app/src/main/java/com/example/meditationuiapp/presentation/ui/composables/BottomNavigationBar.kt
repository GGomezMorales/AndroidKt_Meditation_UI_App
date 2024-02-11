package com.example.meditationuiapp.presentation.ui.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.meditationuiapp.presentation.ui.theme.DeepBlue

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomNavigationBar(
    navController: NavController,
    items: List<BottomNavItem>,
    onItemClick: (BottomNavItem) -> Unit
) {
    val backStackEntry = navController.currentBackStackEntryAsState()
    NavigationBar(
        modifier = Modifier,
        containerColor = DeepBlue,
        tonalElevation = 5.dp
    ) {
        items.forEach { item ->
            val selected = item.route == backStackEntry.value?.destination?.route
            NavigationBarItem(
                selected = selected,
                onClick = { onItemClick(item) },
                icon = {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        if (item.badgeCount > 0) {
                            BadgedBox(
                                badge = { Text(text = item.badgeCount.toString()) }
                            ) {
                                Icon(
                                    imageVector = item.icon,
                                    contentDescription = item.title
                                )
                            }
                        } else {
                            Icon(
                                imageVector = item.icon,
                                contentDescription = item.title
                            )
                        }
                        if (selected) {
                            Text(
                                text = item.title,
                                textAlign = TextAlign.Center,
                                fontSize = 10.sp
                            )
                        }
                    }
                },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = DeepBlue,
                    unselectedIconColor = Color.White,
                    indicatorColor = Color.White
                )
            )
        }
    }
}
