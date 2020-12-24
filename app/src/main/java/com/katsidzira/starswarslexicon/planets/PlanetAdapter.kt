package com.katsidzira.starswarslexicon.planets

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.katsidzira.starswarslexicon.databinding.ListViewPlanetsBinding
import com.katsidzira.starswarslexicon.models.Planet

class PlanetAdapter(private val planetList: List<Planet>): RecyclerView.Adapter<PlanetAdapter.PlanetViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlanetViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ListViewPlanetsBinding.inflate(layoutInflater)
        return PlanetViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PlanetViewHolder, position: Int) {
        holder.onBind(planetList[position])
    }

    override fun getItemCount() = planetList.size

    class PlanetViewHolder(private val binding: ListViewPlanetsBinding) : RecyclerView.ViewHolder(binding.root) {

        fun onBind(planet: Planet) {
            binding.planet = planet
        }
    }
}

