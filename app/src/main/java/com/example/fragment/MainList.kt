package com.example.fragment

import Adapter.PhotoAdapter
import Adapter.StorisAdapter
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragment.databinding.FragmentMainListBinding
import model.Item


class
MainList : Fragment() {

    lateinit var binding: FragmentMainListBinding
    lateinit var storisAdapter: StorisAdapter
    lateinit var PhotoAdapter: PhotoAdapter
    var itemlist = ArrayList<Item>()
    var itemlist1 = ArrayList<Item>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainListBinding.inflate(LayoutInflater.from(context))
        for(i in 0..1) {
            itemlist.add(Item(R.drawable.ic__904677_add_addition_calculate_charge_create_new_plus_122527, "Добавить"))
            itemlist.add(Item(R.drawable.ic__98familymanwomanboy2_100443, "Family"))
            itemlist.add(Item(R.drawable.ic_group_collegues_friends_people_gather_icon_191401, "Friend"))
            itemlist.add(Item(R.drawable.ic_merry_christmas_happy_new_year_icon_159232, "New Year"))
            itemlist.add(Item(R.drawable.ic_gifts_trip_purchase_car_christmas_icon_208075,"Travel"))
        }
        storisAdapter= StorisAdapter(requireContext(),itemlist)
        binding.rv1.adapter=storisAdapter

        for (i in 0..2) {
            itemlist1.add(Item(R.drawable.ic_gifts_trip_purchase_car_christmas_icon_208075))
            itemlist1.add(Item(R.drawable.ic_gifts_trip_purchase_car_christmas_icon_208075))
            itemlist1.add(Item(R.drawable.ic_gifts_trip_purchase_car_christmas_icon_208075))
            itemlist1.add(Item(R.drawable.ic_gifts_trip_purchase_car_christmas_icon_208075))
            itemlist1.add(Item(R.drawable.ic_gifts_trip_purchase_car_christmas_icon_208075))
            itemlist1.add(Item(R.drawable.ic_gifts_trip_purchase_car_christmas_icon_208075))
        }
        PhotoAdapter= PhotoAdapter(requireContext(),itemlist1)
        binding.rv11.adapter=PhotoAdapter
        return binding.root

    }
}