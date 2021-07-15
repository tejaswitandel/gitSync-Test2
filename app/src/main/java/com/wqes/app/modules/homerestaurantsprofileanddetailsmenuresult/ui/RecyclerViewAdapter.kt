package com.wqes.app.modules.homerestaurantsprofileanddetailsmenuresult.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wqes.app.R
import com.wqes.app.databinding.RowHomeRestaurantsProfileAndDetailsMenuResultBinding
import com.wqes.app.modules.homerestaurantsprofileanddetailsmenuresult.`data`.model.HomeRestaurantsProfileAndDetailsMenuResultRowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public val list: List<HomeRestaurantsProfileAndDetailsMenuResultRowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowHomeRestaurantsProfileAndDetailsMenuResultVH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowHomeRestaurantsProfileAndDetailsMenuResultVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_home_restaurants_profile_and_details_menu_result,parent,false)
    return RowHomeRestaurantsProfileAndDetailsMenuResultVH(view)
  }

  public override fun onBindViewHolder(holder: RowHomeRestaurantsProfileAndDetailsMenuResultVH,
      position: Int): Unit {
    val homeRestaurantsProfileAndDetailsMenuResultRowModel =
        HomeRestaurantsProfileAndDetailsMenuResultRowModel()
    // TODO uncomment following line after integration with data source
    // val homeRestaurantsProfileAndDetailsMenuResultRowModel = list[position]
    holder.binding.homeRestaurantsProfileAndDetailsMenuResultRowModel =
        homeRestaurantsProfileAndDetailsMenuResultRowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: HomeRestaurantsProfileAndDetailsMenuResultRowModel
    ): Unit {
    }
  }

  public inner class RowHomeRestaurantsProfileAndDetailsMenuResultVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowHomeRestaurantsProfileAndDetailsMenuResultBinding =
        RowHomeRestaurantsProfileAndDetailsMenuResultBinding.bind(itemView)
  }
}
