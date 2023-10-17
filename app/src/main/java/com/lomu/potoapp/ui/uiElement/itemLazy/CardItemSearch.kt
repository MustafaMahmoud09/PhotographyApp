package com.lomu.potoapp.ui.uiElement.itemLazy


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.lomu.potoapp.R
import com.lomu.potoapp.ui.uiElement.composable.CustomEditField
import com.lomu.potoapp.ui.uiElement.composable.IconTime
import com.lomu.potoapp.ui.uiElement.theme.MainScreenNavigationTheme
import com.lomu.potoapp.ui.uiElement.theme.MainScreenStateTheme

@Composable
fun CardItemSearch(
    text : String,
    onChange :(String) -> Unit
){
 Box(
     modifier = Modifier
         .background(MainScreenStateTheme)
         .padding(horizontal = 4.dp)
         .padding(top = 8.dp)
 ) {
     Card(
         modifier = Modifier
             .fillMaxWidth()
             .height(50.dp),
         shape = RoundedCornerShape(45),
         backgroundColor = MainScreenNavigationTheme,
         elevation = 8.dp
     ){
         Column(
             modifier = Modifier
                 .fillMaxSize()
                 .padding(horizontal = 8.dp),
             verticalArrangement = Arrangement.Center
         ) {
             Row(
                 modifier = Modifier
                     .fillMaxWidth()
             ) {
                 IconTime(
                     painter = painterResource(
                         id = R.drawable.ic_baseline_search_24
                     ),
                     description = "search icon"
                 )
                 CustomEditField(
                     text = text,
                     onChange = onChange,
                     textColor = Color.White,
                     hintColor = Color.LightGray
                 )
             }
           }
        }
     }
 }