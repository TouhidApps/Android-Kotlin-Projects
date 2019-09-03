package com.touhidapps.pager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        setupViewPager()

    } // onCreate


    private fun setupViewPager() {

        val viewPager = findViewById<ViewPager>(R.id.viewPager)
        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        tabLayout.setupWithViewPager(viewPager)


        // fragments
        var frags: MutableList<Fragment> = mutableListOf(
            HomeFragment(),
            HistoryFragment(),
            SettingsFragment()
        )

        // fragment names
        var fragNames: MutableList<String> = mutableListOf(
            getString(R.string.title_home),
            getString(R.string.title_history),
            getString(R.string.title_settings)
        )

        val adapter = MyPagerAdapter(supportFragmentManager, frags, fragNames)

        viewPager.offscreenPageLimit = frags.size // load all fragment on memory to avoid map reload after navigation
        viewPager.adapter = adapter

    } // setupViewPager




}
