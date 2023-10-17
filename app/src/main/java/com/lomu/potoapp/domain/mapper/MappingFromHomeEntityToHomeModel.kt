package com.lomu.potoapp.domain.mapper

import com.lomu.potoapp.data.dataSource.local_database.entity.Post
import com.lomu.potoapp.domain.models.HomePhoto

class MappingFromHomeEntityToHomeModel
    : IMap<Post,HomePhoto> {

    override fun map(item: Post): HomePhoto {
            return HomePhoto(
                id = item.id,
                name = item.userName,
                imageProfile = item.profileUrl,
                time = item.datePosting,
                photo = item.postUrl,
                title = item.title,
                numberOfLove = item.likes,
                stateLove = true
            )
    }

}