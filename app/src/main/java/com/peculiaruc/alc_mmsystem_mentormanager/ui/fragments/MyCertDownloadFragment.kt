package com.peculiaruc.alc_mmsystem_mentormanager.ui.fragments

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.peculiaruc.alc_mmsystem_mentormanager.R
import com.peculiaruc.alc_mmsystem_mentormanager.databinding.FragmentMyCertDownloadBinding
import com.peculiaruc.alc_mmsystem_mentormanager.databinding.FragmentMyReportDetailsBinding

class MyCertDownloadFragment : Fragment() {

    private lateinit var binding: FragmentMyCertDownloadBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentMyCertDownloadBinding.inflate(inflater)

        binding.btnDownloadCertificate.setOnClickListener {


                val dialogBinding = layoutInflater.inflate(R.layout.successful_download_dialog, null)

                val myDialog = Dialog(requireContext())
                myDialog.setContentView(dialogBinding)
                myDialog.setCancelable(true)
                myDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))


                val requestDone = dialogBinding.findViewById<Button>(R.id.btnSuccessfulDownload)
                requestDone.setOnClickListener {

                    myDialog.dismiss()
                }
                myDialog.show()
            }


        // Inflate the layout for this fragment
        return binding.root
    }

}