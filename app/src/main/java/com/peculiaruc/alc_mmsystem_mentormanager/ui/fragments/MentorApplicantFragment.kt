package com.peculiaruc.alc_mmsystem_mentormanager.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.peculiaruc.alc_mmsystem_mentormanager.data.local.SetMentorData
import com.peculiaruc.alc_mmsystem_mentormanager.databinding.FragmentMentorApplicantBinding
import com.peculiaruc.alc_mmsystem_mentormanager.ui.adapters.MentApplAdapter


class MentorApplicantFragment : Fragment() {
    lateinit var binding: FragmentMentorApplicantBinding
    var listData = SetMentorData.mentorApp()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMentorApplicantBinding.inflate(inflater)

        val layoutManager = LinearLayoutManager(requireContext())
        binding.mentorRv.layoutManager = layoutManager
        binding.mentorRv.adapter = MentApplAdapter(listData)
        return binding.root

    }
}