package com.example.pushpender

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun click(view: android.view.View) {
        val ed1 = findViewById<EditText>(R.id.ed1)
        if(ed1.text.toString().isEmpty()){
            Toast.makeText(this,"Fill it", Toast.LENGTH_SHORT).show()
        }
        else {
            Snackbar.make(view, "Done successfully", Snackbar.LENGTH_SHORT).show()
        }
    }
}
