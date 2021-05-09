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
import kotlinx.android.synthetic.main.fragment_hayoti.*
import kotlinx.android.synthetic.main.fragment_hayoti.view.*

@Suppress("UNREACHABLE_CODE")
class HayotiFragment : Fragment(), OnTextSizeChangeListener {

    private lateinit var settings: Settings

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_hayoti, container, false)
        view.hayoti_ijodi.text = NavoiyDatabase.getInstance(requireContext()).dao().getId(1).qiymat
        view.h_back.setOnClickListener { requireActivity().finish() }

        settings = Settings(requireContext())
        view.hayoti_ijodi.textSize = settings.getTextSize()
        view.h_minus.setOnClickListener {
            if (settings.getTextSize() > 12) {
                settings.decrementTextSize()
                onTextSizeChanged(settings.getTextSize())
            }
        }
        view.h_plus.setOnClickListener {
            if (settings.getTextSize() < 32) {
                settings.incrementTextSize()
                onTextSizeChanged(settings.getTextSize())
            }
        }

        return view
    }

    override fun onTextSizeChanged(size: Float) {
        hayoti_ijodi.textSize = size
    }

}
