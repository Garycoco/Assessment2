package com.example.datamate

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.datamate.databinding.ActivityButton1Binding

class Button1Activity : AppCompatActivity() {

    private lateinit var binding: ActivityButton1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityButton1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title="Button1Activity"






    }


}