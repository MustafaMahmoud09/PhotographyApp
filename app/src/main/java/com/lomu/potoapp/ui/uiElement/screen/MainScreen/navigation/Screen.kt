package com.lomu.potoapp.ui.uiElement.screen.MainScreen.navigation


import com.lomu.potoapp.R

sealed class Screen(
    val route : String,
    val icon : Int
){
     object Home
         : Screen(
              route = "homeScreen",
              icon = R.drawable.ic_baseline_home_24
         )

     object Search
         : Screen(
              route = "searchScreen",
              icon = R.drawable.ic_baseline_search_24
         )

     object Love
         : Screen(
              route = "loveScreen",
              icon = R.drawable.icons8_love_50
         )
}
