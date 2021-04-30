package com.example.finzper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         setSupportActionBar(findViewById(R.id.my_toolbar))
        val bottomNavigation: BottomNavigationView = findViewById(R.id.bottom_navigation)
        bottomNavigation.itemIconTintList = null
        bottomNavigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

    }

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.inicioFragment -> {
                val inicioFragment = InicioFragment.newInstance()
                openFragment(inicioFragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.analisisFragment -> {
                val analisisFragment = AnalisisFragment.newInstance()
                openFragment(analisisFragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.confFragment -> {
                val confFragment = ConfFragment.newInstance()
                openFragment(confFragment)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    private fun openFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frame_container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

}

