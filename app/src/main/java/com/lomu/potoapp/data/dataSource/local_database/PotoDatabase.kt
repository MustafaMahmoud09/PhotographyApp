package com.lomu.potoapp.data.dataSource.local_database


import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.lomu.potoapp.data.dataSource.local_database.dao.HomeDao
import com.lomu.potoapp.data.dataSource.local_database.entity.Header
import com.lomu.potoapp.data.dataSource.local_database.entity.Post

@Database(
    entities = [
        Header::class,
        Post::class
    ],
    version = 1
)
abstract class PotoDatabase : RoomDatabase(){

     abstract fun getHomeDao() : HomeDao

    companion object{

        private const val databaseName = "poto"

        @Volatile private var potoDatabase:PotoDatabase? = null

        fun getInstance(context: Context) : PotoDatabase?{

            setValueNoteDatabase(context)
            return potoDatabase

        }//end getInstance

        private fun setValueNoteDatabase(context: Context){

            if(potoDatabase == null){

                potoDatabase = synchronized(this) {

                    Room.databaseBuilder(
                        context,
                        PotoDatabase::class.java,
                        databaseName
                    ).build()

                }

            }//end if

        }//end setValueNoteDatabase

    }//end companion object

}//end companion object