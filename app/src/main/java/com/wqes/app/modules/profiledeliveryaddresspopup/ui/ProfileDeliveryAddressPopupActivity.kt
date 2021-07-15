package com.wqes.app.modules.profiledeliveryaddresspopup.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityProfileDeliveryAddressPopupBinding
import com.wqes.app.modules.profiledeliveryaddresspopup.`data`.viewmodel.ProfileDeliveryAddressPopupVM
import kotlin.String
import kotlin.Unit

public class ProfileDeliveryAddressPopupActivity : AppCompatActivity() {
  private lateinit var binding: ActivityProfileDeliveryAddressPopupBinding

  private val viewModel: ProfileDeliveryAddressPopupVM by
      viewModels<ProfileDeliveryAddressPopupVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding =
                   
        DataBindingUtil.setContentView(this,R.layout.activity_profile_delivery_address_popup)
    binding.lifecycleOwner = this
    binding.profileDeliveryAddressPopupVM = viewModel
  }

  public companion object {
    public const val TAG: String = "PROFILE_DELIVERY_ADDRESS_POPUP_ACTIVITY"
  }
}
