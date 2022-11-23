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
import androidx.navigation.fragment.findNavController
import com.peculiaruc.alc_mmsystem_mentormanager.R
import com.peculiaruc.alc_mmsystem_mentormanager.databinding.FragmentCertRequestSelectBinding

class CertRequestSelectFragment : Fragment() {
   lateinit var binding: FragmentCertRequestSelectBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCertRequestSelectBinding.inflate(inflater)

        binding.cardView1.setOnClickListener {
            val dialogBinding = layoutInflater.inflate(R.layout.cert_request_select_dialog, null)

            val myDialog = Dialog(requireContext())
            myDialog.setContentView(dialogBinding)
            myDialog.setCancelable(true)
            myDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            findNavController().navigate(R.id.action_certRequestSelectFragment_to_certificatesFragment)


            val requestDone = dialogBinding.findViewById<Button>(R.id.dialog_done)
            requestDone.setOnClickListener {
                myDialog.dismiss()
            }
            myDialog.show()
        }
        return binding.root

    }

}