package com.misri.weatherapp_demo.data.repository

import com.misri.weatherapp_demo.data.model.WeatherResponse
import com.misri.weatherapp_demo.utils.*
import kotlinx.coroutines.flow.Flow

interface WeatherRepository {
    fun getWeather(city: String): Flow<Result<WeatherResponse>>
}