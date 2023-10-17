package com.lomu.potoapp.ui.uiElement.composable

import androidx.compose.foundation.clickable
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import com.lomu.potoapp.ui.uiElement.theme.montserratAlternatesSemiBold

@Composable
fun TitleSemiBold(
    text : String,
    color: Color = Color.White,
    onClick : () -> Unit = {},
    textSize : Int = 16,
    modifier: Modifier = Modifier
){
    Text(
        modifier = modifier
            .clickable {},
        fontSize = textSize.sp,
        text = text,
        color = color,
        fontFamily = montserratAlternatesSemiBold,
    )
}