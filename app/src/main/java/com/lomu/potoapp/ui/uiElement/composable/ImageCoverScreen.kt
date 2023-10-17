package com.lomu.potoapp.ui.uiElement.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale

@Composable
fun ImageCoverScreen(
    painter: Painter,
    description : String,
    modifier: Modifier = Modifier
){
      Image(
          modifier = modifier
              .fillMaxSize(),
          painter = painter,
          contentDescription = description,
          contentScale = ContentScale.Crop,
      )

}//end ImageCoverScreen