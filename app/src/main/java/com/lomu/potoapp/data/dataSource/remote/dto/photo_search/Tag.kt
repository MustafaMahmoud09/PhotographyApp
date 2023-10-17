package com.lomu.potoapp.data.dataSource.remote.dto.photo_search


import com.google.gson.annotations.SerializedName

data class Tag(
    @SerializedName("source")
    val source: Source? = Source(),
    @SerializedName("title")
    val title: String? = "",
    @SerializedName("type")
    val type: String? = ""
)