package com.misri.weatherapp_demo.data.network

import DEFAULT_WEATHER_DESTINATION
import com.misri.weatherapp_demo.BuildConfig
import com.misri.weatherapp_demo.data.model.WeatherResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {
    @GET("weather")
    suspend fun getWeather(
        @Query("appid") key: String = BuildConfig.API_KEY,
        @Query("q") city: String = DEFAULT_WEATHER_DESTINATION,
    ): WeatherResponse
}