package com.katsidzira.starswarslexicon

import android.util.Log
import com.katsidzira.starswarslexicon.models.People
import com.katsidzira.starswarslexicon.models.Planet
import com.katsidzira.starswarslexicon.network.ResponseResult
import com.katsidzira.starswarslexicon.network.StarWarsService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class StarWarsRepository {

    private val starWarsService = StarWarsService()
    var people = mutableListOf<People>()
    var planets = mutableListOf<Planet>()

    fun getAllPeople(): List<People> {
        starWarsService.fetchPeople().enqueue(object : Callback<ResponseResult<People>> {
            override fun onResponse(
                call: Call<ResponseResult<People>>,
                response: Response<ResponseResult<People>>
            ) {
                people = response.body()?.results as MutableList<People>
                Log.d("StarWarsRepository","people: $people")
            }

            override fun onFailure(call: Call<ResponseResult<People>>, t: Throwable) {
                Log.d("StarWarsRepository","error: ${t.message}")
            }
        })
        return people
    }

    fun getAllPlanets(): List<Planet> {
        starWarsService.fetchPlanets().enqueue(object : Callback<ResponseResult<Planet>> {
            override fun onResponse(
                call: Call<ResponseResult<Planet>>,
                response: Response<ResponseResult<Planet>>
            ) {
                planets = response.body()?.results as MutableList<Planet>
                Log.d("StarWarsRepository", "planets: $planets")
            }

            override fun onFailure(call: Call<ResponseResult<Planet>>, t: Throwable) {
                Log.d("StarWarsRepository", "${t.message}")
            }
        })
        return planets
    }
}