package com.wqes.app.modules.profilepaymentmethodaddnewcardnodataerror.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityProfilePaymentMethodAddNewCardNoDataErrorBinding
import com.wqes.app.modules.profilepaymentmethodaddnewcardnodataerror.`data`.viewmodel.ProfilePaymentMethodAddNewCardNoDataErrorVM
import kotlin.String
import kotlin.Unit

public class ProfilePaymentMethodAddNewCardNoDataErrorActivity : AppCompatActivity() {
  private lateinit var binding: ActivityProfilePaymentMethodAddNewCardNoDataErrorBinding

  private val viewModel: ProfilePaymentMethodAddNewCardNoDataErrorVM by
      viewModels<ProfilePaymentMethodAddNewCardNoDataErrorVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding =
                   
        DataBindingUtil.setContentView(this,R.layout.activity_profile_payment_method_add_new_card_no_data_error)
    binding.lifecycleOwner = this
    binding.profilePaymentMethodAddNewCardNoDataErrorVM = viewModel
  }

  public companion object {
    public const val TAG: String = "PROFILE_PAYMENT_METHOD_ADD_NEW_CARD_NO_DATA_ERROR_ACTIVITY"
  }
}
