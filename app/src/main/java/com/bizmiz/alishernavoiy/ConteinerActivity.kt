package com.bizmiz.alishernavoiy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bizmiz.alishernavoiy.fragments.*

class ConteinerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conteiner)
        when (intent.extras?.getInt("son")) {
            1 -> {
                supportFragmentManager.beginTransaction().add(R.id.conteiner, HayotiFragment())
                    .commit()
            }
            2 -> {
                supportFragmentManager.beginTransaction().add(R.id.conteiner, RuboiyFragment())
                    .commit()
            }
            3 -> {
                supportFragmentManager.beginTransaction().add(R.id.conteiner, GazalFragment())
                    .commit()
            }
            4 -> {
                supportFragmentManager.beginTransaction().add(R.id.conteiner, LisonFragment())
                    .commit()
            }
            5 -> {
                supportFragmentManager.beginTransaction().add(R.id.conteiner, XamsaFragment())
                    .commit()
            }
        }
    }
}