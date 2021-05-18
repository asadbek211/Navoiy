package com.bizmiz.navoiynoma

import android.animation.ObjectAnimator
import android.content.Context
import android.content.pm.ActivityInfo
import android.media.MediaPlayer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bizmiz.navoiynoma.data.dao.NavoiyDao
import kotlinx.android.synthetic.main.activity_gazal_matni.*

class GazalMatniActivity : AppCompatActivity() {
    var boolean = true
    private lateinit var settings: Settings
    private lateinit var dao: NavoiyDao
    private lateinit var navoiyPresenter: NavoiyPresenter
    private var check = false
    private var mediaPlayer = MediaPlayer()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gazal_matni)
        navoiyPresenter = NavoiyPresenter(dao)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        settings = Settings(this)
        gazal_matni.textSize = settings.getTextSize()
        g_shrift.text = settings.getTextSize().toInt().toString()
        val key = intent.extras?.getInt("number")
        val gazalId = intent.extras?.getInt("id")
        if (gazalId == 0) {
            music.isEnabled = false
            music.setImageResource(R.drawable.play_back)
        }
        gazal_matni.text = navoiyPresenter.getId(key!!.toInt()).toString()
        g_tugma.setOnClickListener {
            menuAnim()
        }
        ortga.setOnClickListener {
            if (check) {
                mediaPlayer.stop()
            }
            finish()
        }
        music.setOnClickListener {
            if (boolean) {
                if (gazalId != null) {
                    gazalAudioCreate(gazalId)
                }
                if (mediaPlayer.isPlaying) {
                    mediaPlayer.pause()
                    music.setImageResource(R.drawable.play)
                } else {
                    mediaPlayer.start()
                    music.setImageResource(R.drawable.pause)
                }
            }
        }
        gazal_matni.textSize = settings.getTextSize()
        g_minus.setOnClickListener {
            if (settings.getTextSize() > 12) {
                settings.decrementTextSize()
                onTextSizeChanged(settings.getTextSize())
                g_shrift.text = settings.getTextSize().toInt().toString()
            }
        }
        g_plus.setOnClickListener {
            if (settings.getTextSize() < 32) {
                settings.incrementTextSize()
                onTextSizeChanged(settings.getTextSize())
                g_shrift.text = settings.getTextSize().toInt().toString()
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
        if (boolean) {
            if (!check) {
                mediaPlayer = MediaPlayer.create(this, gazalId)
                check = true
                music.setImageResource(R.drawable.pause)
            }
        }
    }

    private fun onTextSizeChanged(size: Float) {
        gazal_matni.textSize = size
    }

    private fun menuAnim() {
        if (boolean) {
            ObjectAnimator.ofFloat(l_contener, "translationX", pxFromDp(this, -95f)).apply {
                duration = 500
                start()
            }
            boolean = false
        } else {
            ObjectAnimator.ofFloat(l_contener, "translationX", pxFromDp(this, 0f)).apply {
                duration = 500
                start()
            }
            boolean = true
        }
    }

    private fun pxFromDp(context: Context, dp: Float): Float {
        return dp * context.resources.displayMetrics.density
    }

}