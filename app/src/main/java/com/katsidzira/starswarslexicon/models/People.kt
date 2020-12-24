package com.katsidzira.starswarslexicon.models

import com.google.gson.annotations.SerializedName

data class People (
    val name: String,

    @SerializedName("birth_year")
    val birthYear: String,

    val gender: String,

    @SerializedName("hair_color")
    val hairColor: String,

    val height: String,

    @SerializedName("homeworld")
    val homeWorldUrl: String,

    val mass: String,

    @SerializedName("skin_color")
    val skinColor: String,

    val created: String,
    val edited: String,
    val url: String,

    @SerializedName("films")
    val filmsUrls: List<String>,

    @SerializedName("species")
    val speciesUrls: List<String>,

    @SerializedName("starships")
    val starshipsUrls: List<String>,

    @SerializedName("vehicles")
    val vehiclesUrls: List<String>

)