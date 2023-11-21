package com.example.mainpage


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.mainpage.ui.slideshow.ExitFragment
import kotlin.system.exitProcess


class Lol : AppCompatActivity() {

    private lateinit var userName: EditText
    private lateinit var loginButton: Button
    private lateinit var passWord: EditText
    private lateinit var register: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_layout)


        userName = findViewById(R.id.userIn)
        loginButton = findViewById(R.id.button)
        passWord = findViewById(R.id.passIn)
        register = findViewById(R.id.button2)


        // Set click listener for the Submit button
        loginButton.setOnClickListener {

            val userNt = userName.text.toString()

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


        register.setOnClickListener {
            val intent2 = Intent(this, Reg::class.java)
            startActivity(intent2)

        }
    }
}





