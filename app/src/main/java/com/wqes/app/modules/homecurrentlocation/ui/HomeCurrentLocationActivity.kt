package com.wqes.app.modules.homecurrentlocation.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityHomeCurrentLocationBinding
import com.wqes.app.modules.homecurrentlocation.`data`.viewmodel.HomeCurrentLocationVM
import kotlin.String
import kotlin.Unit

public class HomeCurrentLocationActivity : AppCompatActivity() {
  private lateinit var binding: ActivityHomeCurrentLocationBinding

  private val viewModel: HomeCurrentLocationVM by viewModels<HomeCurrentLocationVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_home_current_location)
    binding.lifecycleOwner = this
    binding.homeCurrentLocationVM = viewModel
  }

  public companion object {
    public const val TAG: String = "HOME_CURRENT_LOCATION_ACTIVITY"
  }
}
