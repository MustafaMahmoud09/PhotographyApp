package com.lomu.potoapp.data.dataSource.remote.dto.photo_search


import com.google.gson.annotations.SerializedName

data class UserX(
    @SerializedName("accepted_tos")
    val acceptedTos: Boolean? = false,
    @SerializedName("bio")
    val bio: String? = "",
    @SerializedName("first_name")
    val firstName: String? = "",
    @SerializedName("for_hire")
    val forHire: Boolean? = false,
    @SerializedName("id")
    val id: String? = "",
    @SerializedName("instagram_username")
    val instagramUsername: String? = "",
    @SerializedName("last_name")
    val lastName: String? = "",
    @SerializedName("location")
    val location: String? = "",
    @SerializedName("name")
    val name: String? = "",
    @SerializedName("portfolio_url")
    val portfolioUrl: String? = "",
    @SerializedName("social")
    val social: SocialX? = SocialX(),
    @SerializedName("total_collections")
    val totalCollections: Int? = 0,
    @SerializedName("total_likes")
    val totalLikes: Int? = 0,
    @SerializedName("total_photos")
    val totalPhotos: Int? = 0,
    @SerializedName("twitter_username")
    val twitterUsername: String? = "",
    @SerializedName("updated_at")
    val updatedAt: String? = "",
    @SerializedName("username")
    val username: String? = ""
)