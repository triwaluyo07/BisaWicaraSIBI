package com.triwaluyo07.bisawicarasibi.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.triwaluyo07.bisawicarasibi.R
import com.triwaluyo07.bisawicarasibi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        intentActivity()
    }

    private fun intentActivity()
    {
        binding.cardKamus.setOnClickListener {
            val intent = Intent(this, KamusActivity::class.java)
            startActivity(intent)
        }

        binding.cardTestskill.setOnClickListener {
            val intent = Intent(this, TestActivity::class.java)
            startActivity(intent)
        }

        binding.cardLaporbug.setOnClickListener {
            val intent = Intent(this, LaporBugActivity::class.java)
            startActivity(intent)
        }
    }
}