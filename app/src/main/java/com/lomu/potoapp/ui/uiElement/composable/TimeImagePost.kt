package com.lomu.potoapp.ui.uiElement.composable

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import com.lomu.potoapp.ui.uiElement.theme.montserratAlternatesRegular

@Composable
fun TimeImagePost(
    text : String,
    color: Color = Color.White,
    size:Int = 12,
    modifier: Modifier = Modifier
){
    Text(
        modifier = modifier,
        text = text,
        color = color,
        fontSize = size.sp,
        fontFamily = montserratAlternatesRegular
    )
}