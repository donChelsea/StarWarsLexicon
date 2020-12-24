package com.katsidzira.starswarslexicon.planets

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.katsidzira.starswarslexicon.R
import com.katsidzira.starswarslexicon.databinding.FragmentPlanetBinding

class PlanetFragment : Fragment() {

    private lateinit var binding: FragmentPlanetBinding
    private lateinit var model: PlanetViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPlanetBinding.inflate(inflater)

        model = ViewModelProvider(this).get(PlanetViewModel::class.java)

        model.getPlanets()

        model.planetList.observe(viewLifecycleOwner, Observer {
            Log.d("PlanetFragment", "$it")
            binding.rvPlanets.adapter = PlanetAdapter(it)
        })

        return binding.root
    }
}