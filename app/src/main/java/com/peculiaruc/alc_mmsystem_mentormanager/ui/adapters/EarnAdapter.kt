package com.peculiaruc.alc_mmsystem_mentormanager.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_mentormanager.R
import com.peculiaruc.alc_mmsystem_mentormanager.data.repository.EarnData
import com.peculiaruc.alc_mmsystem_mentormanager.databinding.EarnedListItemBinding


class EarnAdapter(
    var earn:List<EarnData>
): ListAdapter<EarnData,EarnAdapter.EarnViewHolder>(DiffCallback){
    inner class EarnViewHolder(val binding: EarnedListItemBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EarnViewHolder {
       return EarnViewHolder(
           EarnedListItemBinding.inflate(LayoutInflater
               .from(parent.context),
           parent,false)
       )
    }

    override fun onBindViewHolder(holder: EarnViewHolder, position: Int) {
        var dummyImage = 0
        holder.binding.name.text = earn[position].name
        holder.binding.detail.text = earn[position].details

        when (earn[position].name!!.lowercase()){
            "Franka Kebede" ->{
                dummyImage = R.drawable.certimage
            }
            "Kenneth Uwakwe." ->{
                dummyImage = R.drawable.certimage
            }
        }
        holder.binding.earnImage.setImageResource(dummyImage)
    }
    override fun getItemCount(): Int {
        return earn.size
    }
    companion object{
        val DiffCallback = object:DiffUtil.ItemCallback<EarnData>(){
            override fun areItemsTheSame(oldItem: EarnData, newItem: EarnData): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: EarnData, newItem: EarnData): Boolean {
                return oldItem == newItem
            }

        }
    }

}