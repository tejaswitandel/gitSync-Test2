package com.wqes.app.modules.homecurrentlocationnearbyandrecentlocation.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wqes.app.R
import com.wqes.app.databinding.RowHomeCurrentLocationNearbyAndRecentLocation1Binding
import com.wqes.app.modules.homecurrentlocationnearbyandrecentlocation.`data`.model.HomeCurrentLocationNearbyAndRecentLocation1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerView1Adapter(
  public val list: List<HomeCurrentLocationNearbyAndRecentLocation1RowModel>
) : RecyclerView.Adapter<RecyclerView1Adapter.RowHomeCurrentLocationNearbyAndRecentLocation1VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowHomeCurrentLocationNearbyAndRecentLocation1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_home_current_location_nearby_and_recent_location1,parent,false)
    return RowHomeCurrentLocationNearbyAndRecentLocation1VH(view)
  }

  public override fun onBindViewHolder(holder: RowHomeCurrentLocationNearbyAndRecentLocation1VH,
      position: Int): Unit {
    val homeCurrentLocationNearbyAndRecentLocation1RowModel =
        HomeCurrentLocationNearbyAndRecentLocation1RowModel()
    // TODO uncomment following line after integration with data source
    // val homeCurrentLocationNearbyAndRecentLocation1RowModel = list[position]
    holder.binding.homeCurrentLocationNearbyAndRecentLocation1RowModel =
        homeCurrentLocationNearbyAndRecentLocation1RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: HomeCurrentLocationNearbyAndRecentLocation1RowModel
    ): Unit {
    }
  }

  public inner class RowHomeCurrentLocationNearbyAndRecentLocation1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowHomeCurrentLocationNearbyAndRecentLocation1Binding =
        RowHomeCurrentLocationNearbyAndRecentLocation1Binding.bind(itemView)
  }
}
