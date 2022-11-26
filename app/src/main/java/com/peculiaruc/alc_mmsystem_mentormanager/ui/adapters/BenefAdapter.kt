package com.peculiaruc.alc_mmsystem_mentormanager.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.peculiaruc.alc_mmsystem_mentormanager.R
import com.peculiaruc.alc_mmsystem_mentormanager.data.repository.CertBenData
import com.peculiaruc.alc_mmsystem_mentormanager.databinding.BeneficiaryListItemBinding

class BenefAdapter(
    var Benef:List<CertBenData>
):androidx.recyclerview.widget.ListAdapter<CertBenData,BenefAdapter.BenefViewHolder>(DiffCallback) {

    inner class BenefViewHolder(val binding: BeneficiaryListItemBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BenefViewHolder {
       return BenefViewHolder(
           BeneficiaryListItemBinding.inflate(
               LayoutInflater.from(parent.context),
               parent, false
           )
       )
    }

    override fun onBindViewHolder(holder: BenefViewHolder, position: Int) {
       var benefImage = 0
        holder.binding.name.text = Benef[position].name
        holder.binding.detail.text = Benef[position].detail

        when (Benef[position].name!!.lowercase()){
            "Franka Kebede" ->{
                benefImage = R.drawable.earth
            }
            "Kenneth Uwakwe" ->{
                benefImage = R.drawable.peculiar
            }
            "Judith Okafor" ->{
                benefImage = R.drawable.peculiar_9
            }

            "Ayodele Oluwa" -> {
                benefImage = R.drawable.peculiar_1
            }

            "Jennifer Lopez" ->{
                benefImage = R.drawable.roseikemefuna
            }

            "Ebubechi Orijiakor"->{
                benefImage = R.drawable.roseikemefuna
            }

            "John Doe" ->{
                benefImage = R.drawable.janekebede
            }
        }
        holder.binding.certImage1.setImageResource(benefImage)
    }

    override fun getItemCount(): Int {
        return Benef.size
    }

    companion object{
        private val DiffCallback = object: DiffUtil.ItemCallback<CertBenData>(){
            override fun areItemsTheSame(oldItem: CertBenData, newItem: CertBenData): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: CertBenData, newItem: CertBenData): Boolean {
               return oldItem == newItem
            }

        }
    }


}