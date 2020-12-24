package com.katsidzira.starswarslexicon.planets

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.katsidzira.starswarslexicon.models.Planet
import com.katsidzira.starswarslexicon.network.ResponseResult
import com.katsidzira.starswarslexicon.network.StarWarsService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PlanetViewModel: ViewModel() {
    private val starWarsService = StarWarsService()

    private val _planetList by lazy { MutableLiveData<List<Planet>>() }
    val planetList: LiveData<List<Planet>>
        get() = _planetList

    fun getPlanets() {
        starWarsService.fetchPlanets().enqueue(object : Callback<ResponseResult<Planet>> {
            override fun onResponse(
                call: Call<ResponseResult<Planet>>,
                response: Response<ResponseResult<Planet>>
            ) {
                _planetList.value = response.body()?.results
            }

            override fun onFailure(call: Call<ResponseResult<Planet>>, t: Throwable) {
                Log.d("PlanetViewModel", "Error: ${t.message}")
            }
        })
    }
}