package com.touhidapps.pager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        setupViewPager(viewPager)

    } // onCreate


    private fun setupViewPager(viewPager: ViewPager) {

        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        navView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> {
                    viewPager.currentItem = 0
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.navigation_history -> {
                    viewPager.currentItem = 1
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.navigation_settings -> {
                    viewPager.currentItem = 2
                    return@setOnNavigationItemSelectedListener true
                }
            }
            return@setOnNavigationItemSelectedListener false
        }

        viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {

            override fun onPageScrollStateChanged(state: Int) {

            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

            }

            override fun onPageSelected(position: Int) {
                var mId = 0
                when (position) {
                    0 -> mId = R.id.navigation_home
                    1 -> mId = R.id.navigation_history
                    2 -> mId = R.id.navigation_settings
                }
                navView.selectedItemId = mId
            }

        })

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
