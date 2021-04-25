package com.bizmiz.alishernavoiy.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "navoiy")
data class Navoiy(
        @PrimaryKey
        val id: Int,
        @ColumnInfo(name = "nomi")
        val nomi: String,
        @ColumnInfo(name = "qiymat")
        val qiymat: String
)