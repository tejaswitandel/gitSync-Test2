package com.wqes.app.modules.signupnodataerror.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wqes.app.R
import com.wqes.app.databinding.RowSignUpNoDataErrorBinding
import com.wqes.app.modules.signupnodataerror.`data`.model.SignUpNoDataErrorRowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public val list: List<SignUpNoDataErrorRowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowSignUpNoDataErrorVH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSignUpNoDataErrorVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_sign_up_no_data_error,parent,false)
    return RowSignUpNoDataErrorVH(view)
  }

  public override fun onBindViewHolder(holder: RowSignUpNoDataErrorVH, position: Int): Unit {
    val signUpNoDataErrorRowModel = SignUpNoDataErrorRowModel()
    // TODO uncomment following line after integration with data source
    // val signUpNoDataErrorRowModel = list[position]
    holder.binding.signUpNoDataErrorRowModel = signUpNoDataErrorRowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: SignUpNoDataErrorRowModel
    ): Unit {
    }
  }

  public inner class RowSignUpNoDataErrorVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowSignUpNoDataErrorBinding = RowSignUpNoDataErrorBinding.bind(itemView)
  }
}
