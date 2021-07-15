package com.wqes.app.modules.homerestaurantsprofileanddetailsoffers.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityHomeRestaurantsProfileAndDetailsOffersBinding
import com.wqes.app.modules.homerestaurantsprofileanddetailsoffers.`data`.viewmodel.HomeRestaurantsProfileAndDetailsOffersVM
import kotlin.String
import kotlin.Unit

public class HomeRestaurantsProfileAndDetailsOffersActivity : AppCompatActivity() {
  private lateinit var binding: ActivityHomeRestaurantsProfileAndDetailsOffersBinding

  private val viewModel: HomeRestaurantsProfileAndDetailsOffersVM by
      viewModels<HomeRestaurantsProfileAndDetailsOffersVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding =
                   
        DataBindingUtil.setContentView(this,R.layout.activity_home_restaurants_profile_and_details_offers)
    binding.lifecycleOwner = this
    binding.homeRestaurantsProfileAndDetailsOffersVM = viewModel
  }

  public companion object {
    public const val TAG: String = "HOME_RESTAURANTS_PROFILE_AND_DETAILS_OFFERS_ACTIVITY"
  }
}
