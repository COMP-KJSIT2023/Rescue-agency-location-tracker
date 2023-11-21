package com.example.mainpage.ui.gallery

import android.app.AlertDialog
import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import com.example.mainpage.Lol
import com.example.mainpage.MainActivity

class logprompt : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(requireActivity())
        builder.setTitle("Confirmation")
            .setMessage("Are you sure you want to log out?")
            .setPositiveButton("Yes") { dialog, which ->
                val intent = Intent(requireContext(), Lol::class.java)
                startActivity(intent)

            }
            .setNegativeButton("No") { dialog, which ->
                val intent1 =Intent(requireContext(),MainActivity::class.java)
                startActivity(intent1)
            }

        return builder.create()
    }



}