package com.peculiaruc.alc_mmsystem_mentormanager.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.peculiaruc.alc_mmsystem_mentormanager.data.local.SetPendingData
import com.peculiaruc.alc_mmsystem_mentormanager.databinding.FragmentPendingApprovalBinding
import com.peculiaruc.alc_mmsystem_mentormanager.ui.adapters.PendingAdapters

class PendingApprovalFragment : Fragment() {
    lateinit var binding: FragmentPendingApprovalBinding
    private var penApprovData = SetPendingData.pendApp()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentPendingApprovalBinding.inflate(inflater)
        val layoutManager = LinearLayoutManager(requireContext())
        binding.pendingRv.layoutManager = layoutManager
        binding.pendingRv.adapter = PendingAdapters(penApprovData)
        return binding.root
    }

}