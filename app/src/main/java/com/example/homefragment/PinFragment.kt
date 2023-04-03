package com.example.homefragment

import android.opengl.Visibility
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.homefragment.databinding.FragmentPinBinding
import com.example.homefragment.databinding.FragmentSplashBinding


class PinFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding= FragmentPinBinding.inflate(inflater,container,false)
       binding.next.setOnClickListener {
      if (binding.pincode.text.toString().equals("123")){

          parentFragmentManager.beginTransaction()
              .replace(R.id.main, ColorFragment())
              .addToBackStack("PinFragment")
              .commit()
         // binding.text.visibility=View.INVISIBLE
      }

      else{
            binding.text.visibility=View.VISIBLE
      }
        }

        return binding.root
    }



}