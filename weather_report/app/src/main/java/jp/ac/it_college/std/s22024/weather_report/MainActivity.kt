package jp.ac.it_college.std.s22024.weather_report

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMaininding.inf
        setContentView(R.layout.activity_main)
    }
}