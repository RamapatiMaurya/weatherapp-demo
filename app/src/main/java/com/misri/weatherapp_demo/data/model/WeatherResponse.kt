package com.misri.weatherapp_demo.data.model

import com.google.gson.annotations.SerializedName


data class WeatherResponse (
    @SerializedName("coord") val location: Coordinate,
    @SerializedName("weather") val weatherDatas: List<WeatherData>,
    @SerializedName("base") val base: String,
    @SerializedName("main") val main: Main,
    @SerializedName("visibility") val visibility: String,
    @SerializedName("wind") val wind: Wind,
    @SerializedName("clouds") val clouds: Cloud,
    @SerializedName("dt") val datetime: Long,
    @SerializedName("sys") val sunInfo: SunInfo,
    @SerializedName("timezone") val timezone: Int,
    @SerializedName("id") val id: Int,
    @SerializedName("name") val city: String,
    @SerializedName("cod") val cod: Int

)

data class Coordinate (
    val lon: Double,
    val lat: Double
)

data class WeatherData(
    val id: Int,
    val main: String,
    val description: String,
    val icon: String
)

data class Main(
    val temp: Double,
    val feel_like: Double,
    val temp_min: Double,
    val temp_max: Double,
    val pressure: Int,
    val humidity: Int,
    val sea_level: Int,
    val grnd_level: Int
)

data class Wind (
    val speed: Double,
    val deg: Double
)
data class Cloud(
    val all: Int
)
data class SunInfo(
    val type: Int,
    val id: Int,
    val country: String,
    val sunrise: Long,
    val sunset: Long
)