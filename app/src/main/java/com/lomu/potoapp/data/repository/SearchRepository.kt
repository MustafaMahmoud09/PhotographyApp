package com.lomu.potoapp.data.repository

import com.lomu.potoapp.data.dataSource.remote.dto.photo_search.PhotoSearchResultDto
import com.lomu.potoapp.data.dataSource.remote.retrofit.IApiService
import com.lomu.potoapp.domain.status_request.Status
import kotlinx.coroutines.flow.Flow

class SearchRepository (
     private val apiService: IApiService
) : BaseRepository(){

     fun searchOnPhoto(
          key: String
     ) : Flow<Status<PhotoSearchResultDto>>
     {

          return wrapper {
               apiService
                    .getPhotoSearch(
                        key = key
                    )
          }
     }
}