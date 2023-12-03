package jp.ac.it_college.std.s22024.weather_report_compose.cityselect

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import jp.ac.it_college.std.s22024.weather_report_compose.CityData
import jp.ac.it_college.std.s22024.weather_report_compose.citylist
import jp.ac.it_college.std.s22024.weather_report_compose.ui.theme.WeatherReportComposeTheme

@Composable
fun CityName(modifier: Modifier = Modifier, onCityselect: (String) -> Unit = {}) {
    val scope = rememberCoroutineScope()
    Surface(modifier) {
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .fillMaxSize()
        ) {
            Text(text = "")
            citylist.forEach{ CityData ->
                Button(
                    onClick = { onCityselect(CityData.cityid) },
                    modifier = Modifier
                        .padding(4.dp)
                ) {
                    Text(text = CityData.name)
                }
            }
        }
    }
}

@Preview(showBackground = true, widthDp = 320)
@Composable
fun CityNamePreview() {
    WeatherReportComposeTheme {
        CityName()
    }
}