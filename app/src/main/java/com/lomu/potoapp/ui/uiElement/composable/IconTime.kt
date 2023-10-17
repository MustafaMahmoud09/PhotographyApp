package com.lomu.potoapp.ui.uiElement.composable

import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter

@Composable
fun IconTime(
    painter : Painter,
    description : String,
    tint : Color = Color.White,
    modifier: Modifier = Modifier
) {
    Icon(
        modifier = modifier,
        painter = painter,
        contentDescription = description,
        tint = tint
    )
}