package com.example.mainpage.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.mainpage.R
import com.example.mainpage.databinding.QueryLayoutBinding

class Query : AppCompatActivity() {

    private var _binding : QueryLayoutBinding? = null
   // private lateinit var search : EditText


    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.query_layout)

    }

    }


