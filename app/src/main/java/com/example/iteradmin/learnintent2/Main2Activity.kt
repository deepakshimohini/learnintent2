package com.example.iteradmin.learnintent2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val text = findViewById<TextView>(R.id.edittext)
        val button = findViewById<Button>(R.id.button2)
        button.setOnClickListener {
            val s: String = edittext.text.toString()
            val i = intent
            text.setText(i.getStringExtra("name"))
            button.setOnClickListener {
                finish()
            }

        }
    }}
