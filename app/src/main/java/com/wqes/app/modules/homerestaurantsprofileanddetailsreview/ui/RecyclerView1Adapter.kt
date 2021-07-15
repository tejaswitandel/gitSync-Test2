package com.wqes.app.modules.homerestaurantsprofileanddetailsreview.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wqes.app.R
import com.wqes.app.databinding.RowHomeRestaurantsProfileAndDetailsReview1Binding
import com.wqes.app.modules.homerestaurantsprofileanddetailsreview.`data`.model.HomeRestaurantsProfileAndDetailsReview1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerView1Adapter(
  public val list: List<HomeRestaurantsProfileAndDetailsReview1RowModel>
) : RecyclerView.Adapter<RecyclerView1Adapter.RowHomeRestaurantsProfileAndDetailsReview1VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowHomeRestaurantsProfileAndDetailsReview1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_home_restaurants_profile_and_details_review1,parent,false)
    return RowHomeRestaurantsProfileAndDetailsReview1VH(view)
  }

  public override fun onBindViewHolder(holder: RowHomeRestaurantsProfileAndDetailsReview1VH,
      position: Int): Unit {
    val homeRestaurantsProfileAndDetailsReview1RowModel =
        HomeRestaurantsProfileAndDetailsReview1RowModel()
    // TODO uncomment following line after integration with data source
    // val homeRestaurantsProfileAndDetailsReview1RowModel = list[position]
    holder.binding.homeRestaurantsProfileAndDetailsReview1RowModel =
        homeRestaurantsProfileAndDetailsReview1RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: HomeRestaurantsProfileAndDetailsReview1RowModel
    ): Unit {
    }
  }

  public inner class RowHomeRestaurantsProfileAndDetailsReview1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowHomeRestaurantsProfileAndDetailsReview1Binding =
        RowHomeRestaurantsProfileAndDetailsReview1Binding.bind(itemView)
  }
}
