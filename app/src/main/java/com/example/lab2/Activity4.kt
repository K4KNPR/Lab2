package com.example.lab2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Activity4 : AppCompatActivity() {
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_4)
        button = findViewById(R.id.activity_4__button)
    }

    fun onButtonClick(view: View){
        button.setBackgroundColor(Color.GREEN)
    }
}