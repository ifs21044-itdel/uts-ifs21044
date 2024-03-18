package com.ifs21044.dinopedia
import androidx.recyclerview.widget.RecyclerView
import com.ifs21044.dinopedia.databinding.PotoCellBinding

class PotoViewHolder(
    private val potoCellBinding: PotoCellBinding,
    private val clickListener: PotoClickListener
) : RecyclerView.ViewHolder(potoCellBinding.root)
{
    fun bindPoto(poto: Poto){
        potoCellBinding.pp.setImageResource(poto.pp)
        potoCellBinding.capt.text = poto.capt

        potoCellBinding.pp.setOnClickListener{
            clickListener.onClick(poto)
        }
    }
}