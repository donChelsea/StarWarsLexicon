package com.katsidzira.starswarslexicon.models

import com.google.gson.annotations.SerializedName

data class Vehicle(
    val name: String,
    val model: String,

    @SerializedName("vehicle_class")
    val vehicleClass: String,

    val manufacturer: String,

    @SerializedName("cost_in_credits")
    val costInCredits: String,

    val length: String,
    val crew: String,
    val passengers: String,

    @SerializedName("max_atmosphering_speed")
    val maxAtmospheringSpeed: String,

    @SerializedName("cargo_capacity")
    val cargoCapacity: String,

    val consumables: String,
    val created: String,
    val edited: String,
    val url: String,

    @SerializedName("pilots")
    val pilotsUrls: List<String>,

    @SerializedName("films")
    val filmsUrls: List<String>
)