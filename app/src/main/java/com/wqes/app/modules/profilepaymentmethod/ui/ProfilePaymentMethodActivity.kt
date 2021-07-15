package com.wqes.app.modules.profilepaymentmethod.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityProfilePaymentMethodBinding
import com.wqes.app.modules.profilepaymentmethod.`data`.viewmodel.ProfilePaymentMethodVM
import kotlin.String
import kotlin.Unit

public class ProfilePaymentMethodActivity : AppCompatActivity() {
  private lateinit var binding: ActivityProfilePaymentMethodBinding

  private val viewModel: ProfilePaymentMethodVM by viewModels<ProfilePaymentMethodVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_profile_payment_method)
    binding.lifecycleOwner = this
    binding.profilePaymentMethodVM = viewModel
  }

  public companion object {
    public const val TAG: String = "PROFILE_PAYMENT_METHOD_ACTIVITY"
  }
}
