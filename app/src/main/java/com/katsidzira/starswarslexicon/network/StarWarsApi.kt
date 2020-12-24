package com.katsidzira.starswarslexicon.network

import com.katsidzira.starswarslexicon.models.*
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface StarWarsApi {
    @GET("people/")
    fun getAllPeople(): Call<ResponseResult<People>>

    @GET("people/{id}/")
    fun getPeople(@Path("id") peopleId: Int): Call<People>

    @GET("films/")
    fun getAllFilms(): Call<ResponseResult<Film>>

    @GET("films/{id}/")
    fun getFilm(@Path("id") filmId: Int): Call<Film>

    @GET("starships/")
    fun getAllStarships(): Call<ResponseResult<Starship>>

    @GET("starships/{id}/")
    fun getStarship(@Path("id") starshipId: Int): Call<Starship>

    @GET("vehicles/")
    fun getAllVehicles(): Call<ResponseResult<Vehicle>>

    @GET("vehicles/{id}/")
    fun getVehicle(@Path("id") vehicleId: Int): Call<Vehicle>

    @GET("species/")
    fun getAllSpecies(): Call<ResponseResult<Species>>

    @GET("species/{id}/")
    fun getSpecies(
        @Path("id") speciesId: Int
    ): Call<Species>

    @GET("planets/")
    fun getAllPlanets(): Call<ResponseResult<Planet>>

    @GET("planets/{id}/")
    fun getPlanet(
        @Path("id") planetId: Int
    ): Call<Planet>
}