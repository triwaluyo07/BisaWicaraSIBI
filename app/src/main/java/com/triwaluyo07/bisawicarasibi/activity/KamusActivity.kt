package com.triwaluyo07.bisawicarasibi.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayoutMediator
import com.triwaluyo07.bisawicarasibi.R
import com.triwaluyo07.bisawicarasibi.adapter.SectionPagerAdapter
import com.triwaluyo07.bisawicarasibi.databinding.ActivityKamusBinding

class KamusActivity : AppCompatActivity()
{
    companion object
    {
        private val tabTitle = intArrayOf(
            R.string.huruf, R.string.angka
        )
    }

    private lateinit var binding: ActivityKamusBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityKamusBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = getString(R.string.dictionary)

        binding.viewPager.adapter = SectionPagerAdapter(this)
        TabLayoutMediator(binding.tabs, binding.viewPager)
        { tab, position ->
            tab.text = resources.getString(tabTitle[position])
        }.attach()

        supportActionBar?.elevation = 0f
    }

}