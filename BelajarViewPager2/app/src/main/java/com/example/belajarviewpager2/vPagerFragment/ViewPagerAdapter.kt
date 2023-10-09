package com.example.belajarviewpager2.vPagerFragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import kotlin.collections.ArrayList

class ViewPagerAdapter(
    list: ArrayList<Any>,
    manager: FragmentManager,
    lifecycle: Lifecycle
): FragmentStateAdapter(manager, lifecycle) {

    private val fragmentList = list

    override fun getItemCount(): Int {
        return fragmentList.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragmentList[position]
    }
}