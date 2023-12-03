package jp.ac.it_college.std.s22024.weather_report_compose

import android.content.Context
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStore
import androidx.navigation.ActivityNavigator
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import jp.ac.it_college.std.s22024.weather_report_compose.api.CityGroup
import jp.ac.it_college.std.s22024.weather_report_compose.cityselect.CityName
import jp.ac.it_college.std.s22024.weather_report_compose.title.TitleScene
import jp.ac.it_college.std.s22024.weather_report_compose.weather_report.WeatherReport
import kotlinx.coroutines.launch

val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "WeatherReportCompose")

object Destinations {
    const val TITLE = "title"
    const val CITYSELECT = "city_select"
    const val WEATHERREPORT = "weather_report"
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun weatherNavigation (
    navController: NavHostController = rememberNavController(),
) {
    val scope = rememberCoroutineScope()
    var titleText by remember { mutableStateOf("") }

    Scaffold (
        topBar = {
            TopAppBar(title = {
                Text(text = titleText)
            })
        }
    ) {
        NavHost(
            navController = navController,
            startDestination = Destinations.TITLE,
            modifier = Modifier.padding(it)
        ) {
            composable(Destinations.TITLE) {
                TitleScene(
                    onTitleClick = {
                        navController.navigate(Destinations.CITYSELECT)
                    }
                )
            }
            composable(Destinations.CITYSELECT) {
                CityName(
                    onCityselect = {
                        navController.navigate(Destinations.WEATHERREPORT)
//                        scope.launch {
//                           titleText =
//                               CityGroup.getWeather("2130037").toString()
//                        }
                    }
                )
            }
            composable(Destinations.WEATHERREPORT) {
                WeatherReport()
            }
        }
    }
}