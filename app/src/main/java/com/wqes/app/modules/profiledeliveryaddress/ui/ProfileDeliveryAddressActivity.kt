package com.wqes.app.modules.profiledeliveryaddress.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityProfileDeliveryAddressBinding
import com.wqes.app.modules.profiledeliveryaddress.`data`.viewmodel.ProfileDeliveryAddressVM
import kotlin.String
import kotlin.Unit

public class ProfileDeliveryAddressActivity : AppCompatActivity() {
  private lateinit var binding: ActivityProfileDeliveryAddressBinding

  private val viewModel: ProfileDeliveryAddressVM by viewModels<ProfileDeliveryAddressVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_profile_delivery_address)
    binding.lifecycleOwner = this
    binding.profileDeliveryAddressVM = viewModel
  }

  public companion object {
    public const val TAG: String = "PROFILE_DELIVERY_ADDRESS_ACTIVITY"
  }
}
