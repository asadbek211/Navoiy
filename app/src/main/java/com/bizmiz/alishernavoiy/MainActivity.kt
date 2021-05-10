package com.bizmiz.alishernavoiy

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
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
            R.id.dastur_haqida -> {
                dasturHaqida()
            }
        }
    }

    private fun dasturHaqida() {
        val message = AlertDialog.Builder(this);
        message.setTitle("Dastur Haqida")
            .setMessage(NavoiyDatabase.getInstance(this).dao().getId(29).qiymat)
            .setCancelable(false)
            .setPositiveButton("Yopish") { message, _ ->
                message.dismiss()
            }
            .create().show()
    }

    override fun onBackPressed() {
        exit()
    }

    private fun exit() {
        val message = AlertDialog.Builder(this);
        message.setTitle("Dasturdan chiqish")
            .setMessage("Dasturdan chiqmoqchimisiz?")
            .setCancelable(false)
            .setPositiveButton("Yo'q") { message, _ ->
                message.dismiss()
            }.setNegativeButton("Ha") { message, _ ->
                finish()
            }
            .create().show()
    }

}