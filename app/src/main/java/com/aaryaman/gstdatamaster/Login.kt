package com.aaryaman.gstdatamaster

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aaryaman.gstdatamaster.utils.UserInfo
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {
    lateinit var shp:SharedPreferences
    lateinit var shpEditor:SharedPreferences.Editor

    override fun onStart() {
        super.onStart()
        checkLogin()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        shp=getSharedPreferences("Login", MODE_PRIVATE)
        checkLogin()

        loginBtn.setOnClickListener {
            val name=name.text
            val phNo=phNo.text
            if(name.toString() != "" || phNo.toString() != ""){
                UserInfo.myName=name.toString()
                UserInfo.phNo=phNo.toString()
                doLogin(name.toString())
            }
        }
    }

    private fun doLogin(name:String) {
        if (shp == null)
            shp = getSharedPreferences("myPreferences", MODE_PRIVATE)

        shpEditor = shp.edit()
        shpEditor.putString("name", name)
        shpEditor.commit()
        val intent=Intent(this,MainActivity::class.java)
        startActivity(intent)
    }

    private fun checkLogin() {
        if (shp == null) shp = getSharedPreferences("myPreferences", MODE_PRIVATE)

        val userName: String? = shp.getString("name", "")

        if (userName != null && userName != "") {
            val i = Intent(this@Login, MainActivity::class.java)
            startActivity(i)
            finish()
        }
    }
}