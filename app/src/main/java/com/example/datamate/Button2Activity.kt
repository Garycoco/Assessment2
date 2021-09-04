package com.example.datamate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Button2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button2)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.title = "Activity 2"
    }
    override fun onSupportNavigateUp(): Boolean {
        return super.onSupportNavigateUp()
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}