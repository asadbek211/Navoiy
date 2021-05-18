package com.bizmiz.navoiynoma

import com.bizmiz.navoiynoma.data.dao.NavoiyDao

class NavoiyPresenter(private var dao:NavoiyDao) {
    fun getId(id:Int){
        dao.getId(id).qiymat
    }
    fun getIdByNumber(id:Int,number:Int){
        when(number){
            1-> dao.getId(id).nomi
            2-> dao.getId(id).qiymat
            3-> dao.getId(id).type
        }
    }
}