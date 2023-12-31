package jp.ac.it_college.std.s22024.async_sample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import jp.ac.it_college.std.s22024.asynccoroutinesample.City
import jp.ac.it_college.std.s22024.asynccoroutinesample.cityList
import jp.ac.it_college.std.s22024.asynccoroutinesample.databinding.RowBinding

class CityAdapter(val callback: (City) -> Unit) : RecyclerView.Adapter<CityAdapter.ViewHolder>() {
    class ViewHolder(val binding: RowBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(
            RowBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )

    override fun getItemCount(): Int = cityList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.name.apply {
            text = cityList[position].name
            setOnClickListener {
                callback(cityList[position])
            }
        }
    }
}