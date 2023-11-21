package com.example.mainpage.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.mainpage.databinding.FragmentSlideshowBinding
import com.example.mainpage.ui.gallery.logprompt

class ExitFragment : Fragment() {

    private var _binding: FragmentSlideshowBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val slideshowViewModel =
            ViewModelProvider(this).get(SlideshowViewModel::class.java)

        _binding = FragmentSlideshowBinding.inflate(inflater, container, false)
        val root: View = binding.root

        showConfirmationDialog1()
        return root
    }
    fun showConfirmationDialog1(): Unit {
        val dialogFragment = exitprompt()
        dialogFragment.show(parentFragmentManager, "ConfirmationDialogFragment")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}