package com.ifs21044.dinopedia


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ifs21044.dinopedia.databinding.CardCellBinding

class FotoAdapter(
    private val fotos: MutableList<Foto>,
    private val clickListener: FotoClickListener
)
    : RecyclerView.Adapter<CardViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding = CardCellBinding.inflate(from, parent, false)
        return CardViewHolder(binding, clickListener)
    }

    override fun getItemCount(): Int = fotos.size

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.bindFoto(fotos[position])
    }
}