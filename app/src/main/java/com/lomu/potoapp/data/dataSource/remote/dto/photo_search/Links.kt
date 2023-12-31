package com.lomu.potoapp.data.dataSource.remote.dto.photo_search


import com.google.gson.annotations.SerializedName

data class Links(
    @SerializedName("download")
    val download: String? = null,
    @SerializedName("download_location")
    val downloadLocation: String? = null,
    @SerializedName("html")
    val html: String? = null,
    @SerializedName("self")
    val self: String? = null
)