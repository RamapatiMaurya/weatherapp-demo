package com.misri.weatherapp_demo.data.network

import NUMBER_OF_DAYS
import DEFAULT_WEATHER_DESTINATION
import com.misri.weatherapp_demo.BuildConfig
import com.misri.weatherapp_demo.data.model.ForecastResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {
    @GET("forecast.json")
    suspend fun getWeatherForecast(
        @Query("key") key: String = BuildConfig.API_KEY,
        @Query("q") city: String = DEFAULT_WEATHER_DESTINATION,
        @Query("days") days: Int = NUMBER_OF_DAYS,
    ): ForecastResponse
}