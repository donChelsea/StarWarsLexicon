package com.katsidzira.starswarslexicon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private lateinit var vehicleViewModel: VehicleViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vehicleViewModel = ViewModelProvider(this).get(VehicleViewModel::class.java)

        vehicleViewModel.getVehicles()

        vehicleViewModel.vehicleList.observe(this, Observer {
            Log.d("MainActivity", "list: $it")
        })

    }
}