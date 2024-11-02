package com.misri.weatherapp_demo.data.repository

import com.misri.weatherapp_demo.model.Weather
import com.misri.weatherapp_demo.utils.*
import kotlinx.coroutines.flow.Flow

interface WeatherRepository {
    fun getWeatherForecast(city: String): Flow<Result<Weather>>
}