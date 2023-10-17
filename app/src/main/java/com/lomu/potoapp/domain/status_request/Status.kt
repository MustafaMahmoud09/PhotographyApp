package com.lomu.potoapp.domain.status_request

sealed class Status<out T>{

     data class Success<T>(val data : T) : Status<T>()
     data class Error(val message : String) : Status<Nothing>()
     object Loading : Status<Nothing>()

     fun toData() : T? {

         return if(this is Success) data else null
     }

}
