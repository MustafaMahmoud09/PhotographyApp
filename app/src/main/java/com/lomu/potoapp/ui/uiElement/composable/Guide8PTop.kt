package com.lomu.potoapp.ui.uiElement.composable

import androidx.compose.runtime.Composable
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope
import androidx.constraintlayout.compose.ConstraintLayoutScope

@Composable
fun ConstraintLayoutScope.guide8PTop()
: ConstraintLayoutBaseScope.HorizontalAnchor {

       return createGuidelineFromTop(.08f)
}//end Guide8PTop