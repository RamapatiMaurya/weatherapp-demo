package com.misri.weatherapp_demo.ui.weather

import app.cash.turbine.test
import com.misri.weatherapp_demo.data.repository.FakeWeatherRepository
import com.misri.weatherapp_demo.data.repository.FakeWeatherRepository.fakeWeatherResponse
import com.misri.weatherapp_demo.data.repository.WeatherRepository
import com.misri.weatherapp_demo.ui.MainDispatcherRule
import kotlinx.coroutines.test.runTest
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class WeatherViewModelTest{

    @get:Rule
    val mainDispatchRule = MainDispatcherRule()

    private lateinit var viewModel: WeatherViewModel

    private val weatherRepository: WeatherRepository = FakeWeatherRepository

    @Before
    fun setUp() {
        viewModel = WeatherViewModel(weatherRepository)
    }

    @Test
    fun `when getWeather complete, it will emit success rate`() = runTest {
        viewModel.uiState.test {
            assertEquals(WeatherUiState(weatherResponse = fakeWeatherResponse), awaitItem())
        }
    }
}