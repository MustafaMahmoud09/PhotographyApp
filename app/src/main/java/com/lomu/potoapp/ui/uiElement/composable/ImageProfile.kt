package com.lomu.potoapp.ui.uiElement.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp

@Composable
fun ImageProfile(
    painter: Painter,
    description : String,
    size:Int = 60,
    modifier: Modifier= Modifier
){
    Image(
        modifier = modifier
            .size(size.dp)
            .clip(CircleShape),
        painter = painter,
        contentDescription = description,
        contentScale = ContentScale.Crop
    )
}