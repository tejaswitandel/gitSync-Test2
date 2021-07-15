package com.wqes.app.modules.home.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wqes.app.R
import com.wqes.app.databinding.RowHomeBinding
import com.wqes.app.modules.home.`data`.model.HomeRowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public val list: List<HomeRowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowHomeVH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHomeVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_home,parent,false)
    return RowHomeVH(view)
  }

  public override fun onBindViewHolder(holder: RowHomeVH, position: Int): Unit {
    val homeRowModel = HomeRowModel()
    // TODO uncomment following line after integration with data source
    // val homeRowModel = list[position]
    holder.binding.homeRowModel = homeRowModel
  }

  public override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: HomeRowModel
    ): Unit {
    }
  }

  public inner class RowHomeVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowHomeBinding = RowHomeBinding.bind(itemView)
  }
}
