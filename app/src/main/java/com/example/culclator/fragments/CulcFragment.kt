package com.example.culclator.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.culclator.R
import com.example.culclator.databinding.FragmentCulcBinding


class CulcFragment : Fragment() {
    private var _binding : FragmentCulcBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCulcBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button.setOnClickListener{
            val content = binding.edName.text.toString()
            val action = CulcFragmentDirections.actionCulcFragmentToResultFragment(content)
            findNavController().navigate(action)
        }
    }

    override fun onDestroy(){
        super.onDestroy()
        _binding = null
    }
}