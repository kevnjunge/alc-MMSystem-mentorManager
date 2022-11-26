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
import androidx.navigation.findNavController
import com.peculiaruc.alc_mmsystem_mentormanager.R
import com.peculiaruc.alc_mmsystem_mentormanager.databinding.FragmentMentorCertficateBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


class MentorCertficateFragment : Fragment() {
    lateinit var binding: FragmentMentorCertficateBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMentorCertficateBinding.inflate(inflater)

        binding.dwldMentor.setOnClickListener {
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

        binding.mentorArrow.setOnClickListener {
            val action = MentorCertficateFragmentDirections.actionMentorCertficateFragmentToGeneratedCertsFragment()
            it.findNavController().navigate(action)
        }

        return binding.root


    }

}