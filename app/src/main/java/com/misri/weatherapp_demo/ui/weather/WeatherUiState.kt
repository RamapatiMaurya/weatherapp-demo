package com.misri.weatherapp_demo.ui.weather

import com.misri.weatherapp_demo.model.Weather

data class WeatherUiState(
    val weather: Weather? = null,
    val isLoading: Boolean = false,
    val errorMessage: String = "",
)