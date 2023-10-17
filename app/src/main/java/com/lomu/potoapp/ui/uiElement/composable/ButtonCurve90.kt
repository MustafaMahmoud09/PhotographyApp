package com.lomu.potoapp.ui.uiElement.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ButtonCurve90(
     text : String,
     size: Int =14,
     color: Color =Color.White,
     backgroundColor: Color = Color.Transparent,
     borderColor : Color,
     modifier: Modifier = Modifier,
     onClick : () -> Unit
){
      Box(
          modifier = modifier
              .clip(RoundedCornerShape(45))
              .aspectRatio(3.25f)
              .background(backgroundColor)
              .border(
                  width = 1.dp,
                  color = borderColor,
                  shape = RoundedCornerShape(45)
              )
              .clickable {
                  onClick()
              },
          contentAlignment = Alignment.Center
      ) {
            Text(
                text = text,
                fontSize = size.sp,
                color = color,
                fontWeight = FontWeight.Medium
            )
      }
}