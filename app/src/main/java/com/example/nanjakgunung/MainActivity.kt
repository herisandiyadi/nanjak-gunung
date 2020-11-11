package com.example.nanjakgunung

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvGng: RecyclerView
    private var list: ArrayList<Gng> = arrayListOf()
    private lateinit var listGngAdapter: ListGngAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionBar: ActionBar? = supportActionBar
        actionBar?.title = "List Data Gunung"


        rvGng = findViewById(R.id.rv_gng)
        rvGng.setHasFixedSize(true)

        list.addAll(GngData.listData)
        showRecyclerList()


    }

    private fun showRecyclerList() {
        rvGng.layoutManager = LinearLayoutManager(this)
        val listGngAdapter = ListGngAdapter(list)
        rvGng.adapter = listGngAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_item, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val intentabout = Intent(this, AboutMe::class.java)
        startActivity(intentabout)
        return true
    }

}