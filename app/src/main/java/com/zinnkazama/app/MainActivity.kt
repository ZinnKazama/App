package com.zinnkazama.app

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*
import java.lang.Exception
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var txtDisplay : TextView
    private lateinit var edtInput : EditText
    private lateinit var btn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val hh = findViewById<LinearLayout>(R.id.humanvalue)

        txtDisplay = findViewById(R.id.textViewMainDisplay)
        edtInput = findViewById(R.id.editViewMainInput)
        btn = findViewById(R.id.buttonMain)

        btn.setOnClickListener{
            try {
                var fb0 = 0
                var fb1 = 1
            }
            catch (ex:Exception){
                Toast.makeText(this,"likh bsdk", Toast.LENGTH_SHORT).show()
            }
        }
    }
}