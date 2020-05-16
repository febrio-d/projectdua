package com.smkcoding.projectdua

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import com.google.android.material.tabs.TabLayoutMediator
import com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
import kotlinx.android.synthetic.main.activity_main.*

    class MainActivity : AppCompatActivity() {
        val menuTeks = arrayOf("Home", "News", "Profile")
        val manuIcon = arrayOf(R.drawable.ic_home, R.drawable.ic_news,
            R.drawable.ic_person)

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            val adapter = ViewPagerAdapter(this)
            view_pager.setAdapter(adapter);
            TabLayoutMediator(tab_layout, view_pager,
                TabConfigurationStrategy { tab, position ->
                    tab.text = menuTeks[position]
                    tab.icon = ResourcesCompat.getDrawable(resources, manuIcon[position], null)

            }).attach()
        }
    }