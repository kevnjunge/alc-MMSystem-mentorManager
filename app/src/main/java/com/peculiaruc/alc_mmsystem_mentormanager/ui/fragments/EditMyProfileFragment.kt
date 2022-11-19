package com.peculiaruc.alc_mmsystem_mentormanager.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.peculiaruc.alc_mmsystem_mentormanager.R
import com.peculiaruc.alc_mmsystem_mentormanager.databinding.FragmentEditMyProfileBinding


class EditMyProfileFragment : Fragment() {

    var binding:FragmentEditMyProfileBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentEditMyProfileBinding.inflate(layoutInflater)


        //Country Exposed DropDown
        val country = resources.getStringArray(R.array.Countries)
        val countryArrayAdapter = ArrayAdapter(requireContext(),R.layout.drop_down_item,country)
        binding?.autoCompleteCountryTextView?.setAdapter(countryArrayAdapter)


        //City Exposed DropDown
        val city = resources.getStringArray(R.array.Cities)
        val cityArrayAdapter = ArrayAdapter(requireContext(),R.layout.drop_down_item,city)
        binding?.autoCompleteCityTextView?.setAdapter(cityArrayAdapter)
        // Inflate the layout for this fragment
        return binding?.root
    }


}