package com.katsidzira.starswarslexicon.network

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class StarWarsService {

    fun fetchVehicles(): Call<VehicleResult> {
        return starWarsApi.getAllVehicles()
    }

    companion object {
        val BASE_URL = "https://swapi.dev/api/"

        val starWarsApi = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(StarWarsApi::class.java)
    }
}
