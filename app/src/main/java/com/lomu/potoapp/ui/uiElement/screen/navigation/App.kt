@file:OptIn(ExperimentalAnimationApi::class)

package com.lomu.potoapp.ui.uiElement.screen.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import com.lomu.potoapp.ui.uiElement.screen.BaseContent
import com.lomu.potoapp.ui.uiElement.theme.StartScreenTheme
import com.google.accompanist.navigation.animation.rememberAnimatedNavController


@Composable
fun App(){
    BaseContent(
        systemStateColor = StartScreenTheme,
        systemNavigationColor = StartScreenTheme
    ) {
        val navController = rememberAnimatedNavController()
        NavGraph(
            navHostController = navController
        )
    }
}




/**
 * -FIRST NAV GRAPH
 *    1-Start Screen Distention
 *    2-Main Nav Graph
 *          1**-Search Screen Distention
 *          2**-Show Screen Distention
 *
 * **/