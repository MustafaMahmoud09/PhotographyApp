package com.lomu.potoapp.ui.uiElement.composable

import androidx.compose.runtime.Composable
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope
import androidx.constraintlayout.compose.ConstraintLayoutScope

@Composable
fun ConstraintLayoutScope.guide25PEnd()
: ConstraintLayoutBaseScope.VerticalAnchor {

    return createGuidelineFromEnd(.25f)
}