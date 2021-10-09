package com.triwaluyo07.bisawicarasibi.adapter

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.triwaluyo07.bisawicarasibi.fragment.FragmentAngka
import com.triwaluyo07.bisawicarasibi.fragment.FragmentHuruf

class SectionPagerAdapter(act : AppCompatActivity) :
    FragmentStateAdapter(act)
{
    override fun createFragment(position : Int) : Fragment = when (position)
    {
        0 -> FragmentHuruf()
        1 -> FragmentAngka()
        else -> Fragment()
    }

    override fun getItemCount() : Int = 2
}