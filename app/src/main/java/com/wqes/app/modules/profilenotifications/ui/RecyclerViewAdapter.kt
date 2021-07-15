package com.wqes.app.modules.profilenotifications.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wqes.app.R
import com.wqes.app.databinding.RowProfileNotificationsBinding
import com.wqes.app.modules.profilenotifications.`data`.model.ProfileNotificationsRowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public val list: List<ProfileNotificationsRowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowProfileNotificationsVH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowProfileNotificationsVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_profile_notifications,parent,false)
    return RowProfileNotificationsVH(view)
  }

  public override fun onBindViewHolder(holder: RowProfileNotificationsVH, position: Int): Unit {
    val profileNotificationsRowModel = ProfileNotificationsRowModel()
    // TODO uncomment following line after integration with data source
    // val profileNotificationsRowModel = list[position]
    holder.binding.profileNotificationsRowModel = profileNotificationsRowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: ProfileNotificationsRowModel
    ): Unit {
    }
  }

  public inner class RowProfileNotificationsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowProfileNotificationsBinding =
        RowProfileNotificationsBinding.bind(itemView)
  }
}
