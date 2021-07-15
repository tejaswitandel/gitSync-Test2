package com.wqes.app.modules.signupdataerror.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivitySignUpDataErrorBinding
import com.wqes.app.modules.signupdataerror.`data`.viewmodel.SignUpDataErrorVM
import kotlin.String
import kotlin.Unit

public class SignUpDataErrorActivity : AppCompatActivity() {
  private lateinit var binding: ActivitySignUpDataErrorBinding

  private val viewModel: SignUpDataErrorVM by viewModels<SignUpDataErrorVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_sign_up_data_error)
    binding.lifecycleOwner = this
    binding.signUpDataErrorVM = viewModel
  }

  public companion object {
    public const val TAG: String = "SIGN_UP_DATA_ERROR_ACTIVITY"
  }
}
