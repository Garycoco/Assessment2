package com.example.datamate


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationView

class Inside : AppCompatActivity() {


    private lateinit var navDrawer : DrawerLayout


    private lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inside)

        navDrawer = findViewById(R.id.drawerLayout)
        val navView : NavigationView = findViewById(R.id.navView)

        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        toggle = ActionBarDrawerToggle(this,navDrawer,toolbar,R.string.open, R.string.close)
        toggle.isDrawerIndicatorEnabled = true
        navDrawer.addDrawerListener(toggle)
        toggle.syncState()


        
        val homeFragment = HomeFragment()
        val settingsFragment = SettingsFragment()
        val aboutUsFragment = AboutUs()
        val contactUsFragment = ContactUs()
        setCurrentFragment(homeFragment,title.toString())

        navView.setNavigationItemSelectedListener {
            it.isChecked = true
            when(it.itemId){
                R.id.Home->setCurrentFragment(homeFragment,it.title.toString())
                R.id.Settings->setCurrentFragment(settingsFragment, it.title.toString())
                R.id.About -> setCurrentFragment(aboutUsFragment,it.title.toString())
                R.id.contact_us -> setCurrentFragment(contactUsFragment,it.title.toString())
                R.id.Logout -> finish()
            }
            true
        }
    }






    private fun setCurrentFragment(fragment: Fragment,title : String){
        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        transaction.replace(R.id.Frame, fragment)
        navDrawer.closeDrawers()
        transaction.commit()
        setTitle(title)
        }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)){

            return true
        }
        return super.onOptionsItemSelected(item)
    }
}