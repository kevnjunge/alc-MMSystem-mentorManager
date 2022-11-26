package com.peculiaruc.alc_mmsystem_mentormanager.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.peculiaruc.alc_mmsystem_mentormanager.R
import com.peculiaruc.alc_mmsystem_mentormanager.databinding.FragmentApprovedCertificatesBinding
import com.peculiaruc.alc_mmsystem_mentormanager.databinding.FragmentProfileBinding
import com.peculiaruc.alc_mmsystem_mentormanager.databinding.FragmentProgramsBinding

class ProgramsFragment : Fragment() {
  private lateinit var binding: FragmentProgramsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding =FragmentProgramsBinding.inflate(inflater)

        // Inflate the layout for this fragment

        return binding.root
    }


}