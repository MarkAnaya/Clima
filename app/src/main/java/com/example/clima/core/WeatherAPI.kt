package com.example.clima.core

import com.example.clima.model.WeatherData
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherAPI {
    @GET("v1/current.json")
        suspend fun getWeatherInfo(
            @Query("key") apiKey: String,
            @Query("q") coordinates: String
        ): Response<WeatherData>

}