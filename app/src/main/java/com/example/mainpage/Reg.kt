package com.example.mainpage

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class Reg : AppCompatActivity() {

    private lateinit var register: Button
    private lateinit var log: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register_layout)


        register = findViewById(R.id.button3)
        log = findViewById(R.id.button4)

        val intent1 = Intent(this, Lol::class.java)



        register.setOnClickListener {

            startActivity(intent1)
        }


        log.setOnClickListener{
            startActivity(intent1)
        }
    }
}



