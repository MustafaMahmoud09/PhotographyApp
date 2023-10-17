package com.lomu.potoapp.data.dataSource.remote.dto.photo_random


import com.google.gson.annotations.SerializedName

data class Social(
    @SerializedName("instagram_username")
    val instagramUsername: String? = null,
    @SerializedName("paypal_email")
    val paypalEmail: Any? = null,
    @SerializedName("portfolio_url")
    val portfolioUrl: String? = null,
    @SerializedName("twitter_username")
    val twitterUsername: String? = null
)