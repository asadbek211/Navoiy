package com.bizmiz.navoiynoma.fragments

import android.animation.ObjectAnimator
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bizmiz.navoiynoma.*
import com.bizmiz.navoiynoma.data.dao.NavoiyDao
import kotlinx.android.synthetic.main.fragment_lison.*
import kotlinx.android.synthetic.main.fragment_lison.view.*

class LisonFragment : Fragment(), OnTextSizeChangeListener {
    private lateinit var settings: Settings
    private lateinit var dao: NavoiyDao
    private lateinit var navoiyPresenter: NavoiyPresenter
    private var i = 1
    private var boolean = true
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_lison, container, false)
        view.qism.text = "${i}/12"
        view.l_back.setOnClickListener { requireActivity().finish() }
        view.l_tugma.setOnClickListener {
            menuAnim(view)
        }
        settings = Settings(requireContext())
        navoiyPresenter = NavoiyPresenter(dao)
        view.lison_matni.textSize = settings.getTextSize()
        view.l_shrift.text = settings.getTextSize().toInt().toString()
        view.l_minus.setOnClickListener {
            if (settings.getTextSize() > 12) {
                settings.decrementTextSize()
                onTextSizeChanged(settings.getTextSize())
                view.l_shrift.text = settings.getTextSize().toInt().toString()
            }
        }
        view.l_plus.setOnClickListener {
            if (settings.getTextSize() < 32) {
                settings.incrementTextSize()
                onTextSizeChanged(settings.getTextSize())
                view.l_shrift.text = settings.getTextSize().toInt().toString()
            }
        }
        view.lison_matni.text = navoiyPresenter.getId(30).toString()
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
                navoiyPresenter.getId(30+i).toString()
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
                navoiyPresenter.getId(28+i).toString()
            i--
        }
        return view
    }

    override fun onTextSizeChanged(size: Float) {
        lison_matni.textSize = size
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