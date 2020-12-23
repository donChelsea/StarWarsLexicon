package com.katsidzira.starswarslexicon.models

import com.google.gson.annotations.SerializedName

data class Starship(
    @SerializedName("starship_class")
    val starshipClass: String,

    @SerializedName("hyperdrive_rating")
    val hyperdriveRating: String,

    @SerializedName("MGLT")
    val mglt: String
)