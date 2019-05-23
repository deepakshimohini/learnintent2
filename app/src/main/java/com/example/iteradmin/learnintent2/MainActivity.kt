package com.example.iteradmin.learnintent2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editText = findViewById<EditText>(R.id.edittext)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val s:String= edittext.text.toString()
            val i =Intent(applicationContext,Main2Activity::class.java)
            i.putExtra("name",s)
            startActivity(i)
        }



    }
}
