package com.wqes.app.modules.homerestaurantsprofileanddetailsreview.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wqes.app.R
import com.wqes.app.databinding.RowHomeRestaurantsProfileAndDetailsReviewBinding
import com.wqes.app.modules.homerestaurantsprofileanddetailsreview.`data`.model.HomeRestaurantsProfileAndDetailsReviewRowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public val list: List<HomeRestaurantsProfileAndDetailsReviewRowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowHomeRestaurantsProfileAndDetailsReviewVH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowHomeRestaurantsProfileAndDetailsReviewVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_home_restaurants_profile_and_details_review,parent,false)
    return RowHomeRestaurantsProfileAndDetailsReviewVH(view)
  }

  public override fun onBindViewHolder(holder: RowHomeRestaurantsProfileAndDetailsReviewVH,
      position: Int): Unit {
    val homeRestaurantsProfileAndDetailsReviewRowModel =
        HomeRestaurantsProfileAndDetailsReviewRowModel()
    // TODO uncomment following line after integration with data source
    // val homeRestaurantsProfileAndDetailsReviewRowModel = list[position]
    holder.binding.homeRestaurantsProfileAndDetailsReviewRowModel =
        homeRestaurantsProfileAndDetailsReviewRowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: HomeRestaurantsProfileAndDetailsReviewRowModel
    ): Unit {
    }
  }

  public inner class RowHomeRestaurantsProfileAndDetailsReviewVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowHomeRestaurantsProfileAndDetailsReviewBinding =
        RowHomeRestaurantsProfileAndDetailsReviewBinding.bind(itemView)
  }
}
