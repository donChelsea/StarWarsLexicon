package com.katsidzira.starswarslexicon.people

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.katsidzira.starswarslexicon.models.People
import com.katsidzira.starswarslexicon.network.ResponseResult
import com.katsidzira.starswarslexicon.network.StarWarsService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PeopleViewModel: ViewModel() {
    private val starWarsService = StarWarsService()

    private val _peopleList by lazy { MutableLiveData<List<People>>() }
    val peopleList: LiveData<List<People>>
        get() = _peopleList

    fun getPeople() {
        starWarsService.fetchPeople().enqueue(object : Callback<ResponseResult<People>> {
            override fun onResponse(
                call: Call<ResponseResult<People>>,
                response: Response<ResponseResult<People>>
            ) {
                _peopleList.value = response.body()?.results
                Log.d("PeopleViewModel","people: ${response.body()?.results}")
            }

            override fun onFailure(call: Call<ResponseResult<People>>, t: Throwable) {
                Log.d("PeopleViewModel","error: ${t.message}")
            }
        })
    }

}