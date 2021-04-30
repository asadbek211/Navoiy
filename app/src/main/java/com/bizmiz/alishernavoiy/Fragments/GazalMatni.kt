package com.bizmiz.alishernavoiy.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.bizmiz.alishernavoiy.R
import kotlinx.android.synthetic.main.fragment_gazallar_matni.view.*

class GazalMatni : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_gazallar_matni, container, false)
        view.gazal_matni.text = arguments?.getInt("key",8).toString()
        return view


    }
}