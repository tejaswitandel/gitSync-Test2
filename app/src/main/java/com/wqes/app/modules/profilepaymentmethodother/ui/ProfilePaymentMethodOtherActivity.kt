package com.wqes.app.modules.profilepaymentmethodother.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityProfilePaymentMethodOtherBinding
import com.wqes.app.modules.profilepaymentmethodother.`data`.viewmodel.ProfilePaymentMethodOtherVM
import kotlin.String
import kotlin.Unit

public class ProfilePaymentMethodOtherActivity : AppCompatActivity() {
  private lateinit var binding: ActivityProfilePaymentMethodOtherBinding

  private val viewModel: ProfilePaymentMethodOtherVM by viewModels<ProfilePaymentMethodOtherVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding =
                   
        DataBindingUtil.setContentView(this,R.layout.activity_profile_payment_method_other)
    binding.lifecycleOwner = this
    binding.profilePaymentMethodOtherVM = viewModel
  }

  public companion object {
    public const val TAG: String = "PROFILE_PAYMENT_METHOD_OTHER_ACTIVITY"
  }
}
