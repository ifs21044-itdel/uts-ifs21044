package com.ifs21044.dinopedia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ifs21044.dinopedia.databinding.ActivityDetailArtistBinding

class DetailArtistActivity : AppCompatActivity()
{
    private lateinit var  binding: ActivityDetailArtistBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailArtistBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val potoID = intent.getIntExtra(POTO_ID_EXTRA, -1)
        val poto = potoFromID(potoID)
        if(poto != null)
        {
            binding.pp.setImageResource(poto.pp)
            binding.capt.text = poto.capt
            binding.keterangan.text = poto.keterangan
        }
    }

    private fun potoFromID(potoID: Int): Poto?
    {
        for(poto in potoList)
        {
            if(poto.id == potoID)
                return poto
        }
        return null
    }
}