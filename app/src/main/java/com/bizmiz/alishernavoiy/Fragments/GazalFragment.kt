package com.bizmiz.alishernavoiy.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bizmiz.alishernavoiy.R
import kotlinx.android.synthetic.main.fragment_gazal.view.*

class GazalFragment : Fragment(){
    private val fragment = GazalMatni()
    private val args = Bundle()

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_gazal, container, false)
        view.button1.setOnClickListener {
            args.putInt("key", 1)
            fragment.arguments = args
            requireActivity().supportFragmentManager.beginTransaction()
                .add(R.id.conteiner, GazalMatni()).commit()


        }

        return view
    }
}

