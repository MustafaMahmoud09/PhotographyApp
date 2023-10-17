@file:OptIn(ExperimentalAnimationApi::class)

package com.lomu.potoapp.ui.uiElement.screen.StartScreen

import androidx.compose.animation.AnimatedContentScope
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import com.google.accompanist.navigation.animation.composable
import com.lomu.potoapp.ui.uiElement.screen.MainScreen.parentScreen.MAIN_SCREEN_ROUTE


private const val ROUTE = "StartScreen"

const val startDistention = ROUTE

fun NavGraphBuilder.startScreenDistention(
    navController: NavHostController
) {
    composable(
        route = ROUTE,
        exitTransition = {
            when (initialState.destination.route) {
                MAIN_SCREEN_ROUTE ->
                    slideOutOfContainer(
                        AnimatedContentScope.SlideDirection.Right,
                        animationSpec = tween(300)
                    )
                else -> null
            }
        },
        popEnterTransition = {
            when (initialState.destination.route) {
                MAIN_SCREEN_ROUTE ->
                    slideIntoContainer(
                        AnimatedContentScope.SlideDirection.Right,
                        animationSpec = tween(300)
                    )
                else -> null
            }
        },
    ){
        StartScreen(navController)
    }
}