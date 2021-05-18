package com.bizmiz.navoiynoma.fragments

import android.animation.ObjectAnimator
import android.content.Context
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bizmiz.navoiynoma.*
import com.bizmiz.navoiynoma.Adapters.RuboiyAdapter
import com.bizmiz.navoiynoma.data.RuboiyData
import com.bizmiz.navoiynoma.data.dao.NavoiyDao
import kotlinx.android.synthetic.main.fragment_ruboiy.view.*

class RuboiyFragment : Fragment(), OnTextSizeChangeListener {
    var boolean = true
    private lateinit var settings: Settings
    private lateinit var dao: NavoiyDao
    private lateinit var navoiyPresenter: NavoiyPresenter
    private val adapter = RuboiyAdapter()
    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_ruboiy, container, false)
        requireActivity().requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        settings = Settings(requireContext())
        navoiyPresenter = NavoiyPresenter(dao)
        view.r_shrift.text = settings.getTextSize().toInt().toString()
        view.r_tugma.setOnClickListener {
            menuAnim(view)
        }
        view.r_minus.setOnClickListener {
            if (settings.getTextSize() > 12) {
                settings.decrementTextSize()
                onTextSizeChanged(settings.getTextSize())
                view.r_shrift.text = settings.getTextSize().toInt().toString()
            }
        }
        view.r_plus.setOnClickListener {
            if (settings.getTextSize() < 32) {
                settings.incrementTextSize()
                onTextSizeChanged(settings.getTextSize())
                view.r_shrift.text = settings.getTextSize().toInt().toString()
            }
        }

        view.recView.adapter = adapter
        setData()
        view.r_back.setOnClickListener {
            requireActivity().finish()
        }
        return view

    }

     fun setData() {
        var list: MutableList<RuboiyData> = mutableListOf()
        for (i in 15..28) {
            list.add(
                RuboiyData(
                    navoiyPresenter.getIdByNumber(i,1).toString(),
                    navoiyPresenter.getIdByNumber(i,2).toString(),
                    navoiyPresenter.getIdByNumber(i,3).toString()
                )
            )
        }
        adapter.models = list
    }

    override fun onTextSizeChanged(size: Float) {
        adapter.notifyDataSetChanged()
    }

    private fun menuAnim(view: View) {
        if (boolean) {
            ObjectAnimator.ofFloat(
                view.l_contener,
                "translationX",
                pxFromDp(requireContext(), -95f)
            ).apply {
                duration = 500
                start()
            }
            boolean = false
        } else {
            ObjectAnimator.ofFloat(view.l_contener, "translationX", pxFromDp(requireContext(), 0f))
                .apply {
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