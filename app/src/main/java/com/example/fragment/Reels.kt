package com.example.fragment

import Adapter.ReelsAdapter
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragment.databinding.ActivityMainBinding.inflate
import com.example.fragment.databinding.FragmentReelsBinding
import model.ReelsUser


class Reels : Fragment() {
   lateinit var binding: FragmentReelsBinding
   lateinit var reelsAdapter: ReelsAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentReelsBinding.inflate(LayoutInflater.from(context))
        var array = ArrayList<ReelsUser>()
        array.add(ReelsUser("https://i.pinimg.com/236x/29/ac/31/29ac312451a2ba730323b070dbc361f0.jpg"))
        array.add(ReelsUser("https://i.pinimg.com/236x/29/ac/31/29ac312451a2ba730323b070dbc361f0.jpg"))
        array.add(ReelsUser("https://i.pinimg.com/236x/29/ac/31/29ac312451a2ba730323b070dbc361f0.jpg"))
        reelsAdapter= ReelsAdapter(requireContext(),array)
        binding.rv1.adapter=reelsAdapter
        return binding.root
    }


}