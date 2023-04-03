package com.example.homefragment

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.homefragment.databinding.FragmentColorBinding

class ColorFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentColorBinding.inflate(inflater, container, false)

        binding.red.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.area, RedFragment())
                .commit()

        }
        binding.blue.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.area, BlueFragment())
                .commit()
        }
        binding.purple.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.area, PurpleFragment())
                .commit()
        }
        binding.green.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.area, GreenFragment())
                .commit()
        }
        binding.yellow.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.area,YellowFragment())
                .commit()
        }
        return binding.root
    }

    }



