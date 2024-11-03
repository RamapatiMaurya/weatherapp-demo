package com.misri.weatherapp_demo.data.repository

import com.misri.weatherapp_demo.data.model.Cloud
import com.misri.weatherapp_demo.data.model.Coordinate
import com.misri.weatherapp_demo.data.model.Main
import com.misri.weatherapp_demo.data.model.SunInfo
import com.misri.weatherapp_demo.data.model.WeatherData
import com.misri.weatherapp_demo.data.model.WeatherResponse
import com.misri.weatherapp_demo.data.model.Wind
import com.misri.weatherapp_demo.utils.Result
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

object FakeWeatherRepository : WeatherRepository {

    override fun getWeather(city: String): Flow<Result<WeatherResponse>> {
        return flow {
            emit(Result.Loading)
            emit(Result.Success(fakeWeatherResponse))
        }
    }

    val fakeWeatherResponse = WeatherResponse(

        location = Coordinate(lon = -0.1257, lat = 51.5085),
        weatherDatas = listOf(
            WeatherData(
                id = 804,
                main = "Clouds",
                description = "overcast clouds",
                icon = "04n"
            )
        ),
        base = "stations",
        main = Main(
            temp = 285.04,
            feel_like = 284.48,
            temp_min = 284.29,
            temp_max = 285.45,
            pressure = 1029,
            humidity = 84,
            sea_level = 1029,
            grnd_level = 1025
        ),
        visibility = "10000",
        wind = Wind(
            speed = 2.06,
            deg = 110.0
        ),
        clouds = Cloud(all = 100), datetime = 1730606643,
        sunInfo = SunInfo(
            type = 2,
            id = 2075535,
            country = "GB",
            sunrise = 1730617083,
            sunset = 1730651400
        ),
        timezone = 0,
        id = 2643743,
        city = "London",
        cod = 200
    )
}