package com.peculiaruc.alc_mmsystem_mentormanager.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

import androidx.fragment.app.FragmentTransaction
import androidx.navigation.findNavController
import com.peculiaruc.alc_mmsystem_mentormanager.R
import com.peculiaruc.alc_mmsystem_mentormanager.databinding.FragmentCertificatesBinding

class CertificatesFragment : Fragment() {
    lateinit var binding:FragmentCertificatesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCertificatesBinding.inflate(inflater)

        binding.certBtn.setOnClickListener {
            val action = CertificatesFragmentDirections.actionCertificatesFragmentToApprovedCertificateFragment()
            it.findNavController().navigate(action)
        }
        return binding.root
    }

}