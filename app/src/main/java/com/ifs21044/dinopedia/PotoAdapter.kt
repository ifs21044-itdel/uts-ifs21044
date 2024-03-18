package com.ifs21044.dinopedia

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ifs21044.dinopedia.databinding.PotoCellBinding

class PotoAdapter(
    private val potos: List<Poto>,
    private val clickListener: PotoClickListener
)
    : RecyclerView.Adapter<PotoViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PotoViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding = PotoCellBinding.inflate(from, parent, false)
        return PotoViewHolder(binding, clickListener)
    }

    override fun getItemCount(): Int = potos.size

    override fun onBindViewHolder(holder: PotoViewHolder, position: Int) {
        holder.bindPoto(potos[position])
    }
}