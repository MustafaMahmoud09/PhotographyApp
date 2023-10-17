package com.lomu.potoapp.domain.useCase

import com.lomu.potoapp.data.repository.HomeRepository
import com.lomu.potoapp.domain.mapper.MappingFromHeaderEntityToHeaderModel
import com.lomu.potoapp.domain.models.HeaderPhoto
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class GetHeaderPhotoUseCase(
    private val homeRepository: HomeRepository,
    private val mapper : MappingFromHeaderEntityToHeaderModel,
    private val coroutineScope: CoroutineScope
) {
     operator fun invoke()
     :Flow<HeaderPhoto>{
       return flow {

               homeRepository.getHeaderPhoto().collect {
                  val list = it.map {
                       mapper.map(it)
                   }
                   if(list.isNotEmpty()) {
                       emit(list[0])
                   }
               }
       }
     }
}