package jp.ac.it_college.std.s22024.weather_report_compose.api

import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.CIO
import io.ktor.client.engine.cio.endpoint
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.get
import io.ktor.client.request.url
import io.ktor.serialization.kotlinx.json.json
import jp.ac.it_college.std.s22024.weather_report_compose.BuildConfig
import kotlinx.serialization.json.Json

object Client {
    private const val BASE_URL = "api.openweathermap.org/data/2.5/forecast?id=1856035"
    private const val API_KEY = BuildConfig.API_KEY

    private val ktor = HttpClient(CIO) {
        engine {
            endpoint {
                connectTimeout = 5000
                requestTimeout = 5000
                socketTimeout = 5000
            }
        }
        install(ContentNegotiation) {
            json(
                Json {
                    ignoreUnknownKeys = true
                    isLenient = true
                }
            )
        }
    }

    suspend fun get(endpoint: String) =
        ktor.get { url("$BASE_URL&appid=$API_KEY") }
}