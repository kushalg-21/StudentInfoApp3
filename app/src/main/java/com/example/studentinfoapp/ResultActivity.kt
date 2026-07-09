package com.example.studentinfoapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val txtName = findViewById<TextView>(R.id.txtName)
        val txtUSN = findViewById<TextView>(R.id.txtUSN)
        val btnBack = findViewById<Button>(R.id.btnBack)

        val name = intent.getStringExtra("NAME")
        val usn = intent.getStringExtra("USN")

        txtName.text = "Name: $name"
        txtUSN.text = "USN: $usn"

        btnBack.setOnClickListener {
            finish()
        }
    }
}