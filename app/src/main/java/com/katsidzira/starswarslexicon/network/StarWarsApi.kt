package com.katsidzira.starswarslexicon.network

import com.katsidzira.starswarslexicon.models.*
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.Callback
import retrofit2.http.Path
import retrofit2.http.Query

interface StarWarsApi {
    @GET("")
    fun getRootUrls(callback: Callback<Root>)

    @GET("people/")
    fun getAllPeople(
        @Query("page") page: Int,
        callback: Callback<SWModelList<People>>
    )

    @GET("people/{id}/")
    fun getPeople(
        @Path("id") peopleId: Int,
        callback: Callback<People>
    )

    @GET("films/")
    fun getAllFilms(
        @Query("page") page: Int,
        callback: Callback<SWModelList<Film>>
    )

    @GET("films/{id}/")
    fun getFilm(
        @Path("id") filmId: Int,
        callback: Callback<Film>
    )

    @GET("starships")
    fun getAllStarships(
        @Query("page") page: Int,
        callback: Callback<SWModelList<Starship>>
    )

    @GET("starships/{id}/")
    fun getStarship(
        @Path("id") starshipId: Int,
        callback: Callback<Starship>
    )

    @GET("vehicles/")
    fun getAllVehicles(): Call<VehicleResult>

    @GET("vehicles/{id}/")
    fun getVehicle(
        @Path("id") vehicleId: Int,
        callback: Callback<Vehicle>
    )

    @GET("species/")
    fun getAllSpecies(
        @Query("page") page: Int,
        callback: Callback<SWModelList<Species>>
    )

    @GET("species/{id}/")
    fun getSpecies(
        @Path("id") speciesId: Int,
        callback: Callback<Species>
    )

    @GET("planets/")
    fun getAllPlanets(
        @Query("page") page: Int,
        callback: Callback<SWModelList<Planet>>
    )

    @GET("planets/{id}/")
    fun getPlanet(
        @Path("id") planetId: Int,
        callback: Callback<Planet>
    )
}