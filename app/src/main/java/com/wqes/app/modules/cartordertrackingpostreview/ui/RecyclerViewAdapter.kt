package com.wqes.app.modules.cartordertrackingpostreview.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wqes.app.R
import com.wqes.app.databinding.RowCartOrderTrackingPostReviewBinding
import com.wqes.app.modules.cartordertrackingpostreview.`data`.model.CartOrderTrackingPostReviewRowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public val list: List<CartOrderTrackingPostReviewRowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowCartOrderTrackingPostReviewVH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowCartOrderTrackingPostReviewVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_cart_order_tracking_post_review,parent,false)
    return RowCartOrderTrackingPostReviewVH(view)
  }

  public override fun onBindViewHolder(holder: RowCartOrderTrackingPostReviewVH, position: Int):
      Unit {
    val cartOrderTrackingPostReviewRowModel = CartOrderTrackingPostReviewRowModel()
    // TODO uncomment following line after integration with data source
    // val cartOrderTrackingPostReviewRowModel = list[position]
    holder.binding.cartOrderTrackingPostReviewRowModel = cartOrderTrackingPostReviewRowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: CartOrderTrackingPostReviewRowModel
    ): Unit {
    }
  }

  public inner class RowCartOrderTrackingPostReviewVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowCartOrderTrackingPostReviewBinding =
        RowCartOrderTrackingPostReviewBinding.bind(itemView)
  }
}
