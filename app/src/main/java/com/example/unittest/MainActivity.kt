package com.example.unittest

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()

    }

    private fun initView() {
        val etName = findViewById<EditText>(R.id.etName)
        val button = findViewById<Button>(R.id.button)
        etName.setText("Hello")
        button.setOnClickListener {
            //Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, SecondActivity::class.java))
        }
    }
}