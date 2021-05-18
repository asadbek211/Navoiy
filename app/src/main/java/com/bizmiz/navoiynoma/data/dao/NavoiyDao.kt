package com.bizmiz.alishernavoiy.data.dao

import androidx.room.Dao
import androidx.room.Query
import com.bizmiz.alishernavoiy.data.model.Navoiy

@Dao
interface NavoiyDao {
    @Query("SELECT * FROM navoiy  WHERE id=:id")
    fun getId(id:Int): Navoiy


}