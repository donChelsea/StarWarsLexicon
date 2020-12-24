package com.katsidzira.starswarslexicon.network

import com.katsidzira.starswarslexicon.models.*
import retrofit2.Call
import retrofit2.http.GET

interface StarWarsApi {
    @GET("people/")
    fun getAllPeople(): Call<ResponseResult<People>>

    @GET("films/")
    fun getAllFilms(): Call<ResponseResult<Film>>

    @GET("starships/")
    fun getAllStarships(): Call<ResponseResult<Starship>>

    @GET("vehicles/")
    fun getAllVehicles(): Call<ResponseResult<Vehicle>>

    @GET("species/")
    fun getAllSpecies(): Call<ResponseResult<Species>>

    @GET("planets/")
    fun getAllPlanets(): Call<ResponseResult<Planet>>
}