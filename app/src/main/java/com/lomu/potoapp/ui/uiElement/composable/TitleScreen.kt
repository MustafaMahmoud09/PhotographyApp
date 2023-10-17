package com.lomu.potoapp.ui.uiElement.composable


import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.lomu.potoapp.ui.uiElement.theme.montserratAlternatesSemiBold

@Composable
fun TitleScreen(
    text : String,
    color: Color = Color.White,
    size: Int = 38,
    fontFamily: FontFamily = montserratAlternatesSemiBold,
    fontWeight: FontWeight = FontWeight.Medium,
    modifier: Modifier = Modifier
){

      Text(
          modifier = modifier,
          text = text,
          color = color,
          fontSize = size.sp,
          fontFamily = fontFamily,
          fontWeight = fontWeight
      )
}