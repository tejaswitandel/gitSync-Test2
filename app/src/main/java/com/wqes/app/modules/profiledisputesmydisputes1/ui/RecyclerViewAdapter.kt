package com.wqes.app.modules.profiledisputesmydisputes1.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wqes.app.R
import com.wqes.app.databinding.RowProfileDisputesMyDisputes1Binding
import com.wqes.app.modules.profiledisputesmydisputes1.`data`.model.ProfileDisputesMyDisputes1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public val list: List<ProfileDisputesMyDisputes1RowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowProfileDisputesMyDisputes1VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowProfileDisputesMyDisputes1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_profile_disputes_my_disputes_1,parent,false)
    return RowProfileDisputesMyDisputes1VH(view)
  }

  public override fun onBindViewHolder(holder: RowProfileDisputesMyDisputes1VH, position: Int):
      Unit {
    val profileDisputesMyDisputes1RowModel = ProfileDisputesMyDisputes1RowModel()
    // TODO uncomment following line after integration with data source
    // val profileDisputesMyDisputes1RowModel = list[position]
    holder.binding.profileDisputesMyDisputes1RowModel = profileDisputesMyDisputes1RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: ProfileDisputesMyDisputes1RowModel
    ): Unit {
    }
  }

  public inner class RowProfileDisputesMyDisputes1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowProfileDisputesMyDisputes1Binding =
        RowProfileDisputesMyDisputes1Binding.bind(itemView)
  }
}
