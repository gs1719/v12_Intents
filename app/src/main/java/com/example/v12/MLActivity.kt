package com.example.v12

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MLActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mlactivity)

        val button1 = findViewById<Button>(R.id.btnLearnMore3)
        button1.setOnClickListener {
            val web = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ibm.com/topics/machine-learning"))
            startActivity(web)
        }
    }
}