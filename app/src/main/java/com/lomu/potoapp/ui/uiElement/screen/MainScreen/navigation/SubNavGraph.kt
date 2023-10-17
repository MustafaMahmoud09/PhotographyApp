package com.lomu.potoapp.ui.uiElement.screen.MainScreen.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.lomu.potoapp.ui.uiElement.screen.MainScreen.navigation.distention.homeScreenDistention
import com.lomu.potoapp.ui.uiElement.screen.MainScreen.navigation.distention.loveScreenDistention
import com.lomu.potoapp.ui.uiElement.screen.MainScreen.navigation.distention.searchScreenDistention

@Composable
fun SubNavGraph(
    parentNavController: NavHostController,
    subNavController: NavHostController
){
      NavHost(
          navController = subNavController,
          startDestination = Screen.Home.route
      ){

         homeScreenDistention(
             parentNavController = parentNavController,
             subNavController = subNavController
         )

         searchScreenDistention(
             parentNavController = parentNavController,
             subNavController = subNavController
         )

         loveScreenDistention(
              parentNavController = parentNavController,
              subNavController = subNavController
         )

      }
}