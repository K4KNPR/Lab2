package com.example.lab2

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun button1_onClick(view: View) {
        val activity2 = Intent(this, Activity2::class.java)
        startActivity(activity2)
    }
    fun button2_onClick(view: View) {
        val activity3 = Intent(this, Activity3::class.java)
        startActivity(activity3)
    }
    fun button3_onClick(view: View) {
        val activity4 = Intent(this, Activity4::class.java)
        startActivity(activity4)
    }
    fun button4_onClick(view: View) {
        finish()
    }

}