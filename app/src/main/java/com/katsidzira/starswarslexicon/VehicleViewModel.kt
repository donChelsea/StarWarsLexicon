package com.katsidzira.starswarslexicon

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.katsidzira.starswarslexicon.network.ResponseResult
import com.katsidzira.starswarslexicon.models.Vehicle
import com.katsidzira.starswarslexicon.network.StarWarsService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class VehicleViewModel : ViewModel() {

    private val starWarsService = StarWarsService()

    private val _vehicleList by lazy { MutableLiveData<List<Vehicle>>() }
    val vehicleList: LiveData<List<Vehicle>>
        get() = _vehicleList

    fun getVehicles() {
        starWarsService.fetchVehicles().enqueue(object : Callback<ResponseResult<Vehicle>> {
            override fun onResponse(
                call: Call<ResponseResult<Vehicle>>,
                response: Response<ResponseResult<Vehicle>>
            ) {
                _vehicleList.value = response.body()?.results
                Log.d("VehicleViewModel","vehicles: ${response.body()?.results?.get(0)?.name}")
            }

            override fun onFailure(call: Call<ResponseResult<Vehicle>>, t: Throwable) {
                Log.d("VehicleViewModel","error: ${t.message}")
            }
        })
    }
}