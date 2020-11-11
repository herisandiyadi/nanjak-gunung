package com.example.nanjakgunung

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class AboutMe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_me)

        val actionbar = supportActionBar
        actionbar!!.title = "Tentang Ku"
        actionbar.setDisplayHomeAsUpEnabled(true)


    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }


}