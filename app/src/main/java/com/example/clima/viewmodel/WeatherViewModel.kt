package com.example.clima.viewmodel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class WeatherViewModel: ViewModel() {
    private val _weatherinfo = MutableLiveData<String>()
    val weatherinfo: LiveData<String>
        get() = _weatherinfo

}