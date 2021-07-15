package com.wqes.app.modules.profilemyorderhistory1.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityProfileMyOrderHistory1Binding
import com.wqes.app.modules.profilemyorderhistory1.`data`.viewmodel.ProfileMyOrderHistory1VM
import kotlin.String
import kotlin.Unit

public class ProfileMyOrderHistory1Activity : AppCompatActivity() {
  private lateinit var binding: ActivityProfileMyOrderHistory1Binding

  private val viewModel: ProfileMyOrderHistory1VM by viewModels<ProfileMyOrderHistory1VM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_profile_my_order_history_1)
    binding.lifecycleOwner = this
    binding.profileMyOrderHistory1VM = viewModel
  }

  public companion object {
    public const val TAG: String = "PROFILE_MY_ORDER_HISTORY1ACTIVITY"
  }
}
