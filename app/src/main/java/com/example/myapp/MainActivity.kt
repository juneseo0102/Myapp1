package com.example.myapp

import android.app.Activity
import android.os.Bundle
import android.view.Gravity
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val textView = TextView(this).apply {
            text = "Myapp1\n\nKotlin Android"
            textSize = 28f
            gravity = Gravity.CENTER
        }

        setContentView(textView)
    }
}
