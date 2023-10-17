package com.lomu.potoapp.ui.uiElement.screen.MainScreen.navigation.distention

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.lomu.potoapp.ui.uiElement.screen.MainScreen.navigation.Screen
import com.lomu.potoapp.ui.uiElement.screen.MainScreen.subScreen.HomeScreen

fun NavGraphBuilder.homeScreenDistention(
       parentNavController : NavHostController,
       subNavController : NavHostController
){
    composable(
        route = Screen.Home.route
    ){
        HomeScreen(
            parentNavController = parentNavController,
            subNavController = subNavController
        )
    }
}