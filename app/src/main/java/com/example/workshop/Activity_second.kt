package com.example.workshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Activity_second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val textView: TextView =findViewById(R.id.text_view_2)

        textView.setOnClickListener{toPrevScreen()}
    }

    private fun toPrevScreen() {
        val intent= Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}