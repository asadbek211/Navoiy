package com.bizmiz.alishernavoiy.data.dao

import androidx.room.Dao
import androidx.room.Query
import com.bizmiz.alishernavoiy.data.model.Navoiy

@Dao
interface NavoiyDao {
    @Query("SELECT * FROM navoiy  WHERE id=1")
    fun getId1(): Navoiy
    @Query("SELECT * FROM navoiy  WHERE id=29")
    fun getId2(): Navoiy
}