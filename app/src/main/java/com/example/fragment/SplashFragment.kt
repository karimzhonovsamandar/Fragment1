package com.example.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.fragment.databinding.FragmentSplashBinding

class SplashFragment : Fragment() {
    lateinit var binding: FragmentSplashBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSplashBinding.inflate(LayoutInflater.from(context))
        val anim1 = AnimationUtils.loadAnimation(context, R.anim.anim)
        binding.instagram.startAnimation(anim1)
        anim1.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation?) {
                Toast.makeText(context, "start", Toast.LENGTH_SHORT).show()
            }

            override fun onAnimationEnd(animation: Animation?) {
                findNavController().navigate(R.id.menu_instagramm)
            }

            override fun onAnimationRepeat(animation: Animation?) {
                Toast.makeText(context, "repeat", Toast.LENGTH_SHORT).show()
            }

        })

        return binding.root
    }


}