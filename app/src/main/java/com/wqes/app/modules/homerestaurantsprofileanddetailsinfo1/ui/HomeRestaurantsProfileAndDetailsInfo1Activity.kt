package com.wqes.app.modules.homerestaurantsprofileanddetailsinfo1.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityHomeRestaurantsProfileAndDetailsInfo1Binding
import com.wqes.app.modules.homerestaurantsprofileanddetailsinfo1.`data`.viewmodel.HomeRestaurantsProfileAndDetailsInfo1VM
import kotlin.String
import kotlin.Unit

public class HomeRestaurantsProfileAndDetailsInfo1Activity : AppCompatActivity() {
  private lateinit var binding: ActivityHomeRestaurantsProfileAndDetailsInfo1Binding

  private val viewModel: HomeRestaurantsProfileAndDetailsInfo1VM by
      viewModels<HomeRestaurantsProfileAndDetailsInfo1VM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding =
                   
        DataBindingUtil.setContentView(this,R.layout.activity_home_restaurants_profile_and_details_info_1)
    binding.lifecycleOwner = this
    binding.homeRestaurantsProfileAndDetailsInfo1VM = viewModel
  }

  public companion object {
    public const val TAG: String = "HOME_RESTAURANTS_PROFILE_AND_DETAILS_INFO1ACTIVITY"
  }
}
