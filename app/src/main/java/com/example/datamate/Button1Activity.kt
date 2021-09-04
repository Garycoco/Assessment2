package com.example.datamate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Button1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button1)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.title = "Activity 1"
    }
    override fun onSupportNavigateUp(): Boolean {
        return super.onSupportNavigateUp()
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}