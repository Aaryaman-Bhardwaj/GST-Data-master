package com.aaryaman.gstdatamaster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val hand=Handler()
        hand.postDelayed(
            {startActivity(Intent(this,Login::class.java))},1000
        )
    }
}