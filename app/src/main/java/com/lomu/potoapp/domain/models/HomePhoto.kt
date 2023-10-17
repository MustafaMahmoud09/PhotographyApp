package com.lomu.potoapp.domain.models

data class HomePhoto(
    val id : String,
    val imageProfile : String ,
    val name : String ,
    val time : String ,
    val photo : String ,
    val title : String ,
    val numberOfLove: Int ,
    val stateLove : Boolean
)