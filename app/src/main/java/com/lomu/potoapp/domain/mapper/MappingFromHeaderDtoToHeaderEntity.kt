package com.lomu.potoapp.domain.mapper

import com.lomu.potoapp.data.dataSource.local_database.entity.Header
import com.lomu.potoapp.data.dataSource.remote.dto.photo_random.PhotoHomeItem

class MappingFromHeaderDtoToHeaderEntity
    : IMap<PhotoHomeItem,Header> {

    override fun map(item: PhotoHomeItem): Header {
            return Header(
                id = item.id!!,
                userName = item.user?.name!!,
                profileUrl = item.user.profileImage?.medium!!,
                datePosting = item.createdAt.toString(),
                postUrl = item.urls?.regular.toString()
            )
    }

}