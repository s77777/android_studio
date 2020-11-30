package com.example.workshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class FragmentDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_movie_details)
        findViewById<TextView>(R.id.back).setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}