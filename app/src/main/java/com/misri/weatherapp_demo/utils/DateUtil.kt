package com.misri.weatherapp_demo.utils

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

object DateUtil {
    fun convertLongToTime(time: Long): String {
        val date = Date(time)
        val format = SimpleDateFormat( "yyyy.MM.dd HH:mm", Locale.getDefault())
        return format.format(date)
    }

}