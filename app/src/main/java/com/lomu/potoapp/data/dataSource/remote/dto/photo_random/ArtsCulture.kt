package com.lomu.potoapp.data.dataSource.remote.dto.photo_random


import com.google.gson.annotations.SerializedName

data class ArtsCulture(
    @SerializedName("approved_on")
    val approvedOn: String? = null,
    @SerializedName("status")
    val status: String? = null
)