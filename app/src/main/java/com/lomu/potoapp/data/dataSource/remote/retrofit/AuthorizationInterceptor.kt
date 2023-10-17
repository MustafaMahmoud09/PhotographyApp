package com.lomu.potoapp.data.dataSource.remote.retrofit

import okhttp3.Interceptor
import okhttp3.Response

class  AuthorizationInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
            .newBuilder()
            .addHeader(
                "Authorization",
                "Client-ID EQTdwOGZUf8qmsFupAy183BBEm_Ywi86NpwEJAKc5PE"
            ).build()

        return chain.proceed(request)
    }
}