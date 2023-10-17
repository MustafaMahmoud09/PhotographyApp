package com.lomu.potoapp.ui.uiElement.composable

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.LocalTextStyle
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun CustomEditField(
     text : String,
     onChange : (String) -> Unit,
     textColor : Color,
     hintColor : Color
){
    BasicTextField(
        value = text,
        textStyle = LocalTextStyle.current.copy(
            color = textColor
        ),
        onValueChange = onChange,
        modifier = Modifier
            .fillMaxWidth(),
        singleLine = true,

        decorationBox = { innerTextField ->
                AnimatedVisibility (
                    text.isEmpty()
                ) {
                    Text(
                        text ="search",
                        color = hintColor,
                        fontSize = 14.sp
                    )
                }
                // <-- Add this
                innerTextField()
        },
    )
}