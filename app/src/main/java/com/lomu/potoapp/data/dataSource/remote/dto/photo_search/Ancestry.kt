package com.lomu.potoapp.data.dataSource.remote.dto.photo_search


import com.google.gson.annotations.SerializedName

data class Ancestry(
    @SerializedName("category")
    val category: Category? = null,
    @SerializedName("subcategory")
    val subcategory: Subcategory? = null,
    @SerializedName("type")
    val type: Type? = null
)