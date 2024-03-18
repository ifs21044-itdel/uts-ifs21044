package com.ifs21044.dinopedia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ifs21044.dinopedia.databinding.ActivityDetailBinding

class  DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fotoID = intent.getIntExtra(FOTO_ID_EXTRA, -1)
        val foto = fotoFromID(fotoID)
        if (foto !=null)
        {
            binding.cover.setImageResource(foto.cover)
            binding.dino1.setImageResource(foto.dino1)
            binding.dino2.setImageResource(foto.dino2)
            binding.judul.text = foto.judul
            binding.debut.text = foto.debut
            binding.tanggal.text = foto.tanggal
            binding.dinoket1.text = foto.dinoket1
            binding.dinoket2.text = foto.dinoket2
        }
    }

    private fun fotoFromID(fotoID: Int): Foto?
    {
        for (foto in fotoList)
        {
            if (foto.id == fotoID)
                return foto
        }
        return null
    }
}