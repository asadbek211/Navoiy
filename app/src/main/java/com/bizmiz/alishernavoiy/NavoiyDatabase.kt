package com.bizmiz.alishernavoiy

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.bizmiz.alishernavoiy.data.dao.NavoiyDao
import com.bizmiz.alishernavoiy.data.models.Navoiy

@Database(entities = [Navoiy::class], version = 1)
abstract class NavoiyDatabase : RoomDatabase() {
    companion object {
        private lateinit var INSTANCE: NavoiyDatabase
        fun getInstanse(context: Context): NavoiyDatabase =
                Room.databaseBuilder(
                        context, NavoiyDatabase::class.java, "navoiy.db"
                ).allowMainThreadQueries().createFromAsset("navoiy.db").build()
    }

    abstract fun dao(): NavoiyDao
}