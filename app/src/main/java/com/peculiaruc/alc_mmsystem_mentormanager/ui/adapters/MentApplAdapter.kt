package com.peculiaruc.alc_mmsystem_mentormanager.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_mentormanager.R
import com.peculiaruc.alc_mmsystem_mentormanager.data.repository.MentorData
import com.peculiaruc.alc_mmsystem_mentormanager.databinding.MentorApplicantBinding

class MentApplAdapter(
    var mentor:List<MentorData>
): androidx.recyclerview.widget.ListAdapter<MentorData,MentApplAdapter.MentorViewHolder>(DiffCallback){

    inner class MentorViewHolder(val binding: MentorApplicantBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MentorViewHolder {
       return MentorViewHolder(
           MentorApplicantBinding.inflate(LayoutInflater
               .from(parent.context),
           parent,false)
       )
    }

    override fun onBindViewHolder(holder: MentorViewHolder, position: Int) {
        var dummyImage = 0
        holder.binding.name.text = mentor[position].name
        holder.binding.details.text = mentor[position].detail

        when(mentor[position].name!!.lowercase()){
            "Jeremy Johnson" ->{
                dummyImage = R.drawable.jeremyjohnson
            }

            "Jane Kebede" ->{
                dummyImage = R.drawable.janekebede
            }

            "Roseline Anapuna" ->{
                dummyImage = R.drawable.roselineanapuna
            }

            "Rose Ikemefuna" ->{
                dummyImage = R.drawable.roseikemefuna
            }

            "Emmanuela Afolayan"->{
                dummyImage = R.drawable.emmanuelafolayan
            }

            "Peculiar C. Umeh"->{
                dummyImage = R.drawable.peculiarcumeh
            }

            "Chidinma Rosebud"->{
                dummyImage = R.drawable.chidinmarosebud
            }

            "Peculiar C. Umeh." ->{
                dummyImage = R.drawable.peculiar_1
            }

            "Peculiar C.Umeh"->{
                dummyImage = R.drawable.peculiar
            }

            "Peculiar.C.Umeh"->{
                dummyImage = R.drawable.peculiar_9
            }
        }
        holder.binding.mentorImg.setImageResource(dummyImage)
    }

    override fun getItemCount(): Int {
        return mentor.size
    }

    companion object{
        private val DiffCallback = object: DiffUtil.ItemCallback<MentorData>(){
            override fun areItemsTheSame(oldItem: MentorData, newItem: MentorData): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: MentorData, newItem: MentorData): Boolean {
               return oldItem == newItem
            }

        }
    }
}