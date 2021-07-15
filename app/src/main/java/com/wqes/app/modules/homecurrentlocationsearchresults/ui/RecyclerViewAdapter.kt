package com.wqes.app.modules.homecurrentlocationsearchresults.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wqes.app.R
import com.wqes.app.databinding.RowHomeCurrentLocationSearchResultsBinding
import com.wqes.app.modules.homecurrentlocationsearchresults.`data`.model.HomeCurrentLocationSearchResultsRowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public val list: List<HomeCurrentLocationSearchResultsRowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowHomeCurrentLocationSearchResultsVH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowHomeCurrentLocationSearchResultsVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_home_current_location_search_results,parent,false)
    return RowHomeCurrentLocationSearchResultsVH(view)
  }

  public override fun onBindViewHolder(holder: RowHomeCurrentLocationSearchResultsVH,
      position: Int): Unit {
    val homeCurrentLocationSearchResultsRowModel = HomeCurrentLocationSearchResultsRowModel()
    // TODO uncomment following line after integration with data source
    // val homeCurrentLocationSearchResultsRowModel = list[position]
    holder.binding.homeCurrentLocationSearchResultsRowModel =
        homeCurrentLocationSearchResultsRowModel
  }

  public override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: HomeCurrentLocationSearchResultsRowModel
    ): Unit {
    }
  }

  public inner class RowHomeCurrentLocationSearchResultsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowHomeCurrentLocationSearchResultsBinding =
        RowHomeCurrentLocationSearchResultsBinding.bind(itemView)
  }
}
