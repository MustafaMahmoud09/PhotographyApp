package com.lomu.potoapp.data.repository

import com.lomu.potoapp.domain.status_request.Status
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.Response


open class BaseRepository {

    protected fun<T> wrapper(
        endPoint : suspend () -> Response<T>
    ): Flow<Status<T>> {

          return flow {
              try {
                 emit(
                    value = Status.Loading
                 )
                  val response = endPoint()

                  if(response.isSuccessful){

                     emit(value = Status
                         .Success(
                             data = response.body()!!
                         )
                     )

                  }else{
                     emit(value = Status
                         .Error(
                             message = "End point Not correct"
                         )
                     )
                  }
              }catch (ex : Exception){
                   emit(value = Status
                       .Error(
                           message = ex.message.toString()
                       )
                   )
              }
          }

     }
}