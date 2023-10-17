package com.lomu.potoapp.ui.uiElement.composable

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.BottomNavigationItem
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.lomu.potoapp.ui.uiElement.screen.MainScreen.navigation.Screen

@Composable
fun RowScope.BottomBar(
    subNavHostController: NavHostController,
    list: List<Screen>
){
    val navBackStackEntry by subNavHostController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination
    list.forEach { screen ->
        BottomNavigationItem(
            icon = {
                IconBottomBar(
                    icon = painterResource(
                        id = screen.icon
                    )
                )
            },
            selected = currentDestination?.hierarchy?.any { it.route == screen.route } == true,
            onClick = {
                subNavHostController.navigate(screen.route) {
                    popUpTo(
                        subNavHostController.graph.findStartDestination().id
                    ) {
                        saveState = true
                    }
                    launchSingleTop = true
                    restoreState = true
                }
            }
        )
    }
}