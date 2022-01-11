package com.example.fragment

import Adapter.StorisAdapter
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.fragment.databinding.FragmentMenuInstagrammBinding
import model.Item

class MenuInstagramm : Fragment() {
    lateinit var binding: FragmentMenuInstagrammBinding
    lateinit var storisAdapter: StorisAdapter
    var itemlist = ArrayList<Item>()

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            binding = FragmentMenuInstagrammBinding.inflate(LayoutInflater.from(context))
            for(i in 0..5) {
                itemlist.add(Item(R.drawable.ic_telegram_logo_icon_172167, "Wi-Fi"))
                itemlist.add(Item(R.drawable.facebook, "Telegram"))
                itemlist.add(Item(R.drawable.igtv, "Bluetooth"))
                itemlist.add(Item(R.drawable.instagram, "Smile"))
            }
            storisAdapter= StorisAdapter(requireContext(),itemlist)
            binding.rv.adapter=storisAdapter
            binding.avatar.setOnClickListener {
                findNavController().navigate(R.id.main_list)
            }
            return binding.root
        }
    }

