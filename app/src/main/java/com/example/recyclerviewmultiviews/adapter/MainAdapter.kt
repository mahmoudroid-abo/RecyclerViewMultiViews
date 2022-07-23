package com.example.recyclerviewmultiviews.adapter

import android.annotation.SuppressLint
import com.example.recyclerviewmultiviews.R
import com.example.recyclerviewmultiviews.databinding.ListItemBinding
import com.example.recyclerviewmultiviews.models.Vehicle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class MainAdapter :
    RecyclerView.Adapter<MainAdapter.MainAdapterViewHolder>() {

    private val adapterData = mutableListOf<Vehicle>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainAdapterViewHolder {
        val binding = ListItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return MainAdapterViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MainAdapterViewHolder, position: Int) {
        holder.bind(adapterData[position])
    }

    override fun getItemCount(): Int = adapterData.size

    fun setData(data: List<Vehicle>) {
        adapterData.apply {
            clear()
            addAll(data)
        }
    }

    companion object {
        private const val TYPE_CAR = 0
        private const val TYPE_BIKE = 1
        private const val TYPE_MOTORCYCLE = 2
        private const val TYPE_HEADER = 3
    }

    inner class MainAdapterViewHolder(val binding: ListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        @SuppressLint("SetTextI18n")
        fun bind(model: Vehicle) {
            binding.vehicleName.text = model.modelName
            binding.maxSpeed.text = model.maxSpeed.toString() + " km/h"
            binding.weight.text = model.weight.toString() + " KG"
            binding.vehicleType.text = model.type
            binding.image
            Glide.with(binding.image)
                .load(R.drawable.car1)
                .into(binding.image)
        }
    }
}