package com.lomu.potoapp.domain.useCase

import com.lomu.potoapp.data.repository.SearchRepository
import com.lomu.potoapp.domain.mapper.MappingFromResultSearchDtoToModel
import com.lomu.potoapp.domain.models.PhotoSearchResult
import com.lomu.potoapp.domain.status_request.Status
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch

class GetPhotoResultSearchUseCase(
    private val searchRepository: SearchRepository,
    private val mapper : MappingFromResultSearchDtoToModel
) {

    operator fun invoke(
          key : String
     ) : Flow<Status<List<PhotoSearchResult>>> {

         return flow {
                 searchRepository.searchOnPhoto(key = key).collect {
                     when (it) {
                         is Status.Success -> {
                               emit(
                                  value = Status.Success(
                                      data = it.toData()!!.results!!.map {
                                          mapper.map(it)
                                      }
                                  )
                               )
                         }
                         is Status.Error -> {
                                emit(
                                    value = Status.Error(it.message)
                                )
                         }
                         else -> {
                                emit(
                                    value = Status.Loading
                                )
                         }
                     }
                 }
             }

     }
}