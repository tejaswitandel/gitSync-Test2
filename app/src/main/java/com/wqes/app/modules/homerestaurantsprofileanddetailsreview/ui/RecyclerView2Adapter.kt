package com.wqes.app.modules.homerestaurantsprofileanddetailsreview.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wqes.app.R
import com.wqes.app.databinding.RowHomeRestaurantsProfileAndDetailsReview2Binding
import com.wqes.app.modules.homerestaurantsprofileanddetailsreview.`data`.model.HomeRestaurantsProfileAndDetailsReview2RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerView2Adapter(
  public val list: List<HomeRestaurantsProfileAndDetailsReview2RowModel>
) : RecyclerView.Adapter<RecyclerView2Adapter.RowHomeRestaurantsProfileAndDetailsReview2VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowHomeRestaurantsProfileAndDetailsReview2VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_home_restaurants_profile_and_details_review2,parent,false)
    return RowHomeRestaurantsProfileAndDetailsReview2VH(view)
  }

  public override fun onBindViewHolder(holder: RowHomeRestaurantsProfileAndDetailsReview2VH,
      position: Int): Unit {
    val homeRestaurantsProfileAndDetailsReview2RowModel =
        HomeRestaurantsProfileAndDetailsReview2RowModel()
    // TODO uncomment following line after integration with data source
    // val homeRestaurantsProfileAndDetailsReview2RowModel = list[position]
    holder.binding.homeRestaurantsProfileAndDetailsReview2RowModel =
        homeRestaurantsProfileAndDetailsReview2RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: HomeRestaurantsProfileAndDetailsReview2RowModel
    ): Unit {
    }
  }

  public inner class RowHomeRestaurantsProfileAndDetailsReview2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowHomeRestaurantsProfileAndDetailsReview2Binding =
        RowHomeRestaurantsProfileAndDetailsReview2Binding.bind(itemView)
  }
}
