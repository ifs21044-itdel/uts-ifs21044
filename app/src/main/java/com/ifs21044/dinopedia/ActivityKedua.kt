package com.ifs21044.dinopedia


import android.content.Intent
import android.os.Bundle
import android.view.KeyEvent
import android.view.inputmethod.EditorInfo
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class ActivityKedua : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kedua)

        val textViewIdol: TextView = findViewById(R.id.idol)
        val textViewArtist: TextView = findViewById(R.id.artist)

        // Menambahkan listener klik pada TextView "idol"
        textViewIdol.setOnClickListener {
            // Membuat intent untuk beralih ke MainActivity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        textViewArtist.setOnClickListener {
            // Membuat intent untuk beralih ke ActivityArtist
            val intent = Intent(this, ActivityArtist::class.java)
            startActivity(intent)
        }

    }
}
