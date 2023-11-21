package com.example.mainpage.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.mainpage.databinding.FragmentLogoutBinding


class Logout : Fragment() {

    private var _binding: FragmentLogoutBinding? = null


    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val galleryViewModel =
            ViewModelProvider(this).get(GalleryViewModel::class.java)

        _binding = FragmentLogoutBinding.inflate(inflater, container, false)
        val root: View = binding.root

        showConfirmationDialog()

        return root
    }

    fun showConfirmationDialog(): Unit {
        val dialogFragment = logprompt()
        dialogFragment.show(parentFragmentManager, "ConfirmationDialogFragment")
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
