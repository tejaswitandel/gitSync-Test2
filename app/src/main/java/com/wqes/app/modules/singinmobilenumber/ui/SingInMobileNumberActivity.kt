package com.wqes.app.modules.singinmobilenumber.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivitySingInMobileNumberBinding
import com.wqes.app.modules.singinmobilenumber.`data`.viewmodel.SingInMobileNumberVM
import kotlin.String
import kotlin.Unit

public class SingInMobileNumberActivity : AppCompatActivity() {
  private lateinit var binding: ActivitySingInMobileNumberBinding

  private val viewModel: SingInMobileNumberVM by viewModels<SingInMobileNumberVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_sing_in_mobile_number)
    binding.lifecycleOwner = this
    binding.singInMobileNumberVM = viewModel
  }

  public companion object {
    public const val TAG: String = "SING_IN_MOBILE_NUMBER_ACTIVITY"
  }
}
