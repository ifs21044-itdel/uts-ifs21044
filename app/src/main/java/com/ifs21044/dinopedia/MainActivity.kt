package com.ifs21044.dinopedia


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.ifs21044.dinopedia.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), FotoClickListener {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        populateFotos()

        val mainActivity = this
        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(applicationContext)
            adapter = FotoAdapter(fotoList, mainActivity)
        }
    }

    override fun onClick(foto: Foto) {
        val intent = Intent(applicationContext, DetailActivity::class.java)
        intent.putExtra(FOTO_ID_EXTRA, foto.id)
        startActivity(intent)
    }

    private fun populateFotos() {
        val foto1 = Foto(
            R.drawable.tyrannosauridae,
            "tyrannosauridae",
            "68 hingga 66 juta tahun yang lalu.",
            "Ornithomimidae adalah keluarga dinosaurus yang dikenal sebagai \"dinosaurus burung\" karena kemiripannya dengan burung modern. Mereka memiliki tubuh ramping, kaki panjang, dan kepala kecil dengan paruh seperti burung. Dinosaurus ini hidup pada masa Kapur Akhir, sekitar 83 hingga 66 juta tahun yang lalu, tersebar di Amerika Utara dan Asia.",
            R.drawable.tyrannosaurusrex,
            R.drawable.albertosaurus,
            "tyrannosaurusrex",
            "albertosaurus"
        )
        fotoList.add(foto1)

        val foto2 = Foto(
            R.drawable.hadrosauridae,
            "hadrosauridae",
            " 80 hingga 65 juta tahun yang lalu",
            "Stegosauridae merupakan keluarga dinosaurus yang memiliki lempengan atau duri yang melintang di punggungnya. Dinosaurus ini memiliki tubuh besar dengan kaki pendek dan kepala kecil. Mereka adalah herbivora yang mengonsumsi tanaman rendah seperti pakis dan paku-pakuan. Stegosauridae hidup pada masa Kapur Akhir, sekitar 155 hingga 66 juta tahun yang lalu, dan tersebar di Amerika Utara, Eropa, dan Asia.",
            R.drawable.parasaurolophus,
            R.drawable.edmontosaurus,
            "parasaurolophus",
            "edmontosaurus"
        )
        fotoList.add(foto2)

        val foto3 = Foto(
            R.drawable.ceratopsidae,
            "Ceratopsidae",
            " 72 hingga 65 juta tahun yang lalu.",
            "Ankylosauridae adalah keluarga dinosaurus yang memiliki tubuh yang dilindungi oleh lapisan armor yang keras dan cakar yang besar. Mereka memiliki postur rendah dengan tubuh yang gemuk. Dinosaurus ini adalah herbivora yang menggunakan cakar mereka untuk mempertahankan diri dari predator. Ankylosauridae hidup pada masa Kapur Akhir, sekitar 160 hingga 66 juta tahun yang lalu, tersebar di Amerika Utara, Eropa, dan Asia.",
            R.drawable.triceratops,
            R.drawable.styracosaurus,
            "triceratops",
            "styracosaurus"
        )
        fotoList.add(foto3)

        val foto4 = Foto(
            R.drawable.sauropodae,
            "Sauropodae",
            "201 hingga 66 juta tahun yang lalu.",
            "Therizinosauridae adalah keluarga dinosaurus yang memiliki cakar panjang dan tajam, serta tubuh yang relatif besar dengan leher yang panjang. Awalnya dianggap sebagai karnivora, tetapi penelitian terbaru menunjukkan bahwa mereka mungkin adalah herbivora atau omnivora. Dinosaurus ini hidup pada masa Kapur Akhir, sekitar 145 hingga 66 juta tahun yang lalu, tersebar di Amerika Utara, Asia, dan Eropa.",
            R.drawable.brachiosaurus,
            R.drawable.diplodocus,
            "brachiosaurus",
            "diplodocus"
        )
        fotoList.add(foto4)


        val foto5 = Foto(
            R.drawable.ornithomimidae,
            "Ornithomimidae",
            "83 hingga 66 juta tahun yang lalu.",
            "Ornithomimidae adalah keluarga dinosaurus yang dikenal sebagai \"dinosaurus burung\" karena kemiripannya dengan burung modern. Mereka memiliki tubuh ramping, kaki panjang, dan kepala kecil dengan paruh seperti burung. Dinosaurus ini hidup pada masa Kapur Akhir, sekitar 83 hingga 66 juta tahun yang lalu, tersebar di Amerika Utara dan Asia.",
            R.drawable.ornithomimus,
            R.drawable.struthiomimus,
            "ornithomimus",
            "struthiomimus"
        )
        fotoList.add(foto5)

        val foto6 = Foto(
            R.drawable.stegosauridae,
            "Stegosauridae",
            "155 hingga 66 juta tahun yang lalu.",
            "Stegosauridae merupakan keluarga dinosaurus yang memiliki lempengan atau duri yang melintang di punggungnya. Dinosaurus ini memiliki tubuh besar dengan kaki pendek dan kepala kecil. Mereka adalah herbivora yang mengonsumsi tanaman rendah seperti pakis dan paku-pakuan. Stegosauridae hidup pada masa Kapur Akhir, sekitar 155 hingga 66 juta tahun yang lalu, dan tersebar di Amerika Utara, Eropa, dan Asia",
            R.drawable.stegosaurus,
            R.drawable.kentrosaurus,
            "stegosaurus",
            "kentrosaurus"
        )
        fotoList.add(foto6)

        val foto7 = Foto(
            R.drawable.ankylosaurus,
            "Ankylosaurus",
            "160 hingga 66 juta tahun yang lalu.",
            "Ankylosauridae adalah keluarga dinosaurus yang memiliki tubuh yang dilindungi oleh lapisan armor yang keras dan cakar yang besar. Mereka memiliki postur rendah dengan tubuh yang gemuk. Dinosaurus ini adalah herbivora yang menggunakan cakar mereka untuk mempertahankan diri dari predator. Ankylosauridae hidup pada masa Kapur Akhir, sekitar 160 hingga 66 juta tahun yang lalu, tersebar di Amerika Utara, Eropa, dan Asia.",
            R.drawable.ankylosaurus,
            R.drawable.euoplocephalus,
            "ankylosaurus",
            "euoplocephalus"
        )
        fotoList.add(foto7)

        val foto8 = Foto(
            R.drawable.therizinosauridae,
            "Therizinosauridae",
            " 145 hingga 66 juta tahun yang lalu.",
            "Therizinosauridae adalah keluarga dinosaurus yang memiliki cakar panjang dan tajam, serta tubuh yang relatif besar dengan leher yang panjang. Awalnya dianggap sebagai karnivora, tetapi penelitian terbaru menunjukkan bahwa mereka mungkin adalah herbivora atau omnivora. Dinosaurus ini hidup pada masa Kapur Akhir, sekitar 145 hingga 66 juta tahun yang lalu, tersebar di Amerika Utara, Asia, dan Eropa.",
            R.drawable.therizinosaurus,
            R.drawable.erlikosaurus,
            "therizinosaurus",
            "erlikosaurus"
        )
        fotoList.add(foto8)
    }

}