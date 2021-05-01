package com.bizmiz.alishernavoiy.Fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bizmiz.alishernavoiy.GazalMatniActivity
import com.bizmiz.alishernavoiy.R
import kotlinx.android.synthetic.main.fragment_gazal.view.*

class GazalFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_gazal, container, false)
        view.button1.setOnClickListener { IntentNumber(1) }
        view.button2.setOnClickListener { IntentNumber(2) }
        view.button3.setOnClickListener { IntentNumber(3) }
        view.button4.setOnClickListener { IntentNumber(4) }
        view.button5.setOnClickListener { IntentNumber(5) }
        view.button6.setOnClickListener { IntentNumber(6) }
        view.button7.setOnClickListener { IntentNumber(7) }
        view.button8.setOnClickListener { IntentNumber(8) }
        view.button9.setOnClickListener { IntentNumber(9) }
        view.button10.setOnClickListener { IntentNumber(10) }
        view.button11.setOnClickListener { IntentNumber(11) }
        view.button12.setOnClickListener { IntentNumber(12) }
        view.button13.setOnClickListener { IntentNumber(13) }
        return view
    }

    private fun IntentNumber(num: Int) {
        val intent = Intent(requireContext(), GazalMatniActivity::class.java)
        intent.putExtra("number", num)
        startActivity(intent)
    }
}

