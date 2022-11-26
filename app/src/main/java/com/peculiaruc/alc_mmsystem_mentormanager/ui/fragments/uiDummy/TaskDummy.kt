package com.peculiaruc.alc_mmsystem_mentormanager.ui.fragments.uiDummy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.peculiaruc.alc_mmsystem_mentormanager.R
import com.peculiaruc.alc_mmsystem_mentormanager.databinding.FragmentTaskDummyBinding


class TaskDummy : Fragment() {
 private lateinit var binding: FragmentTaskDummyBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTaskDummyBinding.inflate(inflater)

        binding.chipMentors.setOnClickListener {
            val action = TaskDummyDirections.actionTaskDummyToMentorsDummy()
            it.findNavController().navigate(action)
        }
        binding.chipReports.setOnClickListener {
            val action = TaskDummyDirections.actionTaskDummyToReportsDummy()
            it.findNavController().navigate(action)
        }
        // Inflate the layout for this fragment
        return binding.root
    }


}