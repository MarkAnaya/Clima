package com.example.clima.core

import android.util.Log
import com.example.clima.model.WeatherData

class WeatherRepository {
    private  val retrofit = RetrofitInstance.getRetrofit().create(WeatherAPI::class.java)

    suspend fun fetchWeatherInfo (coordinates: String): WeatherData?{
        val response = retrofit.getWeatherInfo("", coordinates)
        Log.i("RESPONSE", response.body().toString())

        return response.body()
    }
}