package com.wqes.app.modules.signupdataerror1.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivitySignUpDataError1Binding
import com.wqes.app.modules.signupdataerror1.`data`.viewmodel.SignUpDataError1VM
import kotlin.String
import kotlin.Unit

public class SignUpDataError1Activity : AppCompatActivity() {
  private lateinit var binding: ActivitySignUpDataError1Binding

  private val viewModel: SignUpDataError1VM by viewModels<SignUpDataError1VM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_sign_up_data_error_1)
    binding.lifecycleOwner = this
    binding.signUpDataError1VM = viewModel
  }

  public companion object {
    public const val TAG: String = "SIGN_UP_DATA_ERROR1ACTIVITY"
  }
}
