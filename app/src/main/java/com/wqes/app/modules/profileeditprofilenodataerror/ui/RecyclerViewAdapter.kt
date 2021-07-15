package com.wqes.app.modules.profileeditprofilenodataerror.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wqes.app.R
import com.wqes.app.databinding.RowProfileEditProfileNoDataErrorBinding
import com.wqes.app.modules.profileeditprofilenodataerror.`data`.model.ProfileEditProfileNoDataErrorRowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public val list: List<ProfileEditProfileNoDataErrorRowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowProfileEditProfileNoDataErrorVH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowProfileEditProfileNoDataErrorVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_profile_edit_profile_no_data_error,parent,false)
    return RowProfileEditProfileNoDataErrorVH(view)
  }

  public override fun onBindViewHolder(holder: RowProfileEditProfileNoDataErrorVH, position: Int):
      Unit {
    val profileEditProfileNoDataErrorRowModel = ProfileEditProfileNoDataErrorRowModel()
    // TODO uncomment following line after integration with data source
    // val profileEditProfileNoDataErrorRowModel = list[position]
    holder.binding.profileEditProfileNoDataErrorRowModel = profileEditProfileNoDataErrorRowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: ProfileEditProfileNoDataErrorRowModel
    ): Unit {
    }
  }

  public inner class RowProfileEditProfileNoDataErrorVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowProfileEditProfileNoDataErrorBinding =
        RowProfileEditProfileNoDataErrorBinding.bind(itemView)
  }
}
