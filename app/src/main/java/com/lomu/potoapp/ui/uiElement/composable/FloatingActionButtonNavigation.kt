package com.lomu.potoapp.ui.uiElement.composable

import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
fun FloatingActionButtonNavigation(
     background:Color,
     shape:Shape,
     image: ImageVector,
     onClick : () -> Unit
) {
    FloatingActionButton(
        backgroundColor = background,
        shape = shape,
        onClick = onClick,
    ) {
        Icon(
            imageVector = image,
            contentDescription = "icon",
            tint = Color.White
        )
    }
}