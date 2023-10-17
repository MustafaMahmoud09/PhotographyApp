package com.lomu.potoapp.data.dataSource.remote.retrofit

import com.lomu.potoapp.data.dataSource.remote.dto.photo_random.PhotoHomeItem
import com.lomu.potoapp.data.dataSource.remote.dto.photo_search.PhotoSearchResultDto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface IApiService {

    @GET("photos/random")
    suspend fun getRandomPhoto(
        @Query("count") count : Int
    ) : Response<List<PhotoHomeItem>>

    @GET("search/photos")
    suspend fun getPhotoSearch(
        @Query("query") key: String
    ) : Response<PhotoSearchResultDto>
}//end IApiService