package com.lomu.potoapp.ui.uiElement.composable


import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import com.lomu.potoapp.ui.uiElement.theme.Gray
import com.lomu.potoapp.ui.uiElement.theme.montserratAlternatesRegular

@Composable
fun TextNormal(
    text:String,
    size :Int= 22,
    color:Color = Gray,
    fontFamily: FontFamily = montserratAlternatesRegular,
    modifier: Modifier = Modifier
) {

      Text(
          modifier = modifier,
          text = text,
          fontSize = size.sp,
          color = color,
          fontFamily = fontFamily
      )

}