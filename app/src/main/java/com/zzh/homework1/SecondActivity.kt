package com.zzh.homework1

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val tvSec = findViewById<TextView>(R.id.tv_second)
        tvSec.setOnClickListener(){
            finish()
        }
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "SecActivity onResume", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "SecActivity onStop", Toast.LENGTH_SHORT).show()
    }
}