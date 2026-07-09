package com.example.studentinfoapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class StudentListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_list)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewStudents)

        val name = intent.getStringExtra("NAME") ?: ""
        val usn = intent.getStringExtra("USN") ?: ""

        val studentList = mutableListOf<Student>()

        if (name.isNotEmpty() && usn.isNotEmpty()) {
            studentList.add(Student(name, usn))
        }

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = StudentAdapter(studentList)
    }
}