package com.example.workshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_movies_list)
        findViewById<CardView>(R.id.card).setOnClickListener {
                startActivity(Intent(this, FragmentDetailsActivity::class.java))
        }
    }
}