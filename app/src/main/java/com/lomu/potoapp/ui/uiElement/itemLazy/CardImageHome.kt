package com.lomu.potoapp.ui.uiElement.itemLazy


import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.lomu.potoapp.R
import com.lomu.potoapp.ui.uiElement.composable.*
import com.lomu.potoapp.ui.uiElement.theme.*

@Composable
fun CardImageHome(
    nameUser : String,
    timePosting : String,
    profile : String,
    postTitle : String,
    postImage : String,
    numberLike : String,
    stateIconLove : Color,
    modifier: Modifier = Modifier
){

    Card(
      modifier = modifier
          .fillMaxWidth()
          .wrapContentHeight(),
      shape = RoundedCornerShape(6.dp),
      backgroundColor = StartScreenTheme  ,
      elevation = 8.dp
    ) {
      Column(
          modifier = Modifier
              .fillMaxSize()
              .padding(8.dp)
      ) {
          Row(
             modifier = Modifier
                 .fillMaxWidth()
          ) {
              ImageProfile(
                  painter = rememberAsyncImagePainter(
                      model = profile
                  ),
                  description = "image_profile"
              )
            Column(
                modifier = Modifier
                    .padding(
                       horizontal =  8.dp,
                       vertical = 4.dp
                    ),
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ){
               TitleSemiBold(
                   text = nameUser,
                   textSize = 14
               )
               Row(
                   horizontalArrangement = Arrangement
                       .spacedBy(8.dp)
               ) {

                    TimeImagePost(
                        text = timePosting,
                    )
                    IconTime(
                       painter = painterResource(
                           id = R.drawable.ic_baseline_outlined_flag_24
                       ),
                       description = "time icon"
                    )
               }
            }
          }
          SpacerVertical8()
          LineHorizontal()
          SpacerVertical16()
          TitleSemiBold(
              text = postTitle,
              textSize = 12
          )
          SpacerVertical16()
          PostImage(
              painter = rememberAsyncImagePainter(
                  model = postImage
              ),
              description = "image post"
          )
          SpacerVertical16()
          Row(
              modifier = Modifier
                  .fillMaxWidth(),
              horizontalArrangement = Arrangement.End
          ) {
              Box(
                  modifier = Modifier
                      .padding(4.dp),
                  contentAlignment = Alignment.Center
              ) {
                  TimeImagePost(
                      text = numberLike
                  )
              }
              SpacerHorizontal4()
              IconTime(
                  painter = painterResource(
                      id = R.drawable.icons8_love_50
                  ),
                  description = "icon love",
                  tint = stateIconLove,
                  modifier = Modifier
                      .size(24.dp)
              )
          }
          SpacerVertical8()
      }
    }
}