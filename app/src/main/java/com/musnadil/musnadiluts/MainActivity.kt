package com.musnadil.musnadiluts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Rumah Adat Indonesia"

        //Inisialisasi Array
        data = ArrayList()

        //Simpan data

        data?.add(DataModel(R.drawable.aceh,"Rumah Krong Bade","Aceh",
            "Rumah Krong Bade dari Aceh ini berbentuk memanjang dari timur ke barat menyerupai persegi panjang. " +
                    "Di bagian depan rumah dilengkapi dengan tangga untuk masuk ke dalam rumah. " +
                    "Umumnya, tangga pada rumah adat Aceh ini jumlahnya ganjil, yaitu sekitar 7 hingga 9 anak tangga."))

        data?.add(DataModel(R.drawable.sumut,"Rumah Bolon","Sumatera Utara",
            "Pada rumah adat Bolon ini, terdapat dua bagian yang berbeda, " +
                    "yaitu Jabu Bolon dan juga Jabu Parsakitan. " +
                    "Jabu Bolon biasa menjadi tempat untuk keluarga besar, " +
                    "sedangkan Jabu Parsakitan adalah tempat untuk membicarakan masalah adat. " +
                    "Uniknya dari rumah adat Sumatera Utara ini adalah tidak ada sekatan antara tiap ruangan, " +
                    "sehingga semua anggota keluarga tidur bersama."))

        data?.add(DataModel(R.drawable.sumbar,"Rumah Gadang","Sumatera Barat",
            "Rumah adat satu ini terlihat mewah bukan? " +
                    "Berasal dari Sumatera Barat, rumah ini memiliki beberapa atap yang runcing dan menjulang keatas. " +
                    "Rumah ini terbuat dari ijuk dan bentuknya mirip seperti tanduk kerbau yang " +
                    "melambangkan kemenangan suku Minang dalam perlombaan adu kerbau di Jawa."))

        data?.add(DataModel(R.drawable.jateng,"Rumah Joglo","Jawa Tengah/DIY/Jawa Timur ",
            "Mungkin kamu sudah sering mendengar Rumah Joglo ini. " +
                    "Di bagian depan rumah akan ada pendopo untuk menjamu tamu. " +
                    "Rumah Joglo dari Jawa Tengah ini memiliki empat tiang penopang dan " +
                    "juga memiliki sentuhan kejawen dari suku Jawa di sisi-sisi rumah."))

        data?.add(DataModel(R.drawable.jabar,"Rumah Kasepuhan","Jawa Barat",
            "Rumat adat dari Jawa Barat ini merupakan peninggalan dari Kerajaan Islam di wilayah tersebut." +
                    " Sering disebut Keraton Kasepuhan, rumah ini memang sebenarnya merupakan perluasan dari " +
                    "Keraton Pakungwati. Pintu utama keraton ini sangat unik dan terlihat menawan."))

        data?.add(DataModel(R.drawable.kalbar,"Rumah Panjang","Kalimantan Barat",
            "Rumah adat Provinsi Kalimantan Barat ini mempunyai ukuran yang besar dan terdiri dari dua" +
                    " bagian, yaitu bangunan atas dan bawah. Rumah ini sangat unik karena memadukan kesan modern " +
                    "dan tradisional sekaligus. Arsitektur Rumah Panjang bertema budaya Suku Daya pada beberapa " +
                    "sisi bangunannya."))

        data?.add(DataModel(R.drawable.kalsel,"Rumah Bubungan Tinggi","Kalimantan Selatan",
            "Menggunakan konsep panggung dan terbuat dari kayu ulin tentunya membuat rumah ini" +
                    " memiliki ketahanan yang kuat, dan akan lebih kuat lagi jika terkena air. " +
                    "Uniknya lagi, atap dari rumah ini memiliki sudut kemiringan 45 derajat"))


        data?.add(DataModel(R.drawable.kalteng,"Rumah Betang","Kalimantan Tengah",
            "Rumah Betang dari Kalimantan Tengah ini seperti panggung dengan kayu tinggi yang " +
                    "menopangnya dengan tujuan untuk menghindari banjir. Karena rumah ini sangat besar dan " +
                    "panjang, penghuninya dapat mencapai 150 orang loh, Ruppers."))


        data?.add(DataModel(R.drawable.kaltim,"Rumah Lamin","Kalimantan Timur",
            "Rumah Lamin dari Kalimantan Timur juga tidak kalah uniknya." +
                    " Gaya arsitektur yang khas dan juga luas bangunannya menjadi ciri khas dari Rumah Lamin." +
                    " Pada bagian atap rumah terdapat ornamen kepala naga dari kayu." +
                    " Di sisi-sisi bangunannya juga terdapat ukiran atau lukisan budaya yang unik."))


        data?.add(DataModel(R.drawable.sulbar,"Rumah Boyang","Sulawesi Barat",
            "Rumah Boyang dari Sulawesi Barat berkonsep seperti panggung dengan tiang-tiang penopangnya. " +
                    "Tiang penopang tersebut tidak menancap ke dalam tanah, melainkan berdiri di atas batu datar" +
                    " agar rumah tidak tumbang."))

        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("asal", item?.asal)
                intent.putExtra("deskripsi", item?.deskripsi)
                startActivity(intent)
            }

        })


    }
}