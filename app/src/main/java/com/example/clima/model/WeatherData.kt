package com.example.clima.model

data class WeatherData(
    val location: Location,
    val current: Current
)

data class Current(
    @serializedname("temp_c") val temp: Int,
    val condition: Condition,
    @serializedname("is_day") val IsDay: Int,
    val humidity: Int,
    @serializedname("last_updated_epoch") val lastUpdated: String,
    val cloud: Int,
    @serializedname("wind_mph") val windSpeed: String,
    @serializedname("feelslike_c") val feelsLike: Int
)

data class Location(
    val name: String,
    val region: String,
    val country: String,
    @serializedname("localtime") val localtime: String
)

data class Condition(
    val text: String,
    val icon: String
)