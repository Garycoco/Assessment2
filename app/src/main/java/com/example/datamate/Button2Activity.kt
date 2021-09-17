package com.example.datamate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.datamate.databinding.ActivityButton2Binding

class Button2Activity : AppCompatActivity() {
    private lateinit var binding: ActivityButton2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityButton2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.title = "Button2Activity"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


    }

}