package com.katsidzira.starswarslexicon.network

import com.katsidzira.starswarslexicon.models.Vehicle

data class VehicleResult(
    val count: Int,
    val next: String,
    val previous: Any,
    val results: List<Vehicle>
)