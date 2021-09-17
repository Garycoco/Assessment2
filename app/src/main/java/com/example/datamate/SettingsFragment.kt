package com.example.datamate

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.Fragment
import com.example.datamate.databinding.FragmentSettingsBinding
import de.hdodenhof.circleimageview.CircleImageView

class SettingsFragment : Fragment(R.layout.fragment_settings) {

    private lateinit var binding: FragmentSettingsBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val image = registerForActivityResult(ActivityResultContracts.GetContent()
        ) {
            binding.circleImageView.setImageURI(it)
        }
        binding = FragmentSettingsBinding.bind(view)
        binding.BtnChange.setOnClickListener {
            Toast.makeText(context,"Change profile picture",Toast.LENGTH_SHORT).show()
            image.launch("image/*")
        }
        binding.button.setOnClickListener {
            Toast.makeText(context,"Change Email address",Toast.LENGTH_SHORT).show()
        }
        binding.button1.setOnClickListener {
            Toast.makeText(context,"Change name and Surname",Toast.LENGTH_SHORT).show()
        }
    }
}