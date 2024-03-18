package com.ifs21044.dinopedia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.ifs21044.dinopedia.databinding.ActivityArtistBinding

class ActivityArtist : AppCompatActivity(), PotoClickListener
{
    private lateinit var binding: ActivityArtistBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityArtistBinding.inflate(layoutInflater)

        setContentView(binding.root)

        populatePotos()

        val ActivityArtist = this
        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(applicationContext)
            adapter = PotoAdapter(potoList, ActivityArtist)
        }
    }
    override fun onClick(poto: Poto) {
        val intent = Intent(applicationContext, DetailArtistActivity::class.java)
        intent.putExtra(POTO_ID_EXTRA, poto.id)
        startActivity(intent)
    }


    private fun populatePotos() {
        var poto1 = Poto(
            R.drawable.tyrannosaurusrex,
            "Tyrannosaurus rex",
            "Therizinosauridae adalah dinosaurus yang memiliki cakar panjang dan tajam, serta tubuh yang relatif besar dengan leher yang panjang. Awalnya dianggap sebagai karnivora, tetapi penelitian terbaru menunjukkan bahwa mereka mungkin adalah herbivora atau omnivora. Dinosaurus ini hidup pada masa Kapur Akhir, sekitar 145 hingga 66 juta tahun yang lalu, tersebar di Amerika Utara, Asia, dan Eropa.",
        )
        potoList.add(poto1)

        var poto2 = Poto(
            R.drawable.ankylosaurus,
            "ankylosaurus",
            "Therizinosauridae adalah  dinosaurus yang memiliki cakar panjang dan tajam, serta tubuh yang relatif besar dengan leher yang panjang. Awalnya dianggap sebagai karnivora, tetapi penelitian terbaru menunjukkan bahwa mereka mungkin adalah herbivora atau omnivora. Dinosaurus ini hidup pada masa Kapur Akhir, sekitar 145 hingga 66 juta tahun yang lalu, tersebar di Amerika Utara, Asia, dan Eropa.",
        )
        potoList.add(poto2)

        var poto3 = Poto(
            R.drawable.stegosaurus,
            "stegosaurus",
            "Stegosauridae merupakan dinosaurus yang memiliki lempengan atau duri yang melintang di punggungnya. Dinosaurus ini memiliki tubuh besar dengan kaki pendek dan kepala kecil. Mereka adalah herbivora yang mengonsumsi tanaman rendah seperti pakis dan paku-pakuan. Stegosauridae hidup pada masa Kapur Akhir, sekitar 155 hingga 66 juta tahun yang lalu, dan tersebar di Amerika Utara, Eropa, dan Asia.",
        )
        potoList.add(poto3)

        var poto4 = Poto(
            R.drawable.ornithomimus,
            "Ornithomimidae",
            "Ornithomimidae adalah dinosaurus yang dikenal sebagai \"dinosaurus burung\" karena kemiripannya dengan burung modern. Mereka memiliki tubuh ramping, kaki panjang, dan kepala kecil dengan paruh seperti burung. Dinosaurus ini hidup pada masa Kapur Akhir, sekitar 83 hingga 66 juta tahun yang lalu, tersebar di Amerika Utara dan Asia."
        )
        potoList.add(poto4)

        var poto5 = Poto(
            R.drawable.diplodocus,
            "diplodocus",
            "Therizinosauridae adalah dinosaurus yang memiliki cakar panjang dan tajam, serta tubuh yang relatif besar dengan leher yang panjang. Awalnya dianggap sebagai karnivora, tetapi penelitian terbaru menunjukkan bahwa mereka mungkin adalah herbivora atau omnivora. Dinosaurus ini hidup pada masa Kapur Akhir, sekitar 145 hingga 66 juta tahun yang lalu, tersebar di Amerika Utara, Asia, dan Eropa."
        )
        potoList.add(poto5)

        var poto6 = Poto(
            R.drawable.erlikosaurus,
            "erlikosaurus",
             "Therizinosauridae adalah dinosaurus yang memiliki cakar panjang dan tajam, serta tubuh yang relatif besar dengan leher yang panjang. Awalnya dianggap sebagai karnivora, tetapi penelitian terbaru menunjukkan bahwa mereka mungkin adalah herbivora atau omnivora. Dinosaurus ini hidup pada masa Kapur Akhir, sekitar 145 hingga 66 juta tahun yang lalu, tersebar di Amerika Utara, Asia, dan Eropa."
        )
        potoList.add(poto6)

        var poto7 = Poto(
            R.drawable.ankylosaurus,
            "ankylosaurus",
            "Stegosauridae merupakan dinosaurus yang memiliki lempengan atau duri yang melintang di punggungnya. Dinosaurus ini memiliki tubuh besar dengan kaki pendek dan kepala kecil. Mereka adalah herbivora yang mengonsumsi tanaman rendah seperti pakis dan paku-pakuan. Stegosauridae hidup pada masa Kapur Akhir, sekitar 155 hingga 66 juta tahun yang lalu, dan tersebar di Amerika Utara, Eropa, dan Asia.",
        )
        potoList.add(poto7)

        var poto8 = Poto(
            R.drawable.ornithomimus,
            "ornithomimus",
            "Ornithomimidae adalah dinosaurus yang dikenal sebagai \"dinosaurus burung\" karena kemiripannya dengan burung modern. Mereka memiliki tubuh ramping, kaki panjang, dan kepala kecil dengan paruh seperti burung. Dinosaurus ini hidup pada masa Kapur Akhir, sekitar 83 hingga 66 juta tahun yang lalu, tersebar di Amerika Utara dan Asia.",
        )
        potoList.add(poto8)

        var poto9 = Poto(
            R.drawable.erlikosaurus,
            "erlikosaurus",
            "erlikosaurus adalah  dinosaurus yang dikenal sebagai \"dinosaurus burung\" karena kemiripannya dengan burung modern. Mereka memiliki tubuh ramping, kaki panjang, dan kepala kecil dengan paruh seperti burung. Dinosaurus ini hidup pada masa Kapur Akhir, sekitar 83 hingga 66 juta tahun yang lalu, tersebar di Amerika Utara dan Asia.",
        )
        potoList.add(poto9)

        var poto10 = Poto(
            R.drawable.tyrannosaurusrex,
            "Lee Soo Hyuk",
            "Stegosauridae merupakan dinosaurus yang memiliki lempengan atau duri yang melintang di punggungnya. Dinosaurus ini memiliki tubuh besar dengan kaki pendek dan kepala kecil. Mereka adalah herbivora yang mengonsumsi tanaman rendah seperti pakis dan paku-pakuan. Stegosauridae hidup pada masa Kapur Akhir, sekitar 155 hingga 66 juta tahun yang lalu, dan tersebar di Amerika Utara, Eropa, dan Asia.",
        )
        potoList.add(poto10)

        var poto11 = Poto(
            R.drawable.euoplocephalus,
            "euoplocephalus",
            "euoplocephalus adalah dinosaurus yang memiliki tubuh yang dilindungi oleh lapisan armor yang keras dan cakar yang besar. Mereka memiliki postur rendah dengan tubuh yang gemuk. Dinosaurus ini adalah herbivora yang menggunakan cakar mereka untuk mempertahankan diri dari predator. Ankylosauridae hidup pada masa Kapur Akhir, sekitar 160 hingga 66 juta tahun yang lalu, tersebar di Amerika Utara, Eropa",
        )
        potoList.add(poto11)

        var poto12 = Poto(
            R.drawable.stegosaurus,
            "stegosaurus",
            "stegosaurus adalah dinosaurus yang memiliki cakar panjang dan tajam, serta tubuh yang relatif besar dengan leher yang panjang. Awalnya dianggap sebagai karnivora, tetapi penelitian terbaru menunjukkan bahwa mereka mungkin adalah herbivora atau omnivora. Dinosaurus ini hidup pada masa Kapur Akhir, sekitar 145 hingga 66 juta tahun yang lalu, tersebar di Amerika Utara, Asia, dan Eropa.",
        )
        potoList.add(poto12)

        var poto13 = Poto(
            R.drawable.kentrosaurus,
            "kentrosaurus",
"kentrosaurus adalah dinosaurus yang memiliki tubuh yang dilindungi oleh lapisan armor yang keras dan cakar yang besar. Mereka memiliki postur rendah dengan tubuh yang gemuk. Dinosaurus ini adalah herbivora yang menggunakan cakar mereka untuk mempertahankan diri dari predator. Ankylosauridae hidup pada masa Kapur Akhir, sekitar 160 hingga 66 juta tahun yang lalu, tersebar di Amerika Utara, Eropa, dan Asia.",
        )
        potoList.add(poto13)

        var poto14 = Poto(
            R.drawable.parasaurolophus,
          "parasaurolophus",
            "parasaurolophus merupakan dinosaurus yang memiliki lempengan atau duri yang melintang di punggungnya. Dinosaurus ini memiliki tubuh besar dengan kaki pendek dan kepala kecil. Mereka adalah herbivora yang mengonsumsi tanaman rendah seperti pakis dan paku-pakuan. Stegosauridae hidup pada masa Kapur Akhir, sekitar 155 hingga 66 juta tahun yang lalu, dan tersebar di Amerika Utara, Eropa, dan Asia.",
            )
        potoList.add(poto14)

        var poto15 = Poto(
            R.drawable.stegosaurus,
            "stegosaurus",
            "stegosaurus adalah dinosaurus yang memiliki tubuh yang dilindungi oleh lapisan armor yang keras dan cakar yang besar. Mereka memiliki postur rendah dengan tubuh yang gemuk. Dinosaurus ini adalah herbivora yang menggunakan cakar mereka untuk mempertahankan diri dari predator. Ankylosauridae hidup pada masa Kapur Akhir, sekitar 160 hingga 66 juta tahun yang lalu, tersebar di Amerika Utara, Eropa, dan Asia.",
            )
        potoList.add(poto15)
    }



}
