package com.example.datamate

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.datamate.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        binding = FragmentHomeBinding.inflate(layoutInflater)

        binding.button1.setOnClickListener {
            val i = Intent(context,Button1Activity::class.java)
            startActivity(i)
        }
        binding.button2.setOnClickListener {
            val i = Intent(context,Button2Activity::class.java)
            startActivity(i)
        }
        binding.button3.setOnClickListener {
            val i = Intent(context,Button3Activity::class.java)
            startActivity(i)
        }


        return  binding.root

    }
}