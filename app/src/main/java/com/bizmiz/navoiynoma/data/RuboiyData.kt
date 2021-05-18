package com.bizmiz.navoiynoma.data

import androidx.room.Ignore

data class RuboiyData(val RuboiyNomi:String, val RuboiyMatni:String,val type:String) {
    @Ignore
    var isOpen: Boolean = false
}