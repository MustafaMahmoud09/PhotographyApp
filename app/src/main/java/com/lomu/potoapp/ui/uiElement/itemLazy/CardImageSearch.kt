package com.lomu.potoapp.ui.uiElement.itemLazy

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.lomu.potoapp.ui.uiElement.theme.StartScreenTheme
import kotlin.math.min

@Composable
fun CardImageSearch(
    image : String,
    modifier: Modifier = Modifier
){
    Card(
        modifier = modifier
            .fillMaxWidth()
            .heightIn(
                min = 200.dp,
                max = 350.dp
            ),
        backgroundColor = StartScreenTheme  ,
        elevation = 8.dp
    ){
          Image(
              painter = rememberAsyncImagePainter(
                  model = image
              ),
              contentDescription = "",
              contentScale = ContentScale.Crop
          )
    }
}