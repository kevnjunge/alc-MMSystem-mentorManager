package com.peculiaruc.alc_mmsystem_mentormanager.ui.adapters


import android.content.ClipData.Item
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_mentormanager.databinding.ApprovedListItemBinding

class ApprovedAdapter(private val onItemClickListener:(Item) -> Unit):
ListAdapter<Item, ApprovedAdapter.ApprovedViewHolder>(DiffCallback){

    class ApprovedViewHolder(private var binding:ApprovedListItemBinding):
        RecyclerView.ViewHolder(binding.root){
            fun bind(item:Item){
                binding.apply {
                }
            }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ApprovedViewHolder {
        return ApprovedViewHolder(
            ApprovedListItemBinding.inflate(
                LayoutInflater.from(
                    parent.context
                )
            )
        )
    }

    override fun onBindViewHolder(holder: ApprovedViewHolder, position: Int) {
        val current = getItem(position)
        holder.bind(current)
    }

    companion object{
        val DiffCallback = object:DiffUtil.ItemCallback<Item>(){
            override fun areItemsTheSame(oldItem: Item, newItem: Item): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: Item, newItem: Item): Boolean {
               return oldItem == newItem
            }

        }
    }


}