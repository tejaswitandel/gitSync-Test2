package com.wqes.app.modules.cartaddlocationaddressdetailssavedaddress.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wqes.app.R
import com.wqes.app.databinding.RowCartAddLocationAddressDetailsSavedAddressBinding
import com.wqes.app.modules.cartaddlocationaddressdetailssavedaddress.`data`.model.CartAddLocationAddressDetailsSavedAddressRowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public val list: List<CartAddLocationAddressDetailsSavedAddressRowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowCartAddLocationAddressDetailsSavedAddressVH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowCartAddLocationAddressDetailsSavedAddressVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_cart_add_location_address_details_saved_address,parent,false)
    return RowCartAddLocationAddressDetailsSavedAddressVH(view)
  }

  public override fun onBindViewHolder(holder: RowCartAddLocationAddressDetailsSavedAddressVH,
      position: Int): Unit {
    val cartAddLocationAddressDetailsSavedAddressRowModel =
        CartAddLocationAddressDetailsSavedAddressRowModel()
    // TODO uncomment following line after integration with data source
    // val cartAddLocationAddressDetailsSavedAddressRowModel = list[position]
    holder.binding.cartAddLocationAddressDetailsSavedAddressRowModel =
        cartAddLocationAddressDetailsSavedAddressRowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: CartAddLocationAddressDetailsSavedAddressRowModel
    ): Unit {
    }
  }

  public inner class RowCartAddLocationAddressDetailsSavedAddressVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowCartAddLocationAddressDetailsSavedAddressBinding =
        RowCartAddLocationAddressDetailsSavedAddressBinding.bind(itemView)
  }
}
