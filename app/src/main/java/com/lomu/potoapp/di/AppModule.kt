package com.lomu.potoapp.di

import com.lomu.potoapp.data.dataSource.local_database.PotoDatabase
import com.lomu.potoapp.data.dataSource.remote.retrofit.IApiService
import com.lomu.potoapp.data.repository.HomeRepository
import com.lomu.potoapp.data.repository.SearchRepository
import com.lomu.potoapp.domain.mapper.*
import com.lomu.potoapp.domain.useCase.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

      @Provides
      @Singleton
      fun provideRefreshHomeUseCase(
          homeRepository: HomeRepository,
      )
      : RefreshHomeUseCase {

           return RefreshHomeUseCase(homeRepository)
      }

      @Provides
      @Singleton
      fun provideGetHomePhotoUseCase(
          homeRepository: HomeRepository,
          mapper : MappingFromHomeEntityToHomeModel,
          coroutineScope: CoroutineScope
      ): GetHomePhotoUseCase{

            return GetHomePhotoUseCase(homeRepository,mapper,coroutineScope)
      }

      @Provides
      @Singleton
      fun provideMappingFromHomeEntityToHomeModel()
      :MappingFromHomeEntityToHomeModel{

           return MappingFromHomeEntityToHomeModel()
      }

      @Provides
      @Singleton
      fun provideGetHeaderPhotoUseCase(
          homeRepository: HomeRepository,
          mapper : MappingFromHeaderEntityToHeaderModel,
          coroutineScope: CoroutineScope
      ): GetHeaderPhotoUseCase{

           return GetHeaderPhotoUseCase(homeRepository,mapper,coroutineScope)
      }

      @Provides
      @Singleton
      fun provideMappingFromHeaderEntityToHeaderModel()
      : MappingFromHeaderEntityToHeaderModel{

          return MappingFromHeaderEntityToHeaderModel()
      }

      @Provides
      @Singleton
      fun provideGetPhotoResultSearchUseCase(
              searchRepository: SearchRepository,
              mapper : MappingFromResultSearchDtoToModel
      ): GetPhotoResultSearchUseCase{

           return GetPhotoResultSearchUseCase(searchRepository,mapper)
      }

      @Provides
      @Singleton
      fun provideMappingFromResultSearchDtoToModel(

      ):MappingFromResultSearchDtoToModel{

           return MappingFromResultSearchDtoToModel()
      }

      @Provides
      @Singleton
      fun provideSetLoveOnPhotoUseCase(
             homeRepository: HomeRepository
      ) : SetLoveOnPhotoUseCase{

           return SetLoveOnPhotoUseCase(homeRepository)
      }

      @Provides
      @Singleton
      fun provideHomeRepository(
          apiService : IApiService,
          database : PotoDatabase,
          mapperHeader : MappingFromHeaderDtoToHeaderEntity,
          mapperPost : MappingFromPostDtoToPostEntity,
          coroutineScope: CoroutineScope
      ) : HomeRepository{

           return HomeRepository(apiService, database,mapperHeader,mapperPost,coroutineScope)
      }

      @Provides
      @Singleton
      fun provideMappingFromHeaderDtoToHeaderEntity()
      : MappingFromHeaderDtoToHeaderEntity{

          return MappingFromHeaderDtoToHeaderEntity()
      }

      @Provides
      @Singleton
      fun provideMappingFromHeaderDtoToPostEntity()
      : MappingFromPostDtoToPostEntity{

          return MappingFromPostDtoToPostEntity()
      }

      @Provides
      @Singleton
      fun provideCoroutineScope()
      : CoroutineScope{

          return CoroutineScope(Dispatchers.Default)
      }

      @Provides
      @Singleton
      fun provideSearchRepository(
          apiService: IApiService
      ) : SearchRepository {

           return SearchRepository(apiService)
      }

}

