package com.bizmiz.alishernavoiy

import android.content.pm.ActivityInfo
import android.media.MediaPlayer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_gazal_matni.*

class GazalMatniActivity : AppCompatActivity() {
    private lateinit var settings: Settings
    private var check = false
    private var mediaPlayer = MediaPlayer()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gazal_matni)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        settings = Settings(this)
        gazal_matni.textSize = settings.getTextSize()
        val key = intent.extras?.getInt("number")
        val gazalId = intent.extras?.getInt("id")
        if (gazalId == 0) {
            music.isEnabled = false
        }
        gazal_matni.text = key?.let { NavoiyDatabase.getInstance(this).dao().getId(it).qiymat }

        ortga.setOnClickListener {
            if (check) {
                mediaPlayer.stop()
            }
            finish()
        }
        music.setOnClickListener {
            if (gazalId != null) {
                gazalAudioCreate(gazalId)
            }
            if (mediaPlayer.isPlaying) {
                mediaPlayer.pause()
                music.setBackgroundResource(R.drawable.play)
            } else {
                mediaPlayer.start()
                music.setBackgroundResource(R.drawable.pause)
            }
        }
        gazal_matni.textSize = settings.getTextSize()
        g_minus.setOnClickListener {
            if (settings.getTextSize() > 12) {
                settings.decrementTextSize()
                onTextSizeChanged(settings.getTextSize())
            }
        }
        g_plus.setOnClickListener {
            if (settings.getTextSize() < 32) {
                settings.incrementTextSize()
                onTextSizeChanged(settings.getTextSize())
            }
        }
    }

    override fun onBackPressed() {
        if (check) {
            mediaPlayer.stop()
        }
        finish()
    }

    private fun gazalAudioCreate(gazalId: Int) {
        if (!check) {
            mediaPlayer = MediaPlayer.create(this, gazalId)
            check = true
            music.setBackgroundResource(R.drawable.pause)
        }
    }

    private fun onTextSizeChanged(size: Float) {
        gazal_matni.textSize = size
    }

}