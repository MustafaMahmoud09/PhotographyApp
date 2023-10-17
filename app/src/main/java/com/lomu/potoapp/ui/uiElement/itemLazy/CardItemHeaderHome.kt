package com.lomu.potoapp.ui.uiElement.itemLazy


import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.lomu.potoapp.R
import com.lomu.potoapp.ui.uiElement.composable.*
import com.lomu.potoapp.ui.uiElement.theme.*


@Composable
fun CardItemHeaderHome(
    nameUser : String,
    timePosting : String,
    profile : String,
    postImage : String,
    modifier: Modifier = Modifier
){

    Card(
      modifier = modifier
          .fillMaxWidth()
          .wrapContentHeight(),
      shape = RoundedCornerShape(6.dp),
      backgroundColor = StartScreenTheme  ,
      elevation = 8.dp
    ){
      Box(
          modifier = Modifier
              .fillMaxSize()
      ) {
          PostImage(
              painter = rememberAsyncImagePainter(
                  model = postImage
              ),
              description = "image post"
          )
          Row(
             modifier = Modifier
                 .fillMaxWidth()
                 .padding(8.dp)
          ) {
              ImageProfile(
                  painter = rememberAsyncImagePainter(
                      model = profile
                  ),
                  description = "image_profile",
                  size = 56
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
      }
    }
}