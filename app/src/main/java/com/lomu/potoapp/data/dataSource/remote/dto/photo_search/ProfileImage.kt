package com.lomu.potoapp.data.dataSource.remote.dto.photo_search


import com.google.gson.annotations.SerializedName

data class ProfileImage(
    @SerializedName("large")
    val large: String? = null,
    @SerializedName("medium")
    val medium: String? = null,
    @SerializedName("small")
    val small: String? = null
)