package com.lomu.potoapp.data.dataSource.remote.dto.photo_random


import com.google.gson.annotations.SerializedName

data class Location(
    @SerializedName("city")
    val city: String? = null,
    @SerializedName("country")
    val country: String? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("position")
    val position: Position? = null
)