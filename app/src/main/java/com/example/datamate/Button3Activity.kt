package com.example.datamate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Button3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button3)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.title = "Activity 3"
    }
    override fun onSupportNavigateUp(): Boolean {
        return super.onSupportNavigateUp()
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}