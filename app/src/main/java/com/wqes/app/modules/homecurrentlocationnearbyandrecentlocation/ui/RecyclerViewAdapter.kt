package com.wqes.app.modules.homecurrentlocationnearbyandrecentlocation.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wqes.app.R
import com.wqes.app.databinding.RowHomeCurrentLocationNearbyAndRecentLocationBinding
import com.wqes.app.modules.homecurrentlocationnearbyandrecentlocation.`data`.model.HomeCurrentLocationNearbyAndRecentLocationRowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public val list: List<HomeCurrentLocationNearbyAndRecentLocationRowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowHomeCurrentLocationNearbyAndRecentLocationVH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowHomeCurrentLocationNearbyAndRecentLocationVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_home_current_location_nearby_and_recent_location,parent,false)
    return RowHomeCurrentLocationNearbyAndRecentLocationVH(view)
  }

  public override fun onBindViewHolder(holder: RowHomeCurrentLocationNearbyAndRecentLocationVH,
      position: Int): Unit {
    val homeCurrentLocationNearbyAndRecentLocationRowModel =
        HomeCurrentLocationNearbyAndRecentLocationRowModel()
    // TODO uncomment following line after integration with data source
    // val homeCurrentLocationNearbyAndRecentLocationRowModel = list[position]
    holder.binding.homeCurrentLocationNearbyAndRecentLocationRowModel =
        homeCurrentLocationNearbyAndRecentLocationRowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: HomeCurrentLocationNearbyAndRecentLocationRowModel
    ): Unit {
    }
  }

  public inner class RowHomeCurrentLocationNearbyAndRecentLocationVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowHomeCurrentLocationNearbyAndRecentLocationBinding =
        RowHomeCurrentLocationNearbyAndRecentLocationBinding.bind(itemView)
  }
}
