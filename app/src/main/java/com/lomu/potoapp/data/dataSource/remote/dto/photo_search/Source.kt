package com.lomu.potoapp.data.dataSource.remote.dto.photo_search


import com.google.gson.annotations.SerializedName

data class Source(
    @SerializedName("ancestry")
    val ancestry: Ancestry? = Ancestry(),
    @SerializedName("cover_photo")
    val coverPhoto: CoverPhoto? = CoverPhoto(),
    @SerializedName("description")
    val description: String? = "",
    @SerializedName("meta_description")
    val metaDescription: String? = "",
    @SerializedName("meta_title")
    val metaTitle: String? = "",
    @SerializedName("subtitle")
    val subtitle: String? = "",
    @SerializedName("title")
    val title: String? = ""
)