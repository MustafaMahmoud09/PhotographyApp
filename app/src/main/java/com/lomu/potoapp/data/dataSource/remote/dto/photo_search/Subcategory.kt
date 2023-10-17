package com.lomu.potoapp.data.dataSource.remote.dto.photo_search


import com.google.gson.annotations.SerializedName

data class Subcategory(
    @SerializedName("pretty_slug")
    val prettySlug: String? = null,
    @SerializedName("slug")
    val slug: String? = null
)