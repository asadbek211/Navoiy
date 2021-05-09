package com.bizmiz.alishernavoiy.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bizmiz.alishernavoiy.NavoiyDatabase
import com.bizmiz.alishernavoiy.OnTextSizeChangeListener
import com.bizmiz.alishernavoiy.R
import com.bizmiz.alishernavoiy.Settings
import kotlinx.android.synthetic.main.fragment_lison.*
import kotlinx.android.synthetic.main.fragment_lison.view.*

class LisonFragment : Fragment(), OnTextSizeChangeListener {
    private lateinit var settings: Settings
    private var i = 1
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_lison, container, false)
        view.qism.text = "${i}/12"
        view.l_back.setOnClickListener { requireActivity().finish() }
        settings = Settings(requireContext())
        view.lison_matni.textSize = settings.getTextSize()
        view.l_minus.setOnClickListener {
            if (settings.getTextSize() > 12) {
                settings.decrementTextSize()
                onTextSizeChanged(settings.getTextSize())
            }
        }
        view.l_plus.setOnClickListener {
            if (settings.getTextSize() < 32) {
                settings.incrementTextSize()
                onTextSizeChanged(settings.getTextSize())
            }
        }
        view.lison_matni.text = NavoiyDatabase.getInstance(requireContext()).dao().getId(30).qiymat
        if (i == 1) {
            view.previous.isEnabled = false
            view.previous.setBackgroundResource(R.drawable.ic_previous_false)
        }
        view.next.setOnClickListener {
            view.previous.isEnabled = true
            view.previous.setBackgroundResource(R.drawable.ic_previous)
            if (i == 11) {
                view.next.isEnabled = false
                view.next.setBackgroundResource(R.drawable.ic_next_false)
            }
            view.qism.text = "${i + 1}/12"
            view.lison_matni.text =
                NavoiyDatabase.getInstance(requireContext()).dao().getId(30 + i).qiymat
            i++
        }
        view.previous.setOnClickListener {
            view.next.isEnabled = true
            view.next.setBackgroundResource(R.drawable.ic_next)
            if (i == 2) {
                view.previous.isEnabled = false
                view.previous.setBackgroundResource(R.drawable.ic_previous_false)
            }
            view.qism.text = "${i - 1}/12"
            view.lison_matni.text =
                NavoiyDatabase.getInstance(requireContext()).dao().getId(28 + i).qiymat
            i--
        }
        return view
    }

    override fun onTextSizeChanged(size: Float) {
        lison_matni.textSize = size
    }
}