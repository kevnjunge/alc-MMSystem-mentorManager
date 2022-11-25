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
import com.peculiaruc.alc_mmsystem_mentormanager.databinding.FragmentProgramDetailsBinding

class ProgramDetailsFragment : Fragment() {
    lateinit var binding: FragmentProgramDetailsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentProgramDetailsBinding.inflate(inflater)

        binding.applyBtn.setOnClickListener {
            val dialogBinding = layoutInflater.inflate(R.layout.program_dialog, null)
            val myDialog = Dialog(requireContext())
            myDialog.setContentView(dialogBinding)
            myDialog.setCancelable(true)
            myDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

            val dialogDone = dialogBinding.findViewById<Button>(R.id.cert_request_done)
            dialogDone.setOnClickListener {
                myDialog.dismiss()
            }
            myDialog.dismiss()
        }
        return binding.root
    }
}