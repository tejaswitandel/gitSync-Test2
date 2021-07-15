package com.wqes.app.modules.profiledeliveryaddressaddressdetailsnodataerror.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityProfileDeliveryAddressAddressDetailsNoDataErrorBinding
import com.wqes.app.modules.profiledeliveryaddressaddressdetailsnodataerror.`data`.viewmodel.ProfileDeliveryAddressAddressDetailsNoDataErrorVM
import kotlin.String
import kotlin.Unit

public class ProfileDeliveryAddressAddressDetailsNoDataErrorActivity : AppCompatActivity() {
  private lateinit var binding: ActivityProfileDeliveryAddressAddressDetailsNoDataErrorBinding

  private val viewModel: ProfileDeliveryAddressAddressDetailsNoDataErrorVM by
      viewModels<ProfileDeliveryAddressAddressDetailsNoDataErrorVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding =
                   
        DataBindingUtil.setContentView(this,R.layout.activity_profile_delivery_address_address_details_no_data_error)
    binding.lifecycleOwner = this
    binding.profileDeliveryAddressAddressDetailsNoDataErrorVM = viewModel
  }

  public companion object {
    public const val TAG: String = "PROFILE_DELIVERY_ADDRESS_ADDRESS_DETAILS_NO_DATA_ERROR_ACTIVITY"
  }
}
