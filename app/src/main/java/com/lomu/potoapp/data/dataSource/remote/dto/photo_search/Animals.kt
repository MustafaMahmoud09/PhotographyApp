package com.lomu.potoapp.data.dataSource.remote.dto.photo_search


import com.google.gson.annotations.SerializedName

data class Animals(
    @SerializedName("approved_on")
    val approvedOn: String? = null,
    @SerializedName("status")
    val status: String? = null
)