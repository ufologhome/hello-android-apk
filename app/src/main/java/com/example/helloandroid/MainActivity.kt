package com.example.helloandroid

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val text = TextView(this)
        text.text = "Привет! APK собран через GitHub 🚀"
        text.textSize = 20f

        setContentView(text)
    }
}
