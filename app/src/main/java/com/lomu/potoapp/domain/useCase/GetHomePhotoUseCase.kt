package com.lomu.potoapp.domain.useCase


import com.lomu.potoapp.data.repository.HomeRepository
import com.lomu.potoapp.domain.mapper.MappingFromHomeEntityToHomeModel
import com.lomu.potoapp.domain.models.HomePhoto
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch

class GetHomePhotoUseCase(
    private val homeRepository: HomeRepository,
    private val mapper : MappingFromHomeEntityToHomeModel,
    private val coroutineScope: CoroutineScope
){
     operator fun invoke()
     :Flow<List<HomePhoto>>{
         return flow {

                 homeRepository.getPosts().collect {

                     val list = it.map {
                            mapper.map(it)
                     }
                     emit(list)
                 }
         }
     }
}