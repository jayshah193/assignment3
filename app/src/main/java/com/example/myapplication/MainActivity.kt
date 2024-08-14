package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var editText: EditText? = null
    private var button: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.editText)
        button = findViewById(R.id.button)

        button?.setOnClickListener { v: View? ->
            val message: String = editText?.text.toString()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("message", message)
            startActivity(intent)
        }
    }
}
