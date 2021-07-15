package com.wqes.app.modules.forgotpassworddataerror.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityForgotPasswordDataErrorBinding
import com.wqes.app.modules.forgotpassworddataerror.`data`.viewmodel.ForgotPasswordDataErrorVM
import kotlin.String
import kotlin.Unit

public class ForgotPasswordDataErrorActivity : AppCompatActivity() {
  private lateinit var binding: ActivityForgotPasswordDataErrorBinding

  private val viewModel: ForgotPasswordDataErrorVM by viewModels<ForgotPasswordDataErrorVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_forgot_password_data_error)
    binding.lifecycleOwner = this
    binding.forgotPasswordDataErrorVM = viewModel
  }

  public companion object {
    public const val TAG: String = "FORGOT_PASSWORD_DATA_ERROR_ACTIVITY"
  }
}
