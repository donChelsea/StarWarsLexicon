package com.katsidzira.starswarslexicon.models

import com.google.gson.annotations.SerializedName

data class Species (
    val name: String,
    val classification: String,
    val designation: String,

    @SerializedName("average_height")
    val averageHeight: String,

    @SerializedName("average_lifespan")
    val averageLifespan: String,

    @SerializedName("eye_colors")
    val eyeColors: String,

    @SerializedName("hair_colors")
    val hairColors: String,

    @SerializedName("skin_colors")
    val skinColors: String,

    @SerializedName("homeworld")
    val homeWorld: String,

    val language: String,
    val created: String,
    val edited: String,
    val url: String,

    @SerializedName("people")
    val peopleUrls: List<String>,

    @SerializedName("films")
    val filmsUrls: List<String>
)