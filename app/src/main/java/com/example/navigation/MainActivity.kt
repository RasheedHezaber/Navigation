package com.example.navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.Toast
import android.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.app_bar_main.*


class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener  {
    lateinit var toolbar: androidx.appcompat.widget.Toolbar
    lateinit var drawer: DrawerLayout
    lateinit var nav: NavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        drawer = findViewById(R.id.drawer_layout)
        nav= findViewById(R.id.nav_view)


        val toggle = ActionBarDrawerToggle(this, drawer, toolbar, 0, 0
        )


        toggle.isDrawerIndicatorEnabled=true
        drawer.addDrawerListener(toggle)
        toggle.syncState()
        nav.setNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_profile -> {

                appbartext.text="profile"
                contact.text="you are in profile page"
                liner.setBackgroundResource(R.color.colorAccent)

            }
            R.id.nav_messages -> {
                appbartext.text="messages"
                contact.text="you are in messages page"
                liner.setBackgroundResource(R.color.color1)

            }
            R.id.nav_friends -> {
                appbartext.text="friends"
                contact.text="you are in friends page"
                liner.setBackgroundResource(R.color.color2)

            }
            R.id.nav_update -> {
                appbartext.text="update"
                contact.text="you are in update page"
                liner.setBackgroundResource(R.color.color3)

            }
            R.id.nav_logout -> {

                liner.setBackgroundResource(R.color.colorPrimary)

            }
        }
        drawer.closeDrawer(GravityCompat.START)
        return true
    }

    }



