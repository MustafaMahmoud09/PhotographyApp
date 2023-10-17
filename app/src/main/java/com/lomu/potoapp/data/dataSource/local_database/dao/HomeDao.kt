package com.lomu.potoapp.data.dataSource.local_database.dao

import androidx.room.*
import com.lomu.potoapp.data.dataSource.local_database.entity.Header
import com.lomu.potoapp.data.dataSource.local_database.entity.Post
import kotlinx.coroutines.flow.Flow

@Dao
interface HomeDao {

    @Insert
    suspend fun insertHeader(header : List<Header>)

    @Query("DELETE FROM headers")
    suspend fun deleteHeader()

    @Query("SELECT * FROM headers")
    fun getHeader() : Flow<List<Header>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPosts(data : List<Post>)

    @Query("DELETE FROM posts")
    suspend fun deletePosts()

    @Query("SELECT * FROM posts")
    fun getPosts() : Flow<List<Post>>
}