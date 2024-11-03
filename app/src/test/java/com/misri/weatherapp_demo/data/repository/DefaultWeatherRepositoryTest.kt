package com.misri.weatherapp_demo.data.repository

import com.misri.weatherapp_demo.data.model.WeatherResponse
import com.misri.weatherapp_demo.data.network.WeatherApi
import com.misri.weatherapp_demo.data.repository.FakeWeatherRepository.fakeWeatherResponse
import io.mockk.coEvery
import io.mockk.mockk
import kotlinx.coroutines.test.runTest
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import com.misri.weatherapp_demo.utils.Result


class DefaultWeatherRepositoryTest{
    private lateinit var repository: DefaultWeatherRepository
    private val weatherApi= mockk<WeatherApi>()

    @Before
    fun setUp(){
        repository = DefaultWeatherRepository(weatherApi)
    }

    @Test
    fun `when getWeather is called, it should emit loading and then success state`() = runTest{
        coEvery { weatherApi.getWeather(any(),any()) } returns fakeWeatherResponse

        val results = mutableListOf<Result<WeatherResponse>>()
        repository.getWeather("Pune").collect{
            x -> results.add(x)
        }
        assertEquals(Result.Loading, results[0])
        assertEquals(Result.Success(fakeWeatherResponse), results[1])
    }

}