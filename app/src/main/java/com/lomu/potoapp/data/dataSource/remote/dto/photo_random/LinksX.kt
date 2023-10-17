package com.lomu.potoapp.data.dataSource.remote.dto.photo_random


import com.google.gson.annotations.SerializedName

data class LinksX(
    @SerializedName("followers")
    val followers: String? = null,
    @SerializedName("following")
    val following: String? = null,
    @SerializedName("html")
    val html: String? = null,
    @SerializedName("likes")
    val likes: String? = null,
    @SerializedName("photos")
    val photos: String? = null,
    @SerializedName("portfolio")
    val portfolio: String? = null,
    @SerializedName("self")
    val self: String? = null
)