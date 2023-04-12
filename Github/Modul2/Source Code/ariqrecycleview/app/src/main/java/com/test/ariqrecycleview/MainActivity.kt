package com.test.ariqrecycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recycleView: RecyclerView
    lateinit var adapter: RvAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

            recycleView.layoutManager = LinearLayoutManager(this)
                    recycleView . adapter = adapter

    }
    private fun init(){
        recycleView = findViewById(R.id.recycler_view)

        var data = ArrayList<gamePs2>()
        data.add(gamePs2(R.drawable.ace5, txtTitle = "Ace Combat 5", txtSubTitle = "permainan video penerbangan tempur semi-realistis untuk Playstation 2. Seperti gim lain di serial Ace Combat milik Namco, Ace Combat 5 menampilkan permainan yang merupakan campuran antara penerbangan arcade dan simulasi penerbangan nyata. Gim ini dikembangkan oleh Project Aces, sebuah kelompok internal Namco yang bertanggungjawab atas pengembangan serial Ace Combat,[3] dan dipublikasikan oleh Namco pada bulan Oktober 2004. Sejumlah gim terbatas dibundel dengan aksesoris Hori Flightstick 2."))
        data.add(gamePs2(R.drawable.god_hand, txtTitle = "God Hand", txtSubTitle = " permainan video action beat 'em up yang dikembangkan oleh Clover Studio dan diterbitkan oleh Capcom untuk konsol permainan PlayStation 2. Permainan ini disutradarai oleh desainer Resident Evil Shinji Mikami, dan dirilis di Jepang dan Amerika Utara pada 2006 dan pada 2007 untuk wilayah PAL; pada 4 Oktober 2011, permainan ini dirilis ulang untuk PlayStation 3 sebagai title dapat diunduh di PlayStation Network. Mikami ini adalah untuk menciptakan sebuah permainan Aksi yang ditujukan untuk \" hardcore gamers \" intermixed dengan sejumlah besar comic relief. Permainan ini menerima respon positif dari kritikus dan dirilis di Jepang terjual wajar. Ini adalah permainan video terakhir Clover Studio."))
        data.add(gamePs2(R.drawable.mksm, txtTitle = "Mortal Kombat Shaolin Monks", txtSubTitle = " aksi petualangan Permainan bertarung Berjuang permainan video berdasarkan Mortal Kombat serangkaian game pertarungan. Shaolin Monks dikembangkan oleh Midway Studios LA (fsebelumnya Pengembangan Paradoks), Midway - San Diego, dan Mortal Kombat Team - Chicago, dan diterbitkan oleh Midway Games for the PlayStation 2 and Xbox.[1] Itu dirilis 16 September 2005 di Amerika Serikat dan 30 September 2005 di Eropa untuk kedua platform."))
        data.add(gamePs2(R.drawable.re4, txtTitle = "Resident Evil 4", txtSubTitle = "Leon adalah seorang agen spesialis dibawah komando langsung oleh presiden Amerika Serikat, yang ditugaskan untuk menyelamatkan putri sang presiden. Zombie spesies baru pun muncul, diberi nama Ganados, yang merupakan manusia yang dikontrol oleh satu orang dengan menggunakan sebuah parasit yang bernam Plaga. Sepanjang perjalanan, Leon bertemunya dengan kawan-kawan lamanya yaitu Ada dan Krauser."))
        data.add(gamePs2(R.drawable.mw, txtTitle = "Most Wanted", txtSubTitle = "Pemain tiba di Rockport City, keluar dari dunia balap ilegal bawah tanah, dengan mobil BMW M3 GTR GT (E46) yang dimodifikasi. Mengikuti Mia Townsend (Josie Maran), pemain membuktikan kemampuan mengemudinya saat dia dikejar oleh seorang petugas polisi veteran bernama Cross (Dean McKenzie), dengan asistennya yang namanya tidak disebut (Simone Bailey), yang bersumpah untuk menangkap pemain tersebut."))


        adapter = RvAdapter(data)
    }

}