package com.wqes.app.modules.homecurrentlocationgps.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityHomeCurrentLocationGpsBinding
import com.wqes.app.modules.homecurrentlocationgps.`data`.viewmodel.HomeCurrentLocationGpsVM
import kotlin.String
import kotlin.Unit

public class HomeCurrentLocationGpsActivity : AppCompatActivity() {
  private lateinit var binding: ActivityHomeCurrentLocationGpsBinding

  private val viewModel: HomeCurrentLocationGpsVM by viewModels<HomeCurrentLocationGpsVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_home_current_location_gps)
    binding.lifecycleOwner = this
    binding.homeCurrentLocationGpsVM = viewModel
  }

  public companion object {
    public const val TAG: String = "HOME_CURRENT_LOCATION_GPS_ACTIVITY"
  }
}
