package com.lomu.potoapp.data.repository

import android.util.Log
import com.lomu.potoapp.data.dataSource.local_database.PotoDatabase
import com.lomu.potoapp.data.dataSource.local_database.entity.Header
import com.lomu.potoapp.data.dataSource.local_database.entity.Post
import com.lomu.potoapp.data.dataSource.remote.dto.photo_random.PhotoHomeItem
import com.lomu.potoapp.data.dataSource.remote.retrofit.IApiService
import com.lomu.potoapp.domain.mapper.MappingFromHeaderDtoToHeaderEntity
import com.lomu.potoapp.domain.mapper.MappingFromPostDtoToPostEntity
import com.lomu.potoapp.domain.status_request.Status
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch


class HomeRepository(
    private val apiService: IApiService,
    private val database: PotoDatabase,
    private val mapperHeader : MappingFromHeaderDtoToHeaderEntity,
    private val mapperPost : MappingFromPostDtoToPostEntity,
    private val coroutineScope: CoroutineScope
) : BaseRepository(){

     init {

         refreshDataHome()
     }

     fun refreshDataHome(){
         catchHeaderPhoto()
         catchHomePhoto()
     }
     private fun getPhotoFromServer(
          count : Int
     ) : Flow<Status<List<PhotoHomeItem>>> {

         return wrapper {
             apiService.getRandomPhoto(
                 count = count
             )

         }
     }

     private fun catchHomePhoto(){

         coroutineScope.launch(Dispatchers.IO) {
            getPhotoFromServer(30)
                .collect {
                 if(it is Status.Success){

                         database
                             .getHomeDao()
                             .deletePosts()

                         val list: List<Post>? = it.toData()?.map {
                             mapperPost.map(it)
                         }

                         list?.let { it1 ->
                             database
                                 .getHomeDao()
                                 .insertPosts(it1)
                         }
                     }
                 }

             }
     }

    private fun catchHeaderPhoto(){

        coroutineScope.launch(Dispatchers.IO) {
            getPhotoFromServer(1)
                .collect {

                    if(it is Status.Success){
                        database
                            .getHomeDao()
                            .deleteHeader()
                        val list = it.toData()?.map {
                            mapperHeader.map(it)
                        }
                        list?.let { it1 ->
                            database
                                .getHomeDao()
                                .insertHeader(it1)
                        }
                    }

                }
        }
    }

    fun getHeaderPhoto() :Flow<List<Header>>{

        return database
            .getHomeDao()
            .getHeader()
    }

    fun getPosts() :Flow<List<Post>>{

        return database
            .getHomeDao()
            .getPosts()
    }

}