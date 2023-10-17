package com.lomu.potoapp.data.dataSource.remote.dto.photo_random


import com.google.gson.annotations.SerializedName

data class TopicSubmissions(
    @SerializedName("animals")
    val animals: Animals? = null,
    @SerializedName("architecture-interior")
    val architectureInterior: ArchitectureInterior? = null,
    @SerializedName("arts-culture")
    val artsCulture: ArtsCulture? = null,
    @SerializedName("experimental")
    val experimental: Experimental? = null,
    @SerializedName("monochromatic")
    val monochromatic: Monochromatic? = null,
    @SerializedName("nature")
    val nature: Nature? = null,
    @SerializedName("travel")
    val travel: Travel? = null,
    @SerializedName("wallpapers")
    val wallpapers: Wallpapers? = null
)