package com.example.mainpage.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.mainpage.R
import com.example.mainpage.Reg
import com.example.mainpage.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private lateinit var emmeet : ImageView
    private lateinit var search: Button
    private lateinit var map : ImageView


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        emmeet = binding.Searchview
        map=binding.MapView

        emmeet.setOnClickListener{
            val intent1 = Intent(activity,Query::class.java)
            startActivity(intent1)
        }
        map.setOnClickListener{
            val intent1 = Intent(activity,MapsActivity::class.java)
            startActivity(intent1)
        }




        return root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}


