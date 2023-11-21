package com.example.mainpage.ui.slideshow

import android.app.AlertDialog
import android.app.Dialog
import android.content.Intent

import android.os.Bundle
import androidx.fragment.app.DialogFragment

import androidx.core.app.ActivityCompat.finishAffinity
import com.example.mainpage.Lol
import com.example.mainpage.MainActivity
import kotlin.system.exitProcess

class exitprompt : DialogFragment() {
    private val MSG= "AbortShip"
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(requireActivity())
        builder.setTitle("Confirmation")
            .setMessage("Are you sure you want to exit?")
            .setPositiveButton("Yes") { dialog, which ->
                exitProcess(0)
                val exitpack= Intent(requireContext(), Lol::class.java)
                startActivity(exitpack)
                exitpack.putExtra("alert","exitNow")
            }
            .setNegativeButton("No") { dialog, which ->
                // Handle the negative button click (e.g., cancel the action)
            }


    return builder.create()
    }



}