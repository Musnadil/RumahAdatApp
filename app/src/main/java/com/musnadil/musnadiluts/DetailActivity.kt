package com.musnadil.musnadiluts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Detail Rumah Adat"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)

        imageViewDetail.setImageResource(intent.getIntExtra("gambar", R.drawable.rendang))
        textViewNamaDetail.text = intent.getStringExtra("nama")
        textViewAsalDaerah.text = intent.getStringExtra("asal")
        textViewDeskripsiDetail.text = intent.getStringExtra("deskripsi")

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}