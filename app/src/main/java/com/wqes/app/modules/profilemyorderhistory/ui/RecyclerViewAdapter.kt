package com.wqes.app.modules.profilemyorderhistory.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wqes.app.R
import com.wqes.app.databinding.RowProfileMyOrderHistoryBinding
import com.wqes.app.modules.profilemyorderhistory.`data`.model.ProfileMyOrderHistoryRowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public val list: List<ProfileMyOrderHistoryRowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowProfileMyOrderHistoryVH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowProfileMyOrderHistoryVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_profile_my_order_history,parent,false)
    return RowProfileMyOrderHistoryVH(view)
  }

  public override fun onBindViewHolder(holder: RowProfileMyOrderHistoryVH, position: Int): Unit {
    val profileMyOrderHistoryRowModel = ProfileMyOrderHistoryRowModel()
    // TODO uncomment following line after integration with data source
    // val profileMyOrderHistoryRowModel = list[position]
    holder.binding.profileMyOrderHistoryRowModel = profileMyOrderHistoryRowModel
  }

  public override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: ProfileMyOrderHistoryRowModel
    ): Unit {
    }
  }

  public inner class RowProfileMyOrderHistoryVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowProfileMyOrderHistoryBinding =
        RowProfileMyOrderHistoryBinding.bind(itemView)
  }
}
