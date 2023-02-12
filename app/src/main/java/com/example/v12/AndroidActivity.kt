package com.example.v12

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AndroidActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android)

        val button1 = findViewById<Button>(R.id.btnLearnMore)
        button1.setOnClickListener {
            val webIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/"))
            startActivity(webIntent)
        }
    }
}