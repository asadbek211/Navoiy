package com.bizmiz.alishernavoiy

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.bizmiz.alishernavoiy.data.dao.NavoiyDao
import com.bizmiz.alishernavoiy.data.model.Navoiy

@Database(entities = [Navoiy::class], version = 1)
abstract class NavoiyDatabase : RoomDatabase() {
    companion object {
         lateinit var INSTANCE: NavoiyDatabase
        fun getInstance(context: Context): NavoiyDatabase {
           if (!::INSTANCE.isInitialized) {
               INSTANCE = Room.databaseBuilder(
                   context, NavoiyDatabase::class.java, "navoiy.db"
               ).allowMainThreadQueries().createFromAsset("navoiy.db").build()
           }
           return INSTANCE
           }
    }
    abstract fun dao(): NavoiyDao
}