package com.lomu.potoapp.data.dataSource.remote.dto.photo_search


import com.google.gson.annotations.SerializedName

data class SocialX(
    @SerializedName("instagram_username")
    val instagramUsername: String? = null,
    @SerializedName("paypal_email")
    val paypalEmail: Any? = null,
    @SerializedName("portfolio_url")
    val portfolioUrl: String? = null,
    @SerializedName("twitter_username")
    val twitterUsername: String? = null
)