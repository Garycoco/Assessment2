package com.example.datamate

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_home, container, false)

        val button1 = view.findViewById<Button>(R.id.button1)
        button1.setOnClickListener {
            val i = Intent(context,Button1Activity::class.java)
            startActivity(i)
        }
        val button2 = view.findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            val i = Intent(context,Button2Activity::class.java)
            startActivity(i)
        }
        val button3 = view.findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            val i = Intent(context,Button3Activity::class.java)
            startActivity(i)
        }


        return view
    }
}