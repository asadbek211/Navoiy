package com.bizmiz.alishernavoiy

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.bizmiz.alishernavoiy.Fragments.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun OnClick(id: View) {
        when (id.id) {
            R.id.Hayoti -> {
                val intent = Intent(this, ConteinerActivity::class.java)
                intent.putExtra("son", 1)
                startActivity(intent)
            }
            R.id.ruboiy -> {
                val intent = Intent(this, ConteinerActivity::class.java)
                intent.putExtra("son", 2)
                startActivity(intent)
            }
            R.id.gazallari -> {
                val intent = Intent(this, ConteinerActivity::class.java)
                intent.putExtra("son", 3)
                startActivity(intent)
            }
            R.id.lison -> {
                val intent = Intent(this, ConteinerActivity::class.java)
                intent.putExtra("son", 4)
                startActivity(intent)
            }
            R.id.xamsa -> {
                val intent = Intent(this, ConteinerActivity::class.java)
                intent.putExtra("son", 5)
                startActivity(intent)
            }
        }
    }

}