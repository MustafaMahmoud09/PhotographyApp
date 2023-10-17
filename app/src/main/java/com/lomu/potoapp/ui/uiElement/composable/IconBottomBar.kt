package com.lomu.potoapp.ui.uiElement.composable

import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter

@Composable
fun IconBottomBar(
    icon : Painter,
    des : String = ""
){
    Icon(
        painter = icon,
        contentDescription = des
    )
}