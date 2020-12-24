package com.katsidzira.starswarslexicon.network

import com.katsidzira.starswarslexicon.models.*
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class StarWarsService {
    fun fetchPeople(): Call<ResponseResult<People>> {
        return starWarsApi.getAllPeople()
    }

    fun fetchFilms(): Call<ResponseResult<Film>> {
        return starWarsApi.getAllFilms()
    }

    fun fetchStarships(): Call<ResponseResult<Starship>> {
        return starWarsApi.getAllStarships()
    }

    fun fetchVehicles(): Call<ResponseResult<Vehicle>> {
        return starWarsApi.getAllVehicles()
    }

    fun fetchSpecies(): Call<ResponseResult<Species>> {
        return starWarsApi.getAllSpecies()
    }

    fun fetchPlanets(): Call<ResponseResult<Planet>> {
        return starWarsApi.getAllPlanets()
    }

    fun fetchSinglePlanet(id: Int): Call<Planet> {
        return starWarsApi.getPlanet(id)
    }

    companion object {
        private const val BASE_URL = "https://swapi.dev/api/"

        private val starWarsApi = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(StarWarsApi::class.java)
    }
}
