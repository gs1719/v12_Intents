package com.example.v12

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.StrictMode
import android.os.StrictMode.VmPolicy
import android.widget.Button
import android.widget.Toast
import androidx.annotation.RequiresApi

class OptionActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.S)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_option)
        onClickBtn()
        //Added strict mode to detect unsafe Intent call prevents from intent loop etc
        StrictMode.setVmPolicy(VmPolicy.Builder()
            .detectUnsafeIntentLaunch()
            .build())
    }

    fun onClickBtn()
    {
        val supportButton = findViewById<Button>(R.id.btnSupport)
        val androidDevButton = findViewById<Button>(R.id.button2)
        val webDevButton = findViewById<Button>(R.id.button3)
        val mlButton = findViewById<Button>(R.id.button4)
        val blockchainButton = findViewById<Button>(R.id.button5)

        supportButton.setOnClickListener {
            val callIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+"93011122334"))

//            val callIntent1 = Intent().apply {
//                action = Intent.ACTION_DIAL
//                putExtra(toUri())Uri.parse("tel:"+"930744792")
//            }

            try {
                startActivity(callIntent)
            }catch (e: ActivityNotFoundException){
                Toast.makeText(applicationContext, "Page Not Found", Toast.LENGTH_SHORT).show()
            }
        }

        androidDevButton.setOnClickListener {
            val androidIntent = Intent(this,AndroidActivity::class.java)

            try {
                startActivity(androidIntent)
            }catch (e: ActivityNotFoundException){
                Toast.makeText(applicationContext, "Page Not Found", Toast.LENGTH_SHORT).show()
            }
        }

        webDevButton.setOnClickListener {
            val webdevIntent = Intent(this,WebdevActivity::class.java)
            try {
                startActivity(webdevIntent)
            }catch (e: ActivityNotFoundException){
                Toast.makeText(applicationContext, "Page Not Found", Toast.LENGTH_SHORT).show()
            }
        }
        mlButton.setOnClickListener {
            val mlIntent = Intent(this,MLActivity::class.java)
            try {
                startActivity(mlIntent)
            }catch (e: ActivityNotFoundException){
                Toast.makeText(applicationContext, "Page Not Found", Toast.LENGTH_SHORT).show()
            }
        }

        blockchainButton.setOnClickListener {
            val blockIntent = Intent(this,BlockChainActvity::class.java)
            try {
                startActivity(blockIntent)
            }catch (e: ActivityNotFoundException){
                Toast.makeText(applicationContext, "Page Not Found", Toast.LENGTH_SHORT).show()
            }
        }
    }

}