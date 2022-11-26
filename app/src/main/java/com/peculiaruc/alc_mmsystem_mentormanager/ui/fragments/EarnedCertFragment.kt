package com.peculiaruc.alc_mmsystem_mentormanager.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.peculiaruc.alc_mmsystem_mentormanager.data.local.EarnedData
import com.peculiaruc.alc_mmsystem_mentormanager.databinding.FragmentEarnedCertBinding
import com.peculiaruc.alc_mmsystem_mentormanager.ui.adapters.EarnAdapter

class EarnedCertFragment : Fragment() {
    lateinit var binding: FragmentEarnedCertBinding
    private var earnCertData =  EarnedData.earnCerts()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentEarnedCertBinding.inflate(inflater)
        val layoutManager = LinearLayoutManager(requireContext())
        binding.earnedRv.layoutManager = layoutManager
        binding.earnedRv.adapter = EarnAdapter(earnCertData)
        return binding.root
    }


}