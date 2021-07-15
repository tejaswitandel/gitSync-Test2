package com.wqes.app.modules.onboarding3.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityOnboarding3Binding
import com.wqes.app.modules.onboarding3.`data`.viewmodel.Onboarding3VM
import kotlin.String
import kotlin.Unit

public class Onboarding3Activity : AppCompatActivity() {
  private lateinit var binding: ActivityOnboarding3Binding

  private val viewModel: Onboarding3VM by viewModels<Onboarding3VM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_onboarding_3)
    binding.lifecycleOwner = this
    binding.onboarding3VM = viewModel
  }

  public companion object {
    public const val TAG: String = "ONBOARDING3ACTIVITY"
  }
}
