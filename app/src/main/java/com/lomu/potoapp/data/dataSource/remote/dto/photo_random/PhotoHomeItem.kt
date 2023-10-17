package com.lomu.potoapp.data.dataSource.remote.dto.photo_random


import com.google.gson.annotations.SerializedName

data class PhotoHomeItem(
    @SerializedName("alt_description")
    val altDescription: String? = "",
    @SerializedName("blur_hash")
    val blurHash: String? = "",
    @SerializedName("breadcrumbs")
    val breadcrumbs: List<Any>? = listOf(),
    @SerializedName("color")
    val color: String? = "",
    @SerializedName("created_at")
    val createdAt: String? = "",
    @SerializedName("current_user_collections")
    val currentUserCollections: List<Any>? = listOf(),
    @SerializedName("description")
    val description: String? = "",
    @SerializedName("downloads")
    val downloads: Int? = 0,
    @SerializedName("exif")
    val exif: Exif? = Exif(),
    @SerializedName("height")
    val height: Int? = 0,
    @SerializedName("id")
    val id: String? = "",
    @SerializedName("liked_by_user")
    val likedByUser: Boolean? = false,
    @SerializedName("likes")
    val likes: Int? = 0,
    @SerializedName("links")
    val links: Links? = Links(),
    @SerializedName("location")
    val location: Location? = Location(),
    @SerializedName("promoted_at")
    val promotedAt: String? = "",
    @SerializedName("slug")
    val slug: String? = "",
    @SerializedName("sponsorship")
    val sponsorship: Any? = Any(),
    @SerializedName("topic_submissions")
    val topicSubmissions: TopicSubmissions? = TopicSubmissions(),
    @SerializedName("updated_at")
    val updatedAt: String? = "",
    @SerializedName("urls")
    val urls: Urls? = Urls(),
    @SerializedName("user")
    val user: User? = User(),
    @SerializedName("views")
    val views: Int? = 0,
    @SerializedName("width")
    val width: Int? = 0
)