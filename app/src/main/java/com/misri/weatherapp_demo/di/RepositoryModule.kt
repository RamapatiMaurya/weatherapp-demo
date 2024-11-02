package com.misri.weatherapp_demo.di

import com.misri.weatherapp_demo.data.network.WeatherApi
import com.misri.weatherapp_demo.data.repository.DefaultWeatherRepository
import com.misri.weatherapp_demo.data.repository.WeatherRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideRepository(weatherApi: WeatherApi): WeatherRepository =
        DefaultWeatherRepository(weatherApi)
}