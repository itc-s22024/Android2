package jp.ac.it_college.std.s22024.weather_report_compose.weather_report

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import jp.ac.it_college.std.s22024.weather_report_compose.R
import jp.ac.it_college.std.s22024.weather_report_compose.ui.theme.WeatherReportComposeTheme

@Composable
fun WeatherReport(modifier: Modifier = Modifier) {
    Surface(modifier) {
        Column {
            Text(text = stringResource(id = R.string.app_name))
        }
    }
}

    @Preview(showBackground = true, widthDp = 320)
@Composable
fun WeatherReportPreview() {
    WeatherReportComposeTheme {
        WeatherReport()
    }
}