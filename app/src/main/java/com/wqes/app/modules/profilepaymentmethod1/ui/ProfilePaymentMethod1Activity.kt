package com.wqes.app.modules.profilepaymentmethod1.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityProfilePaymentMethod1Binding
import com.wqes.app.modules.profilepaymentmethod1.`data`.viewmodel.ProfilePaymentMethod1VM
import kotlin.String
import kotlin.Unit

public class ProfilePaymentMethod1Activity : AppCompatActivity() {
  private lateinit var binding: ActivityProfilePaymentMethod1Binding

  private val viewModel: ProfilePaymentMethod1VM by viewModels<ProfilePaymentMethod1VM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_profile_payment_method_1)
    binding.lifecycleOwner = this
    binding.profilePaymentMethod1VM = viewModel
  }

  public companion object {
    public const val TAG: String = "PROFILE_PAYMENT_METHOD1ACTIVITY"
  }
}
