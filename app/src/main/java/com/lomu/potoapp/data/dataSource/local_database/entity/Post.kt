package com.lomu.potoapp.data.dataSource.local_database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "posts")
data class Post(
    @PrimaryKey(
        autoGenerate = false
    ) val id : String,
    @ColumnInfo(
        name = "user_name"
    ) val userName : String,
    @ColumnInfo(
        name = "profile_url"
    ) val profileUrl : String,
    @ColumnInfo(
        name = "date"
    ) val datePosting : String,
    @ColumnInfo(
        name = "post_url"
    ) val postUrl : String,
    @ColumnInfo(
        name = "likes"
    ) val likes : Int ,
    @ColumnInfo(
        name = "title"
    ) val title : String
)