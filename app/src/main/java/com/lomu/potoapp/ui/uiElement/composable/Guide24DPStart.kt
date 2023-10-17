package com.lomu.potoapp.ui.uiElement.composable

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope
import androidx.constraintlayout.compose.ConstraintLayoutScope

@Composable
fun ConstraintLayoutScope.guide24DPStart()
: ConstraintLayoutBaseScope.VerticalAnchor {

     return createGuidelineFromStart(24.dp)
}
