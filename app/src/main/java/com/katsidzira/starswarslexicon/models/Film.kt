package com.katsidzira.starswarslexicon.models

import com.google.gson.annotations.SerializedName

data class Film (
    val title: String,

    @SerializedName("episode_id")
    val episodeId: Int,

    @SerializedName("opening_crawl")
    val openingCrawl: String,

    val director: String,
    val producer: String,
    val url: String,
    val created: String,
    val edited: String,

    @SerializedName("species")
    val speciesUrls: List<String>,

    @SerializedName("starships")
    val starshipsUrls: List<String>,

    @SerializedName("vehicles")
    val vehiclesUrls: List<String>,

    @SerializedName("planets")
    val planetsUrls: List<String>,

    @SerializedName("characters")
    val charactersUrls: List<String>
)