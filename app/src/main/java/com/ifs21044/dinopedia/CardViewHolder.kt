package com.ifs21044.dinopedia


import androidx.recyclerview.widget.RecyclerView
import com.ifs21044.dinopedia.databinding.CardCellBinding

class CardViewHolder(
    private val cardCellBinding: CardCellBinding,
    private val clickListener: FotoClickListener
): RecyclerView.ViewHolder(cardCellBinding.root)
{
    fun bindFoto(foto: Foto)
    {
        cardCellBinding.cover.setImageResource(foto.cover)
        cardCellBinding.judul.text = foto.judul

        cardCellBinding.cover.setOnClickListener{
            clickListener.onClick(foto)
        }
    }
}
