package com.wqes.app.modules.homerestaurantsprofileanddetailsreview1.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wqes.app.R
import com.wqes.app.databinding.RowHomeRestaurantsProfileAndDetailsReview3Binding
import com.wqes.app.modules.homerestaurantsprofileanddetailsreview1.`data`.model.HomeRestaurantsProfileAndDetailsReview3RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerView2Adapter(
  public val list: List<HomeRestaurantsProfileAndDetailsReview3RowModel>
) : RecyclerView.Adapter<RecyclerView2Adapter.RowHomeRestaurantsProfileAndDetailsReview3VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowHomeRestaurantsProfileAndDetailsReview3VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_home_restaurants_profile_and_details_review_3,parent,false)
    return RowHomeRestaurantsProfileAndDetailsReview3VH(view)
  }

  public override fun onBindViewHolder(holder: RowHomeRestaurantsProfileAndDetailsReview3VH,
      position: Int): Unit {
    val homeRestaurantsProfileAndDetailsReview3RowModel =
        HomeRestaurantsProfileAndDetailsReview3RowModel()
    // TODO uncomment following line after integration with data source
    // val homeRestaurantsProfileAndDetailsReview3RowModel = list[position]
    holder.binding.homeRestaurantsProfileAndDetailsReview3RowModel =
        homeRestaurantsProfileAndDetailsReview3RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: HomeRestaurantsProfileAndDetailsReview3RowModel
    ): Unit {
    }
  }

  public inner class RowHomeRestaurantsProfileAndDetailsReview3VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowHomeRestaurantsProfileAndDetailsReview3Binding =
        RowHomeRestaurantsProfileAndDetailsReview3Binding.bind(itemView)
  }
}
