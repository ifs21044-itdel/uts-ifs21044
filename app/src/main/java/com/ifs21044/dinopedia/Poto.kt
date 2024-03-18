package com.ifs21044.dinopedia

var potoList = mutableListOf<Poto>()
val POTO_ID_EXTRA = "potoExtra"
class Poto(
    var pp: Int,
    var capt: String,
    var keterangan: String,
    var id:Int? = potoList.size
)
{}