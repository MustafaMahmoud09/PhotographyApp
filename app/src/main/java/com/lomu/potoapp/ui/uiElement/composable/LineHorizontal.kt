package com.lomu.potoapp.ui.uiElement.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.lomu.potoapp.ui.uiElement.theme.MainScreenStateTheme

@Composable
fun LineHorizontal(){
    Spacer(
        modifier = Modifier
            .fillMaxWidth()
            .height(0.5.dp)
            .background(
                color = MainScreenStateTheme
            )
    )
}