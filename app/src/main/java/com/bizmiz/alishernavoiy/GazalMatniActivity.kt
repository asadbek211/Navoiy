package com.bizmiz.alishernavoiy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class GazalMatniActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gazal_matni)
        val key = intent.extras?.getInt("number")

    }
    private fun gazalId(id:Int){

    }
}