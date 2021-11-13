package com.example.pushpender

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class question2 : AppCompatActivity(), View.OnClickListener {
    lateinit var checkBox: CheckBox
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question2)


        val name = findViewById<EditText>(R.id.yourname)
        val radio = findViewById<RadioGroup>(R.id.radio)
        val btech = findViewById<RadioButton>(R.id.btech)
        val btechs = findViewById<RadioButton>(R.id.btechs)
        checkBox =findViewById(R.id.checkbox)
        val btn = findViewById<Button>(R.id.btn)
        val email = findViewById<EditText>(R.id.youremail)
        val regno = findViewById<EditText>(R.id.regno)
        val clgnme = findViewById<EditText>(R.id.yourcllg)



        btn.setOnClickListener{

            Toast.makeText(this , "Thank You for taking part in the competition" , Toast.LENGTH_SHORT).show()

            radio.clearCheck()
            name.setText("")
            email.setText("")
            regno.setText("")
            clgnme.setText("")

            if(checkBox.isChecked)
                checkBox.toggle()

        }

        checkBox.setOnClickListener(this)


        // for radio button
        radio.setOnCheckedChangeListener{ _, id ->
            val rb = findViewById<RadioButton>(id)
            when(rb){
                btech->
                    Toast.makeText(this , "Your Degree is Btech" , Toast.LENGTH_SHORT).show()
                btechs->
                    Toast.makeText(this , "Your Degree is Btech with specialization" , Toast.LENGTH_SHORT).show()
            }
        }

    }

    // for checkbox
    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id){
                R.id.checkbox->
                {
                    if(checkBox.isChecked)
                        Toast.makeText(this , "We will send you notifications" , Toast.LENGTH_SHORT).show()
                    else
                        Toast.makeText(this , "From now we will not send you notifications" , Toast.LENGTH_SHORT).show()
                }
            }
        }

    }

}