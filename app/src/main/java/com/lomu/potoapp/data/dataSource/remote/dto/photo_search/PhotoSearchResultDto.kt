package com.lomu.potoapp.data.dataSource.remote.dto.photo_search


import com.google.gson.annotations.SerializedName

data class PhotoSearchResultDto(
    @SerializedName("results")
    val results: List<Result>? = listOf(),
    @SerializedName("total")
    val total: Int? = 0,
    @SerializedName("total_pages")
    val totalPages: Int? = 0
)