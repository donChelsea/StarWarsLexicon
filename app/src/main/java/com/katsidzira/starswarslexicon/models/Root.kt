package com.katsidzira.starswarslexicon.models

import com.google.gson.annotations.SerializedName

data class Root(
    @SerializedName("films")
    val filmsUrl: String,

    @SerializedName("people")
    val peopleUrl: String,

    @SerializedName("planets")
    val planetsUrl: String,

    @SerializedName("species")
    val speciesUrl: String,

    @SerializedName("starships")
    val starshipsUrl: String,

    @SerializedName("vehicles")
    val vehiclesUrl: String
)