@file:OptIn(ExperimentalAnimationApi::class)

package com.lomu.potoapp.ui.uiElement.screen.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.lomu.potoapp.ui.uiElement.screen.MainScreen.parentScreen.mainScreenDistention
import com.lomu.potoapp.ui.uiElement.screen.StartScreen.startDistention
import com.lomu.potoapp.ui.uiElement.screen.StartScreen.startScreenDistention

@Composable
fun NavGraph(
    navHostController: NavHostController
) {
    AnimatedNavHost(
        navController = navHostController,
        startDestination = startDistention
    ){
          startScreenDistention(navHostController)
          mainScreenDistention(navHostController)
    }

}