package com.example.androidlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val buttonBack = findViewById<Button>(R.id.buttonBack)
        buttonBack.setOnClickListener { view ->
            finish()
        }
    }
}