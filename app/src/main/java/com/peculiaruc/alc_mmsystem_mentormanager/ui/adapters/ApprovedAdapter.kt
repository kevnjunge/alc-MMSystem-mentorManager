package com.peculiaruc.alc_mmsystem_mentormanager.ui.adapters


import android.annotation.SuppressLint
import android.content.ClipData.Item
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_mentormanager.databinding.ApprovedListItemBinding

/**
 * Adapter for approved certificates
 */
class ApprovedAdapter(private val onItemClickListener:(Item) -> Unit):
ListAdapter<Item, ApprovedAdapter.ApprovedViewHolder>(DiffCallback){
    /**
     * binding data to the views
     */
    class ApprovedViewHolder(private var binding:ApprovedListItemBinding):
    /**
     * binds the recyclerview
     */
        RecyclerView.ViewHolder(binding.root){


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

    }

    companion object{
        val DiffCallback = object:DiffUtil.ItemCallback<Item>(){
            override fun areItemsTheSame(oldItem: Item, newItem: Item): Boolean {
                return oldItem == newItem
            }

            @SuppressLint("DiffUtilEquals")
            override fun areContentsTheSame(oldItem: Item, newItem: Item): Boolean {
               return oldItem == newItem
            }

        }
    }


}