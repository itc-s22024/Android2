package jp.ac.it_college.std.s22024.weather_report_compose.api

import io.ktor.client.call.body
import jp.ac.it_college.std.s22024.weather_report_compose.CityData

object CityGroup {
    suspend fun getWeather(id: String): CityData {
        return Client.get(id).body()
    }
}