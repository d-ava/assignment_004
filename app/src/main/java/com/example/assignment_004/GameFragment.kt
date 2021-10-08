package com.example.assignment_004

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.assignment_004.databinding.FragmentGameBinding
import kotlin.math.sqrt

class GameFragment : Fragment() {

    private lateinit var binding: FragmentGameBinding

    private val adapter = GameAdapter()

    private val args: GameFragmentArgs by navArgs()



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentGameBinding.inflate(inflater, container, false)

        var number = sqrt(args.itemNumber.toDouble()).toInt()
        binding.tvGoodLuck.text = number.toString()
        val list = mutableListOf<Int>()
        for (num in 1..number*number){
            list.add(num)
        }

        adapter.setData(list)
         val layoutManager = GridLayoutManager(context, number)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = layoutManager






        return binding.root
    }


}