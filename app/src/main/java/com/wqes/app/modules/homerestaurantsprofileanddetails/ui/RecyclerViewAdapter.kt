package com.wqes.app.modules.homerestaurantsprofileanddetails.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wqes.app.R
import com.wqes.app.databinding.RowHomeRestaurantsProfileAndDetailsBinding
import com.wqes.app.modules.homerestaurantsprofileanddetails.`data`.model.HomeRestaurantsProfileAndDetailsRowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public val list: List<HomeRestaurantsProfileAndDetailsRowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowHomeRestaurantsProfileAndDetailsVH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowHomeRestaurantsProfileAndDetailsVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_home_restaurants_profile_and_details,parent,false)
    return RowHomeRestaurantsProfileAndDetailsVH(view)
  }

  public override fun onBindViewHolder(holder: RowHomeRestaurantsProfileAndDetailsVH,
      position: Int): Unit {
    val homeRestaurantsProfileAndDetailsRowModel = HomeRestaurantsProfileAndDetailsRowModel()
    // TODO uncomment following line after integration with data source
    // val homeRestaurantsProfileAndDetailsRowModel = list[position]
    holder.binding.homeRestaurantsProfileAndDetailsRowModel =
        homeRestaurantsProfileAndDetailsRowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: HomeRestaurantsProfileAndDetailsRowModel
    ): Unit {
    }
  }

  public inner class RowHomeRestaurantsProfileAndDetailsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowHomeRestaurantsProfileAndDetailsBinding =
        RowHomeRestaurantsProfileAndDetailsBinding.bind(itemView)
  }
}
