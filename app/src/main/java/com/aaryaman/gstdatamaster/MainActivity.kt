package com.aaryaman.gstdatamaster

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    lateinit var UserName1:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView=findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        val navController=findNavController(R.id.fragmentContainerView)
        bottomNavigationView.setupWithNavController(navController)

        UserName1=findViewById(R.id.UserName1)
        UserName1.text=UserInfo.Myname(this)
    }
}