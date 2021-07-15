package com.wqes.app.modules.forgotpasswordotpdataerror1.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityForgotPasswordOtpDataError1Binding
import com.wqes.app.modules.forgotpasswordotpdataerror1.`data`.viewmodel.ForgotPasswordOtpDataError1VM
import kotlin.String
import kotlin.Unit

public class ForgotPasswordOtpDataError1Activity : AppCompatActivity() {
  private lateinit var binding: ActivityForgotPasswordOtpDataError1Binding

  private val viewModel: ForgotPasswordOtpDataError1VM by
      viewModels<ForgotPasswordOtpDataError1VM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding =
                   
        DataBindingUtil.setContentView(this,R.layout.activity_forgot_password_otp_data_error_1)
    binding.lifecycleOwner = this
    binding.forgotPasswordOtpDataError1VM = viewModel
  }

  public companion object {
    public const val TAG: String = "FORGOT_PASSWORD_OTP_DATA_ERROR1ACTIVITY"
  }
}
