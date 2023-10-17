package com.lomu.potoapp.ui.uiElement.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp

@Composable
fun PostImage(
    painter: Painter,
    description : String,
    modifier: Modifier = Modifier
){
    Image(
        painter = painter,
        contentDescription = description,
        modifier = modifier
            .fillMaxWidth()
            .aspectRatio(1.5f)
            .clip(RoundedCornerShape(6.dp)),
        contentScale = ContentScale.Crop
    )
}