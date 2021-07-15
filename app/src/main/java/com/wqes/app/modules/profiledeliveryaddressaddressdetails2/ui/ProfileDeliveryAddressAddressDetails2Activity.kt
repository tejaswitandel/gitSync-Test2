package com.wqes.app.modules.profiledeliveryaddressaddressdetails2.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityProfileDeliveryAddressAddressDetails2Binding
import com.wqes.app.modules.profiledeliveryaddressaddressdetails2.`data`.viewmodel.ProfileDeliveryAddressAddressDetails2VM
import kotlin.String
import kotlin.Unit

public class ProfileDeliveryAddressAddressDetails2Activity : AppCompatActivity() {
  private lateinit var binding: ActivityProfileDeliveryAddressAddressDetails2Binding

  private val viewModel: ProfileDeliveryAddressAddressDetails2VM by
      viewModels<ProfileDeliveryAddressAddressDetails2VM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding =
                   
        DataBindingUtil.setContentView(this,R.layout.activity_profile_delivery_address_address_details_2)
    binding.lifecycleOwner = this
    binding.profileDeliveryAddressAddressDetails2VM = viewModel
  }

  public companion object {
    public const val TAG: String = "PROFILE_DELIVERY_ADDRESS_ADDRESS_DETAILS2ACTIVITY"
  }
}
