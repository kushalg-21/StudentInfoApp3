package com.example.studentinfoapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val etName = findViewById<EditText>(R.id.etName)
        val etUSN = findViewById<EditText>(R.id.etUSN)
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)

        btnSubmit.setOnClickListener {

            val name = etName.text.toString().trim()
            val usn = etUSN.text.toString().trim()

            if (name.isEmpty() || usn.isEmpty()) {
                Toast.makeText(
                    this,
                    "Please enter both Name and USN",
                    Toast.LENGTH_SHORT
                ).show()
            } else {

                val intent = Intent(this, StudentListActivity::class.java)
                intent.putExtra("NAME", name)
                intent.putExtra("USN", usn)
                startActivity(intent)

            }
        }
    }
}