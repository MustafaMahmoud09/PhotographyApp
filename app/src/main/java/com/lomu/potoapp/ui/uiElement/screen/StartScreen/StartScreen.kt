package com.lomu.potoapp.ui.uiElement.screen.StartScreen

import androidx.compose.animation.animateColor
import androidx.compose.animation.core.*
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import androidx.navigation.NavHostController
import com.lomu.potoapp.R
import com.lomu.potoapp.ui.uiElement.composable.*
import com.lomu.potoapp.ui.uiElement.screen.BaseContent
import com.lomu.potoapp.ui.uiElement.screen.MainScreen.parentScreen.navigateToMainScreen
import com.lomu.potoapp.ui.uiElement.theme.StartScreenTheme
import com.lomu.potoapp.ui.uiElement.theme.Yellow

@Composable
fun StartScreen(
    navHostController: NavHostController,
){

      StartContent(
          onClickStart = { navHostController.navigateToMainScreen() }
      )
}//end StartScreen

@Composable
private fun StartContent(
    onClickStart : () -> Unit
){

     BaseContent(
         systemStateColor = StartScreenTheme,
         systemNavigationColor = StartScreenTheme
     ) {

            ConstraintLayout(
                modifier = Modifier
                    .fillMaxSize()
            ) {

                  val infiniteTransition = rememberInfiniteTransition()

                  val colorBorderInfinite by infiniteTransition.animateColor(
                      initialValue = Yellow,
                      targetValue = Color.Blue,
                      animationSpec = infiniteRepeatable(
                            animation =  tween(3000),
                            repeatMode = RepeatMode.Reverse
                      )
                  )

                  val (title,buttonStart,messageSecond,messageFirst) = createRefs()

                  val guide8PTop = guide8PTop()
                  val guide24DPStart = guide24DPStart()
                  val guide16DPBottom = guide16DPBottom()
                  val guide25PStart = guide25PStart()
                  val guide25PEnd = guide25PEnd()

                   ImageCoverScreen(
                       painter = painterResource(
                           id = R.drawable.cover
                       ),
                       description = stringResource(
                           R.string.start_cover
                       )
                   )

                   TitleScreen(
                       modifier = Modifier
                           .constrainAs(title){
                                top.linkTo(guide8PTop)
                                start.linkTo(guide24DPStart)
                           },
                       text = stringResource(
                           R.string.poto
                       ),
                   )

                   ButtonCurve90(
                       modifier = Modifier
                           .constrainAs(buttonStart){
                                 start.linkTo(guide25PStart)
                                 end.linkTo(guide25PEnd)
                                 bottom.linkTo(guide16DPBottom)
                                 width = Dimension.fillToConstraints
                           },
                       text = stringResource(
                           R.string.get_started
                       ),
                       borderColor = colorBorderInfinite,
                       onClick = onClickStart
                   )

                  TextNormal(
                       text = stringResource(
                           R.string.share_capture
                       ),
                       modifier = Modifier
                           .constrainAs(messageSecond){
                               start.linkTo(guide24DPStart)
                               end.linkTo(parent.end,24.dp)
                               width = Dimension.fillToConstraints
                               bottom.linkTo(buttonStart.top,64.dp)
                           },
                      size = 24
                   )

                  TextNormal(
                      text = stringResource(
                          R.string.explore_capture
                      ),
                      modifier = Modifier
                          .constrainAs(messageFirst){
                              start.linkTo(guide24DPStart)
                              end.linkTo(parent.end,24.dp)
                              width = Dimension.fillToConstraints
                              bottom.linkTo(messageSecond.top,32.dp)
                          },
                      size = 40,
                      color = Color.White
                  )
            }
     }
}