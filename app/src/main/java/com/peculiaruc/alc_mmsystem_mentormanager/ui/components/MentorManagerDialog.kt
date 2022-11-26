package com.peculiaruc.alc_mmsystem_mentormanager.ui.components

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Gravity
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import com.peculiaruc.alc_mmsystem_mentormanager.databinding.AddMentorDialogBinding

class MentorManagerDialog(
    private val onSubmitClickListener:(String)-> Unit
):DialogFragment() {
    private lateinit var binding:AddMentorDialogBinding

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        binding = AddMentorDialogBinding.inflate(layoutInflater)

        val builder = AlertDialog.Builder(requireActivity())
        builder.setView(binding.root)

        binding.sendMentor.setOnClickListener {
            onSubmitClickListener.invoke(binding.emailinput.text.toString())
            dismiss()
        }
        binding.cancelMentor.setOnClickListener {
            dismiss()
        }

        val dialog = builder.create()
        dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.GRAY))
        dialog.window!!.setGravity(Gravity.TOP)
        return dialog
    }

}