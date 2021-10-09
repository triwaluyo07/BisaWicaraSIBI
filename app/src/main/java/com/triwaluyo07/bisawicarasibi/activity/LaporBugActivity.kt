package com.triwaluyo07.bisawicarasibi.activity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.triwaluyo07.bisawicarasibi.R
import com.triwaluyo07.bisawicarasibi.databinding.ActivityLaporBugBinding
import kotlinx.android.synthetic.main.activity_lapor_bug.*

class LaporBugActivity : AppCompatActivity()
{
    private lateinit var binding : ActivityLaporBugBinding

    private companion object
    {
        private const val base_url = "https://wa.me/6287700535264?text="
        private const val temp_text =
            "Saya%20ingin%20melaporkan%20bug%20pada%20bagian%20berikut: %0A"
    }

    override fun onCreate(savedInstanceState : Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityLaporBugBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = getString(R.string.report_bug)

        btn_send.setOnClickListener {
            if (input_bug.text.toString() == "")
            {
                Toast.makeText(
                    this, "Dimana \"Bug\"-nya!?", Toast.LENGTH_SHORT
                ).show()
            }
            else
            {
                startActivity(
                    Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("${base_url}${temp_text}${input_bug.text}")
                    )
                )
            }
        }
    }
}