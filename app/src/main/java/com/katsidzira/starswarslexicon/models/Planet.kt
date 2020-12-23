package com.katsidzira.starswarslexicon.models

import com.google.gson.annotations.SerializedName

data class Planet(
    val name: String,
    val diameter: String,
    val gravity: String,
    val population: String,
    val climate: String,
    val terrain: String,
    val created: String,
    val edited: String,
    val url: String,

    @SerializedName("rotation_period")
    val rotationPeriod: String,

    @SerializedName("orbital_period")
    val orbitalPeriod: String,

    @SerializedName("surface_water")
    val surfaceWater: String,

    @SerializedName("residents")
    val residentsUrls: List<String>,

    @SerializedName("films")
    val filmsUrls: List<String>

)