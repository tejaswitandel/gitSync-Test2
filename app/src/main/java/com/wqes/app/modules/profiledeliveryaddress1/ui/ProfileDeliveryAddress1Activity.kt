package com.wqes.app.modules.profiledeliveryaddress1.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityProfileDeliveryAddress1Binding
import com.wqes.app.modules.profiledeliveryaddress1.`data`.viewmodel.ProfileDeliveryAddress1VM
import kotlin.String
import kotlin.Unit

public class ProfileDeliveryAddress1Activity : AppCompatActivity() {
  private lateinit var binding: ActivityProfileDeliveryAddress1Binding

  private val viewModel: ProfileDeliveryAddress1VM by viewModels<ProfileDeliveryAddress1VM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_profile_delivery_address_1)
    binding.lifecycleOwner = this
    binding.profileDeliveryAddress1VM = viewModel
  }

  public companion object {
    public const val TAG: String = "PROFILE_DELIVERY_ADDRESS1ACTIVITY"
  }
}
