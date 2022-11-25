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
import com.peculiaruc.alc_mmsystem_mentormanager.databinding.FragmentMyReportDetailsBinding

class MyReportDetails : Fragment() {

    private lateinit var binding: FragmentMyReportDetailsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentMyReportDetailsBinding.inflate(inflater)

        binding.btnShareReport.setOnClickListener {

            val dialogBinding = layoutInflater.inflate(R.layout.share_report_dialog, null)

            val myDialog = Dialog(requireContext())
            myDialog.setContentView(dialogBinding)
            myDialog.setCancelable(true)
            myDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))


            val requestDone = dialogBinding.findViewById<Button>(R.id.btnOpenEmailApp)
            requestDone.setOnClickListener {

                // TODO: Add open email intent

                myDialog.dismiss()
            }

            val openEmail = dialogBinding.findViewById<Button>(R.id.btnCancel)
            requestDone.setOnClickListener {

                myDialog.dismiss()
            }
            myDialog.show()
        }

        binding.btnDownloadReport.setOnClickListener {

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