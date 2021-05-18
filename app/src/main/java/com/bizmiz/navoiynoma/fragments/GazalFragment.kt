package com.bizmiz.navoiynoma.fragments

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bizmiz.navoiynoma.GazalMatniActivity
import com.bizmiz.navoiynoma.R
import kotlinx.android.synthetic.main.fragment_gazal.view.*

class GazalFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_gazal, container, false)
        requireActivity().requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        view.g_back.setOnClickListener {
            requireActivity().finish()
        }
        view.button1.setOnClickListener { IntentNumber(2, R.raw.qora_kozim) }
        view.button2.setOnClickListener { IntentNumber(3, R.raw.orazin_yopqach) }
        view.button3.setOnClickListener { IntentNumber(4, R.raw.on_sakkiz_ming_olam) }
        view.button4.setOnClickListener { IntentNumber(5, R.raw.vafokim) }
        view.button5.setOnClickListener { IntentNumber(7, R.raw.oshiq_oldim) }
        view.button6.setOnClickListener { IntentNumber(8, R.raw.qon_yutub) }
        view.button7.setOnClickListener { IntentNumber(9, R.raw.meni_men_istagan) }
        view.button8.setOnClickListener { IntentNumber(10, R.raw.kecha_kelgum) }
        view.button9.setOnClickListener { IntentNumber(13, R.raw.istangiz) }
        view.button10.setOnClickListener { IntentNumber(12, R.raw.xilatin) }
        view.button11.setOnClickListener { IntentNumber(48, 0) }
        view.button12.setOnClickListener { IntentNumber(6, 0) }
        view.button13.setOnClickListener { IntentNumber(11, 0) }
        return view
    }

    private fun IntentNumber(num: Int, gazalId: Int?) {
        val intent = Intent(requireContext(), GazalMatniActivity::class.java)
        intent.putExtra("number", num)
        intent.putExtra("id", gazalId)
        startActivity(intent)
    }
}

