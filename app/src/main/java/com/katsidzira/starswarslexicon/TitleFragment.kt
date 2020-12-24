package com.katsidzira.starswarslexicon

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.katsidzira.starswarslexicon.databinding.FragmentTitleBinding

class TitleFragment : Fragment() {

    private lateinit var binding: FragmentTitleBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTitleBinding.inflate(inflater)

        binding.tvPeopleRoot.setOnClickListener {
            findNavController().navigate(R.id.action_titleFragment_to_peopleFragment)
        }

        binding.tvPlanetsRoot.setOnClickListener {
            findNavController().navigate(R.id.action_titleFragment_to_planetFragment)
        }

        return binding.root
    }

}