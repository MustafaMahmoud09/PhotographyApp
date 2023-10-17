package com.lomu.potoapp.ui.uiElement.screen.MainScreen.parentScreen


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.BottomAppBar
import androidx.compose.material.BottomNavigation
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.lomu.potoapp.ui.uiElement.composable.BottomBar
import com.lomu.potoapp.ui.uiElement.composable.FloatingActionButtonNavigation
import com.lomu.potoapp.ui.uiElement.screen.BaseContent
import com.lomu.potoapp.ui.uiElement.screen.MainScreen.navigation.Screen
import com.lomu.potoapp.ui.uiElement.screen.MainScreen.navigation.SubNavGraph
import com.lomu.potoapp.ui.uiElement.theme.FloatingColorCenter
import com.lomu.potoapp.ui.uiElement.theme.MainScreenNavigationTheme
import com.lomu.potoapp.ui.uiElement.theme.MainScreenStateTheme
import com.lomu.potoapp.ui.uiElement.theme.Yellow

@Composable
fun MainScreen(
    parentNavHostController: NavHostController,
){
    val subNavController = rememberNavController()
    MainContent(
        parentNavHostController = parentNavHostController,
        subNavHostController = subNavController
    )
}//end MainScreen

@Composable
private fun MainContent(
    parentNavHostController: NavHostController,
    subNavHostController: NavHostController
){

    val list = listOf(
        Screen.Home,
        Screen.Search
    )

    BaseContent(
        systemStateColor = MainScreenStateTheme,
        systemNavigationColor = MainScreenNavigationTheme,
        floatingActionBar = {
            FloatingActionButtonNavigation(
                background = FloatingColorCenter,
                shape = CircleShape,
                image = Icons.Default.Add) {

            }
        },
        bottomBar = {
            BottomAppBar(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Yellow),
                backgroundColor = MainScreenNavigationTheme,
                cutoutShape = CircleShape,
            ) {
                BottomNavigation(
                    elevation = 3.dp,
                    backgroundColor = MainScreenNavigationTheme,
                ) {
                    BottomBar(
                        subNavHostController = subNavHostController,
                        list = list
                    )
                }
            }
        }
    ) {
        Column(
            modifier = Modifier
                .padding(
                    bottom = 58.dp
                )
        ) {
            SubNavGraph(
                parentNavController = parentNavHostController,
                subNavController = subNavHostController
            )
        }
    }
}
