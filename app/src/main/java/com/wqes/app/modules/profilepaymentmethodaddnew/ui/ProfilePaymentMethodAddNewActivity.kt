package com.wqes.app.modules.profilepaymentmethodaddnew.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityProfilePaymentMethodAddNewBinding
import com.wqes.app.modules.profilepaymentmethodaddnew.`data`.viewmodel.ProfilePaymentMethodAddNewVM
import kotlin.String
import kotlin.Unit

public class ProfilePaymentMethodAddNewActivity : AppCompatActivity() {
  private lateinit var binding: ActivityProfilePaymentMethodAddNewBinding

  private val viewModel: ProfilePaymentMethodAddNewVM by viewModels<ProfilePaymentMethodAddNewVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding =
                   
        DataBindingUtil.setContentView(this,R.layout.activity_profile_payment_method_add_new)
    binding.lifecycleOwner = this
    binding.profilePaymentMethodAddNewVM = viewModel
  }

  public companion object {
    public const val TAG: String = "PROFILE_PAYMENT_METHOD_ADD_NEW_ACTIVITY"
  }
}
