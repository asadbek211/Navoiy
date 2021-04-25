package com.bizmiz.alishernavoiy.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bizmiz.alishernavoiy.MainActivity
import com.bizmiz.alishernavoiy.NavoiyDatabase
import com.bizmiz.alishernavoiy.R
import kotlinx.android.synthetic.main.fragment_hayoti.*
import kotlinx.android.synthetic.main.fragment_hayoti.view.*

class HayotiFragment : Fragment() {
 var px = 20f
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_hayoti, container, false)
        view.hayoti_ijodi.text = NavoiyDatabase.getInstance(requireContext()).dao().getId1().qiymat
        view.back.setOnClickListener {view.hayoti_ijodi.textSize = PxToSp(px)
        px+=1f}

        return view
//        requireActivity().finish()
    }
    private fun PxToSp(px:Float): Float {
        return px / resources.displayMetrics.scaledDensity
    }
}