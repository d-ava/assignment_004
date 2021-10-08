package com.example.assignment_004

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.assignment_004.databinding.FragmentStartBinding

class StartFragment : Fragment() {

    private lateinit var binding: FragmentStartBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStartBinding.inflate(inflater, container, false)



        binding.button.setOnClickListener {
            toTheGame()
        }




        return binding.root
    }

    private fun toTheGame() {


        val num = binding.etNumber.text.toString().toInt()

        if (num == 9 || num == 16 || num == 25) {

            val action = StartFragmentDirections.toTheGame(num)
            findNavController().navigate(action)
        } else {
            binding.etNumber.error = "enter only 9, 16 or 25 please"
        }


    }

}