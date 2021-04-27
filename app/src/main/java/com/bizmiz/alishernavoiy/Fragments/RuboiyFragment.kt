package com.bizmiz.alishernavoiy.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat
import com.bizmiz.alishernavoiy.NavoiyDatabase
import com.bizmiz.alishernavoiy.R
import kotlinx.android.synthetic.main.fragment_ruboiy.*
import kotlinx.android.synthetic.main.fragment_ruboiy.view.*

class RuboiyFragment : Fragment() {
    var ok1 = false;
    var ok2 = false;
    var ok3 = false;
    var ok4 = false;
    var ok5 = false;
    var ok6 = false;
    var ok7 = false;
    var ok8 = false;
    var ok9 = false;
    var ok10 = false;
    var ok11 = false;
    var ok12 = false;
    var ok13 = false;
    var ok14 = false
    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_ruboiy, container, false)
        view.txt1.text = NavoiyDatabase.getInstance(requireContext()).dao().ruboiy1().qiymat
        view.txt2.text = NavoiyDatabase.getInstance(requireContext()).dao().ruboiy2().qiymat
        view.txt3.text = NavoiyDatabase.getInstance(requireContext()).dao().ruboiy3().qiymat
        view.txt4.text = NavoiyDatabase.getInstance(requireContext()).dao().ruboiy4().qiymat
        view.txt5.text = NavoiyDatabase.getInstance(requireContext()).dao().ruboiy5().qiymat
        view.txt6.text = NavoiyDatabase.getInstance(requireContext()).dao().ruboiy6().qiymat
        view.txt7.text = NavoiyDatabase.getInstance(requireContext()).dao().ruboiy7().qiymat
        view.txt8.text = NavoiyDatabase.getInstance(requireContext()).dao().ruboiy8().qiymat
        view.txt9.text = NavoiyDatabase.getInstance(requireContext()).dao().ruboiy9().qiymat
        view.txt10.text = NavoiyDatabase.getInstance(requireContext()).dao().tuyuq1().qiymat
        view.txt11.text = NavoiyDatabase.getInstance(requireContext()).dao().tuyuq2().qiymat
        view.txt12.text = NavoiyDatabase.getInstance(requireContext()).dao().tuyuq3().qiymat
        view.txt13.text = NavoiyDatabase.getInstance(requireContext()).dao().tuyuq4().qiymat
        view.txt14.text = NavoiyDatabase.getInstance(requireContext()).dao().tuyuq5().qiymat
        view.back.setOnClickListener {
            requireActivity().finish()
        }
        view.btn1.setOnClickListener {
            btn1OnClickListener(view)
        }
        view.btn2.setOnClickListener {
            btn2OnClickListener(view)
        }
        view.btn3.setOnClickListener {
            btn3OnClickListener(view)
        }
        view.btn4.setOnClickListener {
            btn4OnClickListener(view)
        }
        view.btn5.setOnClickListener {
            btn5OnClickListener(view)
        }
        view.btn6.setOnClickListener {
            btn6OnClickListener(view)
        }
        view.btn7.setOnClickListener {
            btn7OnClickListener(view)
        }
        view.btn8.setOnClickListener {
            btn8OnClickListener(view)
        }
        view.btn9.setOnClickListener {
            btn9OnClickListener(view)
        }
        view.btn10.setOnClickListener {
            btn10OnClickListener(view)
        }
        view.btn11.setOnClickListener {
            btn11OnClickListener(view)
        }
        view.btn12.setOnClickListener {
            btn12OnClickListener(view)
        }
        view.btn13.setOnClickListener {
            btn13OnClickListener(view)
        }
        view.btn14.setOnClickListener {
            btn14OnClickListener(view)
        }
        return view
    }
    private fun btn1OnClickListener(view: View){
        if (!ok1) {
            view.txt1.visibility = View.VISIBLE
            view.btn1.setBackgroundResource(R.drawable.shape_knopka4)
            val drawable1 = VectorDrawableCompat.create(
                resources,
                R.drawable.tepaga,
                resources.newTheme()
            )
            val drawable2 = VectorDrawableCompat.create(
                resources,
                R.drawable.icon,
                resources.newTheme()
            )
            btn1.setCompoundDrawablesRelativeWithIntrinsicBounds(
                drawable2,
                null,
                drawable1,
                null
            )
            ok1 = true
        } else {
            txt1.visibility = View.GONE
            btn1.setBackgroundResource(R.drawable.shape_knopka3)
            val drawable =
                VectorDrawableCompat.create(resources, R.drawable.pastga, resources.newTheme())
            btn1.setCompoundDrawablesRelativeWithIntrinsicBounds(
                null,
                null,
                drawable,
                null
            )
            ok1 = false
        }

    }
    private fun btn2OnClickListener(view: View){
        if (!ok2) {
            view.txt2.visibility = View.VISIBLE
            view.btn2.setBackgroundResource(R.drawable.shape_knopka4)
            val drawable1 = VectorDrawableCompat.create(
                resources,
                R.drawable.tepaga,
                resources.newTheme()
            )
            val drawable2 = VectorDrawableCompat.create(
                resources,
                R.drawable.icon,
                resources.newTheme()
            )
            btn2.setCompoundDrawablesRelativeWithIntrinsicBounds(
                drawable2,
                null,
                drawable1,
                null
            )
            ok2 = true
        } else {
            txt2.visibility = View.GONE
            btn2.setBackgroundResource(R.drawable.shape_knopka3)
            val drawable =
                VectorDrawableCompat.create(resources, R.drawable.pastga, resources.newTheme())
            btn2.setCompoundDrawablesRelativeWithIntrinsicBounds(
                null,
                null,
                drawable,
                null
            )
            ok2 = false
        }

    }
    private fun btn3OnClickListener(view: View){
        if (!ok3) {
            view.txt3.visibility = View.VISIBLE
            view.btn3.setBackgroundResource(R.drawable.shape_knopka4)
            val drawable1 = VectorDrawableCompat.create(
                resources,
                R.drawable.tepaga,
                resources.newTheme()
            )
            val drawable2 = VectorDrawableCompat.create(
                resources,
                R.drawable.icon,
                resources.newTheme()
            )
            btn3.setCompoundDrawablesRelativeWithIntrinsicBounds(
                drawable2,
                null,
                drawable1,
                null
            )
            ok3 = true
        } else {
            txt3.visibility = View.GONE
            btn3.setBackgroundResource(R.drawable.shape_knopka3)
            val drawable =
                VectorDrawableCompat.create(resources, R.drawable.pastga, resources.newTheme())
            btn3.setCompoundDrawablesRelativeWithIntrinsicBounds(
                null,
                null,
                drawable,
                null
            )
            ok3 = false
        }

    }
    private fun btn4OnClickListener(view: View){
        if (!ok4) {
            view.txt4.visibility = View.VISIBLE
            view.btn4.setBackgroundResource(R.drawable.shape_knopka4)
            val drawable1 = VectorDrawableCompat.create(
                resources,
                R.drawable.tepaga,
                resources.newTheme()
            )
            val drawable2 = VectorDrawableCompat.create(
                resources,
                R.drawable.icon,
                resources.newTheme()
            )
            btn4.setCompoundDrawablesRelativeWithIntrinsicBounds(
                drawable2,
                null,
                drawable1,
                null
            )
            ok4 = true
        } else {
            txt4.visibility = View.GONE
            btn4.setBackgroundResource(R.drawable.shape_knopka3)
            val drawable =
                VectorDrawableCompat.create(resources, R.drawable.pastga, resources.newTheme())
            btn4.setCompoundDrawablesRelativeWithIntrinsicBounds(
                null,
                null,
                drawable,
                null
            )
            ok4 = false
        }

    }
    private fun btn5OnClickListener(view: View){
        if (!ok5){
            view.txt5.visibility = View.VISIBLE
            view.btn5.setBackgroundResource(R.drawable.shape_knopka4)
            val drawable1 = VectorDrawableCompat.create(
                resources,
                R.drawable.tepaga,
                resources.newTheme()
            )
            val drawable2 = VectorDrawableCompat.create(
                resources,
                R.drawable.icon,
                resources.newTheme()
            )
            btn5.setCompoundDrawablesRelativeWithIntrinsicBounds(
                drawable2,
                null,
                drawable1,
                null
            )
            ok5 = true
        } else {
            txt5.visibility = View.GONE
            btn5.setBackgroundResource(R.drawable.shape_knopka3)
            val drawable =
                VectorDrawableCompat.create(resources, R.drawable.pastga, resources.newTheme())
            btn5.setCompoundDrawablesRelativeWithIntrinsicBounds(
                null,
                null,
                drawable,
                null
            )
            ok5 = false
        }

    }
    private fun btn6OnClickListener(view: View){
        if (!ok6) {
            view.txt6.visibility = View.VISIBLE
            view.btn6.setBackgroundResource(R.drawable.shape_knopka4)
            val drawable1 = VectorDrawableCompat.create(
                resources,
                R.drawable.tepaga,
                resources.newTheme()
            )
            val drawable2 = VectorDrawableCompat.create(
                resources,
                R.drawable.icon,
                resources.newTheme()
            )
            btn6.setCompoundDrawablesRelativeWithIntrinsicBounds(
                drawable2,
                null,
                drawable1,
                null
            )
            ok6 = true
        } else {
            txt6.visibility = View.GONE
            btn6.setBackgroundResource(R.drawable.shape_knopka3)
            val drawable =
                VectorDrawableCompat.create(resources, R.drawable.pastga, resources.newTheme())
            btn6.setCompoundDrawablesRelativeWithIntrinsicBounds(
                null,
                null,
                drawable,
                null
            )
            ok6 = false
        }

    }
    private fun btn7OnClickListener(view: View){
        if (!ok7) {
            view.txt7.visibility = View.VISIBLE
            view.btn7.setBackgroundResource(R.drawable.shape_knopka4)
            val drawable1 = VectorDrawableCompat.create(
                resources,
                R.drawable.tepaga,
                resources.newTheme()
            )
            val drawable2 = VectorDrawableCompat.create(
                resources,
                R.drawable.icon,
                resources.newTheme()
            )
            btn7.setCompoundDrawablesRelativeWithIntrinsicBounds(
                drawable2,
                null,
                drawable1,
                null
            )
            ok7 = true
        } else {
            txt7.visibility = View.GONE
            btn7.setBackgroundResource(R.drawable.shape_knopka3)
            val drawable =
                VectorDrawableCompat.create(resources, R.drawable.pastga, resources.newTheme())
            btn7.setCompoundDrawablesRelativeWithIntrinsicBounds(
                null,
                null,
                drawable,
                null
            )
            ok7 = false
        }

    }
    private fun btn8OnClickListener(view: View){
        if (!ok8) {
            view.txt8.visibility = View.VISIBLE
            view.btn8.setBackgroundResource(R.drawable.shape_knopka4)
            val drawable1 = VectorDrawableCompat.create(
                resources,
                R.drawable.tepaga,
                resources.newTheme()
            )
            val drawable2 = VectorDrawableCompat.create(
                resources,
                R.drawable.icon,
                resources.newTheme()
            )
            btn8.setCompoundDrawablesRelativeWithIntrinsicBounds(
                drawable2,
                null,
                drawable1,
                null
            )
            ok8 = true
        } else {
            txt8.visibility = View.GONE
            btn8.setBackgroundResource(R.drawable.shape_knopka3)
            val drawable =
                VectorDrawableCompat.create(resources, R.drawable.pastga, resources.newTheme())
            btn8.setCompoundDrawablesRelativeWithIntrinsicBounds(
                null,
                null,
                drawable,
                null
            )
            ok8 = false
        }

    }
    private fun btn9OnClickListener(view: View){
        if (!ok9) {
            view.txt9.visibility = View.VISIBLE
            view.btn9.setBackgroundResource(R.drawable.shape_knopka4)
            val drawable1 = VectorDrawableCompat.create(
                resources,
                R.drawable.tepaga,
                resources.newTheme()
            )
            val drawable2 = VectorDrawableCompat.create(
                resources,
                R.drawable.icon,
                resources.newTheme()
            )
            btn9.setCompoundDrawablesRelativeWithIntrinsicBounds(
                drawable2,
                null,
                drawable1,
                null
            )
            ok9 = true
        } else {
            txt9.visibility = View.GONE
            btn9.setBackgroundResource(R.drawable.shape_knopka3)
            val drawable =
                VectorDrawableCompat.create(resources, R.drawable.pastga, resources.newTheme())
            btn9.setCompoundDrawablesRelativeWithIntrinsicBounds(
                null,
                null,
                drawable,
                null
            )
            ok9 = false
        }

    }
    private fun btn10OnClickListener(view: View){
        if (!ok10) {
            view.txt10.visibility = View.VISIBLE
            view.btn10.setBackgroundResource(R.drawable.shape_knopka4)
            val drawable1 = VectorDrawableCompat.create(
                resources,
                R.drawable.tepaga,
                resources.newTheme()
            )
            val drawable2 = VectorDrawableCompat.create(
                resources,
                R.drawable.tuyuq,
                resources.newTheme()
            )
            btn10.setCompoundDrawablesRelativeWithIntrinsicBounds(
                drawable2,
                null,
                drawable1,
                null
            )
            ok10 = true
        } else {
            txt10.visibility = View.GONE
            btn10.setBackgroundResource(R.drawable.shape_knopka3)
            val drawable =
                VectorDrawableCompat.create(resources, R.drawable.pastga, resources.newTheme())
            btn10.setCompoundDrawablesRelativeWithIntrinsicBounds(
                null,
                null,
                drawable,
                null
            )
            ok10 = false
        }

    }
    private fun btn11OnClickListener(view: View){
        if (!ok11) {
            view.txt11.visibility = View.VISIBLE
            view.btn11.setBackgroundResource(R.drawable.shape_knopka4)
            val drawable1 = VectorDrawableCompat.create(
                resources,
                R.drawable.tepaga,
                resources.newTheme()
            )
            val drawable2 = VectorDrawableCompat.create(
                resources,
                R.drawable.tuyuq,
                resources.newTheme()
            )
            btn11.setCompoundDrawablesRelativeWithIntrinsicBounds(
                drawable2,
                null,
                drawable1,
                null
            )
            ok11 = true
        } else {
            txt11.visibility = View.GONE
            btn11.setBackgroundResource(R.drawable.shape_knopka3)
            val drawable =
                VectorDrawableCompat.create(resources, R.drawable.pastga, resources.newTheme())
            btn11.setCompoundDrawablesRelativeWithIntrinsicBounds(
                null,
                null,
                drawable,
                null
            )
            ok11 = false
        }

    }
    private fun btn12OnClickListener(view: View){
        if (!ok12) {
            view.txt12.visibility = View.VISIBLE
            view.btn12.setBackgroundResource(R.drawable.shape_knopka4)
            val drawable1 = VectorDrawableCompat.create(
                resources,
                R.drawable.tepaga,
                resources.newTheme()
            )
            val drawable2 = VectorDrawableCompat.create(
                resources,
                R.drawable.tuyuq,
                resources.newTheme()
            )
            btn12.setCompoundDrawablesRelativeWithIntrinsicBounds(
                drawable2,
                null,
                drawable1,
                null
            )
            ok12 = true
        } else {
            txt12.visibility = View.GONE
            btn12.setBackgroundResource(R.drawable.shape_knopka3)
            val drawable =
                VectorDrawableCompat.create(resources, R.drawable.pastga, resources.newTheme())
            btn12.setCompoundDrawablesRelativeWithIntrinsicBounds(
                null,
                null,
                drawable,
                null
            )
            ok12 = false
        }

    }
    private fun btn13OnClickListener(view: View){
        if (!ok13) {
            view.txt13.visibility = View.VISIBLE
            view.btn13.setBackgroundResource(R.drawable.shape_knopka4)
            val drawable1 = VectorDrawableCompat.create(
                resources,
                R.drawable.tepaga,
                resources.newTheme()
            )
            val drawable2 = VectorDrawableCompat.create(
                resources,
                R.drawable.tuyuq,
                resources.newTheme()
            )
            btn13.setCompoundDrawablesRelativeWithIntrinsicBounds(
                drawable2,
                null,
                drawable1,
                null
            )
            ok13 = true
        } else {
            txt13.visibility = View.GONE
            btn13.setBackgroundResource(R.drawable.shape_knopka3)
            val drawable =
                VectorDrawableCompat.create(resources, R.drawable.pastga, resources.newTheme())
            btn13.setCompoundDrawablesRelativeWithIntrinsicBounds(
                null,
                null,
                drawable,
                null
            )
            ok13 = false
        }

    }
    private fun btn14OnClickListener(view: View){
        if (!ok14) {
            view.txt14.visibility = View.VISIBLE
            view.btn14.setBackgroundResource(R.drawable.shape_knopka4)
            val drawable1 = VectorDrawableCompat.create(
                resources,
                R.drawable.tepaga,
                resources.newTheme()
            )
            val drawable2 = VectorDrawableCompat.create(
                resources,
                R.drawable.tuyuq,
                resources.newTheme()
            )
            btn14.setCompoundDrawablesRelativeWithIntrinsicBounds(
                drawable2,
                null,
                drawable1,
                null
            )
            ok14 = true
        } else {
            txt14.visibility = View.GONE
            btn14.setBackgroundResource(R.drawable.shape_knopka3)
            val drawable =
                VectorDrawableCompat.create(resources, R.drawable.pastga, resources.newTheme())
            btn14.setCompoundDrawablesRelativeWithIntrinsicBounds(
                null,
                null,
                drawable,
                null
            )
            ok14 = false
        }

    }
}