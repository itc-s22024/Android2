package jp.ac.it_college.std.s22024.weather_report

import androidx.recyclerview.widget.RecyclerView
import java.util.PrimitiveIterator

class CityAdapter(
    private val data: List<CityData>,
    private val callback: (CityData) -> Unit
) : RecyclerView.Adapter<CityAdapter.ViewHolder>() {
    class ViewHolder()
}