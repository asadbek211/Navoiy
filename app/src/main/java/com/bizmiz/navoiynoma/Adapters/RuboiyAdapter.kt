package com.bizmiz.navoiynoma.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat
import com.bizmiz.navoiynoma.R
import com.bizmiz.navoiynoma.Settings
import com.bizmiz.navoiynoma.data.RuboiyData
import kotlinx.android.synthetic.main.ruboiy_item.view.*

class RuboiyAdapter : RecyclerView.Adapter<RuboiyAdapter.MyViewHolder>() {
    var models: List<RuboiyData> = listOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    inner class MyViewHolder(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {
        private val settings = Settings(itemView.context)
        fun funksiya(ruboiyData: RuboiyData) {
            itemView.ruboiy_btn.text = ruboiyData.RuboiyNomi
            itemView.ruboiy_matni.text = ruboiyData.RuboiyMatni
            itemView.type.text = ruboiyData.type
            itemView.ruboiy_matni.textSize = settings.getTextSize()
            if (ruboiyData.isOpen) {
                itemView.liner.visibility = View.VISIBLE
                itemView.ruboiy_btn.setBackgroundResource(R.drawable.shape_knopka4)
                itemView.ruboiy_btn.setCompoundDrawablesRelativeWithIntrinsicBounds(
                    null,
                    null,
                    VectorDrawableCompat.create(
                        itemView.context.resources,
                        R.drawable.tepaga,
                        itemView.context.resources.newTheme()
                    ),
                    null
                )
                ruboiyData.isOpen = true
            } else {
                itemView.liner.visibility = View.GONE
                itemView.ruboiy_btn.setBackgroundResource(R.drawable.shape_knopka3)
                itemView.ruboiy_btn.setCompoundDrawablesRelativeWithIntrinsicBounds(
                    null,
                    null,
                    VectorDrawableCompat.create(
                        itemView.context.resources,
                        R.drawable.pastga,
                        itemView.context.resources.newTheme()
                    ),
                    null
                )
                ruboiyData.isOpen = false
            }
            itemView.ruboiy_btn.setOnClickListener {

                if (!ruboiyData.isOpen) {
                    itemView.liner.visibility = View.VISIBLE
                    itemView.ruboiy_btn.setBackgroundResource(R.drawable.shape_knopka4)
                    itemView.ruboiy_btn.setCompoundDrawablesRelativeWithIntrinsicBounds(
                        null,
                        null,
                        VectorDrawableCompat.create(
                            itemView.context.resources,
                            R.drawable.tepaga,
                            itemView.context.resources.newTheme()
                        ),
                        null
                    )
                    ruboiyData.isOpen = true
                } else {
                    itemView.liner.visibility = View.GONE
                    itemView.ruboiy_btn.setBackgroundResource(R.drawable.shape_knopka3)
                    itemView.ruboiy_btn.setCompoundDrawablesRelativeWithIntrinsicBounds(
                        null,
                        null,
                        VectorDrawableCompat.create(
                            itemView.context.resources,
                            R.drawable.pastga,
                            itemView.context.resources.newTheme()
                        ),
                        null
                    )
                    ruboiyData.isOpen = false
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.ruboiy_item, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.funksiya(models[position])
    }

    override fun getItemCount(): Int = models.size
}