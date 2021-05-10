package com.bizmiz.alishernavoiy.fragments

import android.content.pm.ActivityInfo
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bizmiz.alishernavoiy.Adapters.RuboiyAdapter
import com.bizmiz.alishernavoiy.NavoiyDatabase
import com.bizmiz.alishernavoiy.OnTextSizeChangeListener
import com.bizmiz.alishernavoiy.R
import com.bizmiz.alishernavoiy.Settings
import com.bizmiz.alishernavoiy.data.RuboiyData
import kotlinx.android.synthetic.main.fragment_ruboiy.view.*

class RuboiyFragment : Fragment(), OnTextSizeChangeListener {
    private lateinit var settings: Settings
    private val adapter = RuboiyAdapter()
    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_ruboiy, container, false)
        requireActivity().requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        settings = Settings(requireContext())
        view.r_minus.setOnClickListener {
            if (settings.getTextSize() > 12) {
                settings.decrementTextSize()
                onTextSizeChanged(settings.getTextSize())
            }
        }
        view.r_plus.setOnClickListener {
            if (settings.getTextSize() < 32) {
                settings.incrementTextSize()
                onTextSizeChanged(settings.getTextSize())
            }
        }

        view.recView.adapter = adapter
        setData()
        view.r_back.setOnClickListener {
            requireActivity().finish()
        }
        return view

    }

    private fun setData() {
        var list: MutableList<RuboiyData> = mutableListOf()
        for (i in 15..28) {
            list.add(
                RuboiyData(
                    NavoiyDatabase.getInstance(requireContext()).dao().getId(i).nomi,
                    NavoiyDatabase.getInstance(requireContext()).dao().getId(i).qiymat,
                    NavoiyDatabase.getInstance(requireContext()).dao().getId(i).type
                )
            )
        }
        adapter.models = list
    }

    override fun onTextSizeChanged(size: Float) {
        adapter.notifyDataSetChanged()
    }


}