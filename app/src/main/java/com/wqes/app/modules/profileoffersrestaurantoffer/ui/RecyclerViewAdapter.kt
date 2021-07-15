package com.wqes.app.modules.profileoffersrestaurantoffer.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wqes.app.R
import com.wqes.app.databinding.RowProfileOffersRestaurantOfferBinding
import com.wqes.app.modules.profileoffersrestaurantoffer.`data`.model.ProfileOffersRestaurantOfferRowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public val list: List<ProfileOffersRestaurantOfferRowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowProfileOffersRestaurantOfferVH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowProfileOffersRestaurantOfferVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_profile_offers_restaurant_offer,parent,false)
    return RowProfileOffersRestaurantOfferVH(view)
  }

  public override fun onBindViewHolder(holder: RowProfileOffersRestaurantOfferVH, position: Int):
      Unit {
    val profileOffersRestaurantOfferRowModel = ProfileOffersRestaurantOfferRowModel()
    // TODO uncomment following line after integration with data source
    // val profileOffersRestaurantOfferRowModel = list[position]
    holder.binding.profileOffersRestaurantOfferRowModel = profileOffersRestaurantOfferRowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: ProfileOffersRestaurantOfferRowModel
    ): Unit {
    }
  }

  public inner class RowProfileOffersRestaurantOfferVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowProfileOffersRestaurantOfferBinding =
        RowProfileOffersRestaurantOfferBinding.bind(itemView)
  }
}
