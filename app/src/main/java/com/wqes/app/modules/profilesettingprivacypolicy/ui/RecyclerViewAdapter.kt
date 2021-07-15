package com.wqes.app.modules.profilesettingprivacypolicy.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wqes.app.R
import com.wqes.app.databinding.RowProfileSettingPrivacyPolicyBinding
import com.wqes.app.modules.profilesettingprivacypolicy.`data`.model.ProfileSettingPrivacyPolicyRowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public val list: List<ProfileSettingPrivacyPolicyRowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowProfileSettingPrivacyPolicyVH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowProfileSettingPrivacyPolicyVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_profile_setting_privacy_policy,parent,false)
    return RowProfileSettingPrivacyPolicyVH(view)
  }

  public override fun onBindViewHolder(holder: RowProfileSettingPrivacyPolicyVH, position: Int):
      Unit {
    val profileSettingPrivacyPolicyRowModel = ProfileSettingPrivacyPolicyRowModel()
    // TODO uncomment following line after integration with data source
    // val profileSettingPrivacyPolicyRowModel = list[position]
    holder.binding.profileSettingPrivacyPolicyRowModel = profileSettingPrivacyPolicyRowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: ProfileSettingPrivacyPolicyRowModel
    ): Unit {
    }
  }

  public inner class RowProfileSettingPrivacyPolicyVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowProfileSettingPrivacyPolicyBinding =
        RowProfileSettingPrivacyPolicyBinding.bind(itemView)
  }
}
