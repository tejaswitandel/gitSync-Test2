package com.wqes.app.modules.profilefavouriteorders.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityProfileFavouriteOrdersBinding
import com.wqes.app.modules.profilefavouriteorders.`data`.viewmodel.ProfileFavouriteOrdersVM
import kotlin.String
import kotlin.Unit

public class ProfileFavouriteOrdersActivity : AppCompatActivity() {
  private lateinit var binding: ActivityProfileFavouriteOrdersBinding

  private val viewModel: ProfileFavouriteOrdersVM by viewModels<ProfileFavouriteOrdersVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_profile_favourite_orders)
    binding.lifecycleOwner = this
    binding.profileFavouriteOrdersVM = viewModel
  }

  public companion object {
    public const val TAG: String = "PROFILE_FAVOURITE_ORDERS_ACTIVITY"
  }
}
