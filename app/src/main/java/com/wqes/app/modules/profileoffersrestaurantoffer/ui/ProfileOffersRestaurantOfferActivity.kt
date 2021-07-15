package com.wqes.app.modules.profileoffersrestaurantoffer.ui

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityProfileOffersRestaurantOfferBinding
import com.wqes.app.modules.profileoffersrestaurantoffer.`data`.model.ProfileOffersRestaurantOfferRowModel
import com.wqes.app.modules.profileoffersrestaurantoffer.`data`.viewmodel.ProfileOffersRestaurantOfferVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class ProfileOffersRestaurantOfferActivity : AppCompatActivity() {
  private lateinit var binding: ActivityProfileOffersRestaurantOfferBinding

  private val viewModel: ProfileOffersRestaurantOfferVM by
      viewModels<ProfileOffersRestaurantOfferVM>()

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: ProfileOffersRestaurantOfferRowModel
  ): Unit {
  }

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding =
                   
        DataBindingUtil.setContentView(this,R.layout.activity_profile_offers_restaurant_offer)
    val recyclerViewAdapter = RecyclerViewAdapter(arrayListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
            object : RecyclerViewAdapter.OnItemClickListener {
                override fun onItemClick(view:View, position:Int, item :
                        ProfileOffersRestaurantOfferRowModel) {
                    onClickRecyclerView(view, position, item)
                }
            }
            )
    binding.lifecycleOwner = this
    binding.profileOffersRestaurantOfferVM = viewModel
  }

  public companion object {
    public const val TAG: String = "PROFILE_OFFERS_RESTAURANT_OFFER_ACTIVITY"
  }
}
