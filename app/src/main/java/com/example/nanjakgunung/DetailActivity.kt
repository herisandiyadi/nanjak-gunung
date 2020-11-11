package com.example.nanjakgunung

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DESC = "extra_desc"
        const val EXTRA_HARGA = "extra_harga"
        const val EXTRA_JALUR = "extra_jalur"
        const val EXTRA_PHOTO = "extra_photo"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val actionbar = supportActionBar
        actionbar!!.title = "Detail Informasi"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val tvSetName: TextView = findViewById(R.id.result_nama)
        val tvSetDesc: TextView = findViewById(R.id.result_desc)
        val tvSetJalur: TextView = findViewById(R.id.result_jalur)
        val tvSetHarga: TextView = findViewById(R.id.result_harga)
        val imgSetPhoto: ImageView = findViewById(R.id.result_img)

        val tName: String? = intent.getStringExtra(EXTRA_NAME)
        val tDesc: String? = intent.getStringExtra(EXTRA_DESC)
        val tHarga: String? = intent.getStringExtra(EXTRA_HARGA)
        val tJalur: String? = intent.getStringExtra(EXTRA_JALUR)
        val tImg = intent.getIntExtra(EXTRA_PHOTO, 0)

        tvSetName.text = tName
        Glide.with(this)
            .load(tImg)
            .apply(RequestOptions())
            .into(imgSetPhoto)
        tvSetDesc.text = tDesc
        tvSetHarga.text = tHarga
        tvSetJalur.text = tJalur
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }


}