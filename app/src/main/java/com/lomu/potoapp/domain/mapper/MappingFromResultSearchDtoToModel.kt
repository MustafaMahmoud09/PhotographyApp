package com.lomu.potoapp.domain.mapper

import com.lomu.potoapp.data.dataSource.remote.dto.photo_search.Result
import com.lomu.potoapp.domain.models.PhotoSearchResult

class MappingFromResultSearchDtoToModel
    : IMap<Result,PhotoSearchResult> {


    override fun map(
        item : Result
    ): PhotoSearchResult {

         return PhotoSearchResult(
              id = item.id!!,
              image = item.urls?.regular.toString()!!,
              profile = item.user?.profileImage?.medium!!,
              name = item.user?.name.toString()!!,
              date = item.createdAt.toString()
         )
    }

}