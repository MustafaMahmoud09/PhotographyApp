package com.lomu.potoapp.di

import com.lomu.potoapp.data.dataSource.remote.retrofit.IApiService
import com.lomu.potoapp.data.dataSource.remote.retrofit.AuthorizationInterceptor
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

     @Provides
     @Singleton
     fun provideIApiService(
         retrofit : Retrofit
     ): IApiService{

         return retrofit.create(IApiService::class.java)
     }

     @Provides
     @Singleton
     fun provideRetrofit(
         gsonConverterFactory :GsonConverterFactory,
         okHttpClient: OkHttpClient
     ) : Retrofit {
         val baseUrl = "https://api.unsplash.com/"

         return Retrofit
             .Builder()
             .baseUrl(baseUrl)
             .client(okHttpClient)
             .addConverterFactory(
                 gsonConverterFactory
             )
             .build()

     }

     @Provides
     @Singleton
     fun provideGsonConverterFactory()
     :GsonConverterFactory{

         return GsonConverterFactory.create()
     }

     @Provides
     @Singleton
     fun provideOkhttpClient(
         interceptor: Interceptor
     ): OkHttpClient{

         return OkHttpClient
             .Builder()
             .addInterceptor(interceptor)
             .build()
     }

     @Provides
     @Singleton
     fun provideInterceptor()
     : Interceptor{

         return AuthorizationInterceptor()
     }

}