package com.lomu.potoapp.domain.mapper

import com.lomu.potoapp.data.dataSource.local_database.entity.Post
import com.lomu.potoapp.data.dataSource.remote.dto.photo_random.PhotoHomeItem

class MappingFromPostDtoToPostEntity
    : IMap<PhotoHomeItem,Post> {

    override fun map(item: PhotoHomeItem): Post {
            return Post(
                id = item.id!!,
                userName = item.user?.name!!,
                profileUrl = item.user.profileImage?.medium!!,
                datePosting = item.createdAt.toString(),
                postUrl = item.urls?.regular.toString(),
                likes = item.likes!!,
                title = item.description.toString()
            )
    }

}