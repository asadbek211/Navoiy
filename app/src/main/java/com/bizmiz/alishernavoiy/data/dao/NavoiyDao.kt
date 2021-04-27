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
    @Query("SELECT * FROM navoiy  WHERE id=15")
    fun ruboiy1(): Navoiy
    @Query("SELECT * FROM navoiy  WHERE id=16")
    fun ruboiy2(): Navoiy
    @Query("SELECT * FROM navoiy  WHERE id=17")
    fun ruboiy3(): Navoiy
    @Query("SELECT * FROM navoiy  WHERE id=18")
    fun ruboiy4(): Navoiy
    @Query("SELECT * FROM navoiy  WHERE id=19")
    fun ruboiy5(): Navoiy
    @Query("SELECT * FROM navoiy  WHERE id=20")
    fun ruboiy6(): Navoiy
    @Query("SELECT * FROM navoiy  WHERE id=21")
    fun ruboiy7(): Navoiy
    @Query("SELECT * FROM navoiy  WHERE id=22")
    fun ruboiy8(): Navoiy
    @Query("SELECT * FROM navoiy  WHERE id=23")
    fun ruboiy9(): Navoiy
    @Query("SELECT * FROM navoiy  WHERE id=24")
    fun tuyuq1(): Navoiy
    @Query("SELECT * FROM navoiy  WHERE id=25")
    fun tuyuq2(): Navoiy
    @Query("SELECT * FROM navoiy  WHERE id=26")
    fun tuyuq3(): Navoiy
    @Query("SELECT * FROM navoiy  WHERE id=27")
    fun tuyuq4(): Navoiy
    @Query("SELECT * FROM navoiy  WHERE id=28")
    fun tuyuq5(): Navoiy

}