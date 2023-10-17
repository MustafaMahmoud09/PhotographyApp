package com.lomu.potoapp.data.dataSource.local_database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "headers")
data class Header(
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
    ) val postUrl : String
)
