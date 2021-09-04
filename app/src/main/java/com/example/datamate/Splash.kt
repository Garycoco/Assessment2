package com.example.datamate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.TextView


class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        supportActionBar!!.hide()

        val title = findViewById<TextView>(R.id.title)
        val slide = android.view.animation.AnimationUtils.loadAnimation(this,R.anim.slide)
        title.startAnimation(slide)

        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            val i = Intent(this,Inside::class.java)
            startActivity(i)
            finish()
        }, 3000)
    }
}