package com.example.assignment_004

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.assignment_004.databinding.ActivityMainBinding
import com.example.assignment_004.databinding.ItemBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

/*        val list = mutableListOf<Int>()

        var number = 25
        var spanCount = 0

        when (number) {
            16 -> {
                spanCount = 4
            }
            9 -> {
                spanCount = 3
            }
            25 -> {
                spanCount = 5
            }
        }

        for (i in 1..number) {
            list.add(i)
        }

        var adapter = ItemsAdapter()
        adapter.setData(list)

        val layoutManager = GridLayoutManager(this, spanCount)

        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = layoutManager

    }

    inner class ItemsAdapter() :
        RecyclerView.Adapter<ItemsAdapter.ItemViewHolder>() {

        private var list = mutableListOf<Int>()

        fun setData(itemList: MutableList<Int>) {
            this.list.clear()
            this.list.addAll(itemList)
            notifyDataSetChanged()


        }


        inner class ItemViewHolder(private val binding: ItemBinding) :
            RecyclerView.ViewHolder(binding.root) {


            private var item: Int = 0
            fun onBind() {
                item = list[adapterPosition]
            }
        }


        override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int
        ): ItemsAdapter.ItemViewHolder {
            return ItemViewHolder(
                ItemBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
        }

        override fun onBindViewHolder(holder: ItemsAdapter.ItemViewHolder, position: Int) {

            holder.onBind()
        }

        override fun getItemCount(): Int {
            return list.size
        }
    */

    }
}