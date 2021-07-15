package com.wqes.app.modules.homerestaurantsprofileanddetails.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wqes.app.R
import com.wqes.app.databinding.RowHomeRestaurantsProfileAndDetails1Binding
import com.wqes.app.modules.homerestaurantsprofileanddetails.`data`.model.HomeRestaurantsProfileAndDetails1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerView1Adapter(
  public val list: List<HomeRestaurantsProfileAndDetails1RowModel>
) : RecyclerView.Adapter<RecyclerView1Adapter.RowHomeRestaurantsProfileAndDetails1VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowHomeRestaurantsProfileAndDetails1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_home_restaurants_profile_and_details1,parent,false)
    return RowHomeRestaurantsProfileAndDetails1VH(view)
  }

  public override fun onBindViewHolder(holder: RowHomeRestaurantsProfileAndDetails1VH,
      position: Int): Unit {
    val homeRestaurantsProfileAndDetails1RowModel = HomeRestaurantsProfileAndDetails1RowModel()
    // TODO uncomment following line after integration with data source
    // val homeRestaurantsProfileAndDetails1RowModel = list[position]
    holder.binding.homeRestaurantsProfileAndDetails1RowModel =
        homeRestaurantsProfileAndDetails1RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: HomeRestaurantsProfileAndDetails1RowModel
    ): Unit {
    }
  }

  public inner class RowHomeRestaurantsProfileAndDetails1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowHomeRestaurantsProfileAndDetails1Binding =
        RowHomeRestaurantsProfileAndDetails1Binding.bind(itemView)
  }
}
