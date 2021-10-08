package com.example.assignment_004

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.assignment_004.databinding.ItemBinding

var bool = true


class GameAdapter() : RecyclerView.Adapter<GameAdapter.ViewHolder>() {

    companion object {
        private const val X = "RED"
        private const val Y = "YELLOW"
    }

    private var list = mutableListOf<Int>()

    fun setData(itemList: MutableList<Int>) {
        this.list.clear()
        this.list.addAll(itemList)
        notifyDataSetChanged()
    }


    class ViewHolder(private val binding: ItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val item = binding.item

        fun xy() {

            if (bool) {
                item.setBackgroundResource(R.drawable.ic_ld_r_x)

                bool = false
            } else {
                item.setBackgroundResource(R.drawable.ic_ld_r_heart)
                bool = true
            }

        }


        init {

            binding.root.setOnClickListener {
                xy()


            }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {


        return ViewHolder(ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.item


    }

    override fun getItemCount(): Int {
        return list.size
    }
}