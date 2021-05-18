package com.bizmiz.alishernavoiy.fragments

import android.animation.ObjectAnimator
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bizmiz.alishernavoiy.NavoiyDatabase
import com.bizmiz.alishernavoiy.OnTextSizeChangeListener
import com.bizmiz.alishernavoiy.R
import com.bizmiz.alishernavoiy.Settings
import kotlinx.android.synthetic.main.fragment_xamsa.*
import kotlinx.android.synthetic.main.fragment_xamsa.view.*

class XamsaFragment : Fragment(), OnTextSizeChangeListener {
    private lateinit var settings: Settings
    private var i = 1
    private var boolean = true
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_xamsa, container, false)
        view.x_qism.text = "${i}/6"
        view.x_back.setOnClickListener { requireActivity().finish() }
        view.x_tugma.setOnClickListener {
            menuAnim(view)
        }
        settings = Settings(requireContext())
        view.xamsa_matni.textSize = settings.getTextSize()
        view.x_shrift.text = settings.getTextSize().toInt().toString()
        view.x_minus.setOnClickListener {
            if (settings.getTextSize() > 12) {
                settings.decrementTextSize()
                onTextSizeChanged(settings.getTextSize())
                view.x_shrift.text = settings.getTextSize().toInt().toString()
            }
        }
        view.x_plus.setOnClickListener {
            if (settings.getTextSize() < 32) {
                settings.incrementTextSize()
                onTextSizeChanged(settings.getTextSize())
                view.x_shrift.text = settings.getTextSize().toInt().toString()
            }
        }
        view.xamsa_matni.text = NavoiyDatabase.getInstance(requireContext()).dao().getId(42).qiymat
        if (i == 1) {
            view.x_previous.isEnabled = false
            view.x_previous.setBackgroundResource(R.drawable.ic_previous_false)
        }
        view.x_next.setOnClickListener {
            view.x_previous.isEnabled = true
            view.x_previous.setBackgroundResource(R.drawable.ic_previous)
            if (i == 5) {
                view.x_next.isEnabled = false
                view.x_next.setBackgroundResource(R.drawable.ic_next_false)
            }
            view.x_qism.text = "${i + 1}/6"
            view.xamsa_matni.text =
                NavoiyDatabase.getInstance(requireContext()).dao().getId(42 + i).qiymat
            i++
        }
        view.x_previous.setOnClickListener {
            view.x_next.isEnabled = true
            view.x_next.setBackgroundResource(R.drawable.ic_next)
            if (i == 2) {
                view.x_previous.isEnabled = false
                view.x_previous.setBackgroundResource(R.drawable.ic_previous_false)
            }
            view.x_qism.text = "${i - 1}/6"
            view.xamsa_matni.text =
                NavoiyDatabase.getInstance(requireContext()).dao().getId(40 + i).qiymat
            i--
        }
        return view
    }

    override fun onTextSizeChanged(size: Float) {
        xamsa_matni.textSize = size
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