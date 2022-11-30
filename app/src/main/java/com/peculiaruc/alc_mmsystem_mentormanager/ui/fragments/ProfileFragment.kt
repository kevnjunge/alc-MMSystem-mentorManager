package com.peculiaruc.alc_mmsystem_mentormanager.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.peculiaruc.alc_mmsystem_mentormanager.R
import com.peculiaruc.alc_mmsystem_mentormanager.databinding.FragmentProfileBinding

/**
 * Fragment to display mentor managers profile data
 */
class ProfileFragment : Fragment() {

    private lateinit var binding: FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentProfileBinding.inflate(inflater)

        binding.btnSearch.setOnClickListener{
            val action = ProfileFragmentDirections.actionProfileFragmentToEditMyProfileFragment()
            it.findNavController().navigate(action)
        }

        binding.btnBackProfile.setOnClickListener {
            val action = ProfileFragmentDirections.actionProfileFragmentToHomeFragment()
            it.findNavController().navigate(action)
        }

        binding.chipPrograms.setOnClickListener{
            val action = ProfileFragmentDirections.actionProfileFragmentToProgramDummy()
            it.findNavController().navigate(action)
        }

        binding.chipMentors.setOnClickListener{
            val action = ProfileFragmentDirections.actionProfileFragmentToMentorsDummy()
            it.findNavController().navigate(action)
        }
        binding.chipTasks.setOnClickListener {
            val action = ProfileFragmentDirections.actionProfileFragmentToTaskDummy()
            it.findNavController().navigate(action)
        }
        binding.chipReports.setOnClickListener {
            val action = ProfileFragmentDirections.actionProfileFragmentToReportsDummy()
            it.findNavController().navigate(action)
        }
        // Inflate the layout for this fragment
        return binding.root
    }

}