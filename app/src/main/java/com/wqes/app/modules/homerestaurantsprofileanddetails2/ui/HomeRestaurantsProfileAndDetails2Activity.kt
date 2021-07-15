package com.wqes.app.modules.homerestaurantsprofileanddetails2.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityHomeRestaurantsProfileAndDetails2Binding
import com.wqes.app.modules.homerestaurantsprofileanddetails2.`data`.viewmodel.HomeRestaurantsProfileAndDetails2VM
import kotlin.String
import kotlin.Unit

public class HomeRestaurantsProfileAndDetails2Activity : AppCompatActivity() {
  private lateinit var binding: ActivityHomeRestaurantsProfileAndDetails2Binding

  private val viewModel: HomeRestaurantsProfileAndDetails2VM by
      viewModels<HomeRestaurantsProfileAndDetails2VM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding =
                   
        DataBindingUtil.setContentView(this,R.layout.activity_home_restaurants_profile_and_details_2)
    binding.lifecycleOwner = this
    binding.homeRestaurantsProfileAndDetails2VM = viewModel
  }

  public companion object {
    public const val TAG: String = "HOME_RESTAURANTS_PROFILE_AND_DETAILS2ACTIVITY"
  }
}
