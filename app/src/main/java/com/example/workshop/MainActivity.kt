package com.example.workshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView: TextView=findViewById(R.id.text_view_1)

        textView.setOnClickListener{toNextScreen()}
    }
    private fun toNextScreen() {
        val intent=Intent(this,Activity_second::class.java)
        startActivity(intent)
    }
}