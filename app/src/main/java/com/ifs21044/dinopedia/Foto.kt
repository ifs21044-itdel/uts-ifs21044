package com.ifs21044.dinopedia


var fotoList = mutableListOf<Foto>()

val FOTO_ID_EXTRA = "fotoExtra"
class Foto(
    var cover: Int,
    var judul: String,
    var debut: String,
    var tanggal: String,
    var dino1: Int,
    var dino2 : Int,
    var dinoket1: String,
    var dinoket2: String,

    val id: Int? = fotoList.size
)
{}