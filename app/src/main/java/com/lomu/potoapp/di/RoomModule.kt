package com.lomu.potoapp.di

import android.content.Context
import androidx.room.Room
import com.lomu.potoapp.data.dataSource.local_database.PotoDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(
    SingletonComponent::class
)
object RoomModule {

     @Provides
     @Singleton
     fun provideRoomDatabase(
         @ApplicationContext context : Context,
     ) : PotoDatabase{

         return synchronized(this) {
                Room.
                databaseBuilder(
                    context = context,
                    klass = PotoDatabase::class.java,
                    name = "poto"
                ).build()
         }
     }
}