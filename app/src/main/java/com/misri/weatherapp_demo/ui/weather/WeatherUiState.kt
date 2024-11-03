package com.misri.weatherapp_demo.ui.weather

import com.misri.weatherapp_demo.data.model.WeatherResponse

data class WeatherUiState(
    val weatherResponse: WeatherResponse? = null,
    val isLoading: Boolean = false,
    val errorMessage: String = "",
)
