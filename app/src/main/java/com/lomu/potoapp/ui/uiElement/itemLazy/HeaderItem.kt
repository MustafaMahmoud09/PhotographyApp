package com.lomu.potoapp.ui.uiElement.itemLazy

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyItemScope
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.lomu.potoapp.R
import com.lomu.potoapp.ui.uiElement.composable.TitleSemiBold
import com.lomu.potoapp.ui.uiElement.composable.guide40PEnd

@ExperimentalFoundationApi
@Composable
fun LazyItemScope.HeaderItem(
     text : String,
     textSize : Int
){
        ConstraintLayout(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            val title = createRef()
            val guide40PEnd = guide40PEnd()
            TitleSemiBold(
                text = text,
                textSize = textSize,
                modifier = Modifier
                    .constrainAs(title){
                        top.linkTo(parent.top)
                        end.linkTo(guide40PEnd)
                        width = Dimension.fillToConstraints
                        start.linkTo(parent.start)
                    }
            )
        }
}