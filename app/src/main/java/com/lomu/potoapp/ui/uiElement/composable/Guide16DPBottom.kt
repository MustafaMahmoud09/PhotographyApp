package com.lomu.potoapp.ui.uiElement.composable

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope
import androidx.constraintlayout.compose.ConstraintLayoutScope

@Composable
fun ConstraintLayoutScope.guide16DPBottom()
: ConstraintLayoutBaseScope.HorizontalAnchor {

     return createGuidelineFromBottom(16.dp)
}//end Guide16DPBottom