@file:OptIn(ExperimentalAnimationApi::class)

package com.lomu.potoapp.ui.uiElement.screen.MainScreen.parentScreen


import androidx.compose.animation.AnimatedContentScope
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import com.google.accompanist.navigation.animation.composable
import com.lomu.potoapp.ui.uiElement.screen.StartScreen.startDistention


private const val ROUTE = "MainScreen"

const val MAIN_SCREEN_ROUTE = ROUTE

fun NavHostController.navigateToMainScreen(){

      this.navigate(route = ROUTE)
}

fun NavGraphBuilder.mainScreenDistention(
    navController: NavHostController
) {
    composable(
        route = ROUTE,
        enterTransition = {
            when (initialState.destination.route) {
                startDistention ->
                    slideIntoContainer(
                        AnimatedContentScope.SlideDirection.Left,
                        animationSpec = tween(300)
                    )
                else -> null
            }
        },
        popExitTransition = {
            when (targetState.destination.route) {
                startDistention ->
                    slideOutOfContainer(
                        AnimatedContentScope.SlideDirection.Left,
                        animationSpec = tween(300)
                    )
                else -> null
            }
        }
    ){
         MainScreen(navController)
    }
}
