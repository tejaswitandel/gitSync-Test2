package com.wqes.app.modules.home.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wqes.app.R
import com.wqes.app.databinding.RowHome2Binding
import com.wqes.app.modules.home.`data`.model.Home2RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerView2Adapter(
  public val list: List<Home2RowModel>
) : RecyclerView.Adapter<RecyclerView2Adapter.RowHome2VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHome2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_home2,parent,false)
    return RowHome2VH(view)
  }

  public override fun onBindViewHolder(holder: RowHome2VH, position: Int): Unit {
    val home2RowModel = Home2RowModel()
    // TODO uncomment following line after integration with data source
    // val home2RowModel = list[position]
    holder.binding.home2RowModel = home2RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: Home2RowModel
    ): Unit {
    }
  }

  public inner class RowHome2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowHome2Binding = RowHome2Binding.bind(itemView)
  }
}
