package com.zcdev.blooddonation

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.aurelhubert.ahbottomnavigation.AHBottomNavigation
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem
import com.google.android.gms.tasks.OnSuccessListener
import com.google.firebase.FirebaseApp
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.getValue
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.ktx.Firebase
import com.zcdev.blooddonation.fragment.AboutFragment
import com.zcdev.blooddonation.fragment.DonnerFragment
import com.zcdev.blooddonation.fragment.HomeFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),AHBottomNavigation.OnTabSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.nav.setOnTabSelectedListener(this)
        this.creattabs()

    }



    fun creattabs() {
        var home = AHBottomNavigationItem("Home",
            R.drawable.home
        )
        var fav = AHBottomNavigationItem("Become a donor",
            R.drawable.donner
        )

        var accont = AHBottomNavigationItem("About",
            R.drawable.notifications
        )
        nav.addItem(home)
        nav.addItem(fav)
        nav.addItem(accont)

        nav.defaultBackgroundColor = Color.parseColor("#ffffff")
        nav.accentColor = Color.parseColor("#ffff0000")
        nav.inactiveColor = Color.parseColor("#000000")
        nav.currentItem = 0



        //nav.isBehaviorTranslationEnabled=false




    }

    override fun onTabSelected(position: Int, wasSelected: Boolean): Boolean {
        when(position){
         0->{
          var frg1=HomeFragment()
             supportFragmentManager.beginTransaction().replace(R.id.container,frg1).commit()
         }
         1->{
             var frg1=DonnerFragment()
             supportFragmentManager.beginTransaction().replace(R.id.container,frg1).commit()
            }
         2->{
             var frg1= AboutFragment()
             supportFragmentManager.beginTransaction().replace(R.id.container,frg1).commit()
            }

        }
        return true
    }


}