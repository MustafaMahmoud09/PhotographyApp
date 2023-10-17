package com.lomu.potoapp.domain.mapper

import com.lomu.potoapp.data.dataSource.local_database.entity.Header
import com.lomu.potoapp.data.dataSource.remote.dto.photo_random.PhotoHomeItem
import com.lomu.potoapp.domain.models.HeaderPhoto

class MappingFromHeaderEntityToHeaderModel
    : IMap<Header,HeaderPhoto> {

    override fun map(item: Header): HeaderPhoto {
            return HeaderPhoto(
                id = item.id,
                name = item.userName,
                imageProfile = item.profileUrl,
                time = item.datePosting,
                photo = item.postUrl
            )
    }

}