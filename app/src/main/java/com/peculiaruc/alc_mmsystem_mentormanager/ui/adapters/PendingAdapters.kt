package com.peculiaruc.alc_mmsystem_mentormanager.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_mentormanager.R
import com.peculiaruc.alc_mmsystem_mentormanager.data.repository.PendData
import com.peculiaruc.alc_mmsystem_mentormanager.databinding.PendingListItemBinding

class PendingAdapters(
    var pend: List<PendData>
):androidx.recyclerview.widget.ListAdapter<PendData,PendingAdapters.PendingViewHolder>(DiffCallback){

    inner class PendingViewHolder(val binding: PendingListItemBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PendingViewHolder {
        return PendingViewHolder(
            PendingListItemBinding.inflate(LayoutInflater
                .from(parent.context),
            parent, false)
        )
    }

    override fun onBindViewHolder(holder: PendingViewHolder, position: Int) {
       var pendingImage = 0
        holder.binding.name.text = pend[position].name
        holder.binding.detail.text = pend[position].detail

        when (pend[position].name!!.lowercase()){

            "Franka Kebede" ->{
                pendingImage = R.drawable.earth
            }
            "Kenneth Uwakwe" ->{
                pendingImage = R.drawable.earth
            }
            "Kenneth Uwakwe." ->{
                pendingImage = R.drawable.earth
            }
        }
        holder.binding.pendImage.setImageResource(pendingImage)
    }

    override fun getItemCount(): Int {
        return pend.size
    }

    companion object{
        val DiffCallback = object:DiffUtil.ItemCallback<PendData>(){
            override fun areItemsTheSame(oldItem: PendData, newItem: PendData): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: PendData, newItem: PendData): Boolean {
             return oldItem == newItem
            }

        }
    }
}