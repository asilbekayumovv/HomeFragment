package com.example.homefragment


import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.os.Looper

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.homefragment.databinding.FragmentSplashBinding
class SplashFragment : androidx.fragment.app.Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


      val binding=FragmentSplashBinding.inflate(inflater,container,false)

        val handler=Handler(Looper.getMainLooper())
        handler.postDelayed({
            parentFragmentManager.beginTransaction()
                       .replace(R.id.main, PinFragment())
                       .addToBackStack("SplashFragment")
                       .commit()


     },3000)

        return binding.root
    }
}