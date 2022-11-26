package com.peculiaruc.alc_mmsystem_mentormanager.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.peculiaruc.alc_mmsystem_mentormanager.data.local.CertData
import com.peculiaruc.alc_mmsystem_mentormanager.databinding.FragmentApprovedCertificatesBinding
import com.peculiaruc.alc_mmsystem_mentormanager.ui.adapters.ApprovedAdapter


class ApprovedCertificateFragment : Fragment() {
    lateinit var binding: FragmentApprovedCertificatesBinding
    private var certificateData = CertData.ApprovCert()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentApprovedCertificatesBinding.inflate(inflater)

        val layoutManager = LinearLayoutManager(requireContext())
        binding.certificatesRv.layoutManager = layoutManager
        binding.certificatesRv.adapter = ApprovedAdapter(certificateData)
        return binding.root
    }


}