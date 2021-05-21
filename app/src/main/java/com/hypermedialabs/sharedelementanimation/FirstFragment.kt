package com.hypermedialabs.sharedelementanimation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import com.hypermedialabs.sharedelementanimation.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    lateinit var binding:FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentFirstBinding.inflate(inflater,container,false)
        binding.input.setOnClickListener {
            val extras = FragmentNavigatorExtras(binding.input to "input_two",binding.imgae to "image")
            findNavController().navigate(
                R.id.action_firstFragment_to_secondFragment,
                null,
                null,
                extras
            )
        }
        return binding.root
    }

}