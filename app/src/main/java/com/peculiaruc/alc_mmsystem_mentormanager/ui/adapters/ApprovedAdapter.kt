package com.peculiaruc.alc_mmsystem_mentormanager.ui.adapters


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_mentormanager.R
import com.peculiaruc.alc_mmsystem_mentormanager.data.repository.ApprovData
import com.peculiaruc.alc_mmsystem_mentormanager.databinding.ApprovedListItemBinding

class ApprovedAdapter(
    var approved:List<ApprovData>
    ):androidx.recyclerview.widget.ListAdapter<ApprovData,ApprovedAdapter.ApprovedViewHolder>(DiffCallback){

    inner class ApprovedViewHolder(val binding: ApprovedListItemBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ApprovedViewHolder {
        return ApprovedViewHolder(
            ApprovedListItemBinding.inflate(LayoutInflater
                .from(parent.context),
            parent,false)
        )
    }

    override fun onBindViewHolder(holder: ApprovedViewHolder, position: Int) {
       var dummyImage = 0
        holder.binding.name.text = approved[position].name
        holder.binding.detail.text = approved[position].detail

        when (approved[position].name!!.lowercase()){
            "Franka Kebede" ->{
                dummyImage = R.drawable.certsssss
            }
            "Kenneth Uwakwe" ->{
                dummyImage = R.drawable.certsssss
            }
            "Kenneth Uwakwe." ->{
                dummyImage = R.drawable.certsssss
            }
        }
        holder.binding.approvImg.setImageResource(dummyImage)
    }

    override fun getItemCount(): Int {
        return approved.size
    }

    companion object{
        val DiffCallback = object:DiffUtil.ItemCallback<ApprovData>(){
            override fun areItemsTheSame(oldItem: ApprovData, newItem: ApprovData): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: ApprovData, newItem: ApprovData): Boolean {
                return oldItem == newItem
            }


        }
    }


}