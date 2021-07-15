package com.wqes.app.modules.homerestaurantsprofileanddetailsinfo.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityHomeRestaurantsProfileAndDetailsInfoBinding
import com.wqes.app.modules.homerestaurantsprofileanddetailsinfo.`data`.viewmodel.HomeRestaurantsProfileAndDetailsInfoVM
import kotlin.String
import kotlin.Unit

public class HomeRestaurantsProfileAndDetailsInfoActivity : AppCompatActivity() {
  private lateinit var binding: ActivityHomeRestaurantsProfileAndDetailsInfoBinding

  private val viewModel: HomeRestaurantsProfileAndDetailsInfoVM by
      viewModels<HomeRestaurantsProfileAndDetailsInfoVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding =
                   
        DataBindingUtil.setContentView(this,R.layout.activity_home_restaurants_profile_and_details_info)
    binding.lifecycleOwner = this
    binding.homeRestaurantsProfileAndDetailsInfoVM = viewModel
  }

  public companion object {
    public const val TAG: String = "HOME_RESTAURANTS_PROFILE_AND_DETAILS_INFO_ACTIVITY"
  }
}
