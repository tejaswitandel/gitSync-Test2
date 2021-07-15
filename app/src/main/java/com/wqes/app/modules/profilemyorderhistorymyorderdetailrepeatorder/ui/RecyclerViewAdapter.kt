package com.wqes.app.modules.profilemyorderhistorymyorderdetailrepeatorder.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wqes.app.R
import com.wqes.app.databinding.RowProfileMyOrderHistoryMyOrderDetailRepeatOrderBinding
import com.wqes.app.modules.profilemyorderhistorymyorderdetailrepeatorder.`data`.model.ProfileMyOrderHistoryMyOrderDetailRepeatOrderRowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public val list: List<ProfileMyOrderHistoryMyOrderDetailRepeatOrderRowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowProfileMyOrderHistoryMyOrderDetailRepeatOrderVH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowProfileMyOrderHistoryMyOrderDetailRepeatOrderVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_profile_my_order_history_my_order_detail_repeat_order,parent,false)
    return RowProfileMyOrderHistoryMyOrderDetailRepeatOrderVH(view)
  }

  public override fun onBindViewHolder(holder: RowProfileMyOrderHistoryMyOrderDetailRepeatOrderVH,
      position: Int): Unit {
    val profileMyOrderHistoryMyOrderDetailRepeatOrderRowModel =
        ProfileMyOrderHistoryMyOrderDetailRepeatOrderRowModel()
    // TODO uncomment following line after integration with data source
    // val profileMyOrderHistoryMyOrderDetailRepeatOrderRowModel = list[position]
    holder.binding.profileMyOrderHistoryMyOrderDetailRepeatOrderRowModel =
        profileMyOrderHistoryMyOrderDetailRepeatOrderRowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: ProfileMyOrderHistoryMyOrderDetailRepeatOrderRowModel
    ): Unit {
    }
  }

  public inner class RowProfileMyOrderHistoryMyOrderDetailRepeatOrderVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowProfileMyOrderHistoryMyOrderDetailRepeatOrderBinding =
        RowProfileMyOrderHistoryMyOrderDetailRepeatOrderBinding.bind(itemView)
  }
}
