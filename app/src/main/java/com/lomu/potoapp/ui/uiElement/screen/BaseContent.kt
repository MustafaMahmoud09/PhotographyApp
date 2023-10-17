package com.lomu.potoapp.ui.uiElement.screen


import android.annotation.SuppressLint
import androidx.compose.material.FabPosition
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.lomu.potoapp.ui.uiElement.theme.PotoAppTheme


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun BaseContent(
    systemStateColor: Color,
    systemNavigationColor: Color,
    bottomBar : @Composable ()->Unit ={},
    floatingActionBar : @Composable ()->Unit = {},
    content : @Composable () -> Unit,
){

    PotoAppTheme(true) {

        val systemUiController = rememberSystemUiController()

         systemUiController.setStatusBarColor(
             color = systemStateColor,
             darkIcons = false
         )

         systemUiController.setNavigationBarColor(
             color = systemNavigationColor,
             darkIcons = false
         )

         Scaffold(
             bottomBar = bottomBar,
             floatingActionButton = floatingActionBar,
             floatingActionButtonPosition = FabPosition.Center,
             isFloatingActionButtonDocked = true,
         ){
               content()
         }
    }

}//end BaseScreen
