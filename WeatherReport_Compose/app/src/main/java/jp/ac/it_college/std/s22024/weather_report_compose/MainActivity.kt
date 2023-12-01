package jp.ac.it_college.std.s22024.weather_report_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import jp.ac.it_college.std.s22024.weather_report_compose.title.TitleScene
import jp.ac.it_college.std.s22024.weather_report_compose.ui.theme.WeatherReportComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent{
            WeatherReportComposeTheme {
                weatherNavigation()
            }
        }
    }
}