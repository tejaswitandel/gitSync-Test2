package com.wqes.app.modules.onboarding1.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityOnboarding1Binding
import com.wqes.app.modules.onboarding1.`data`.viewmodel.Onboarding1VM
import kotlin.String
import kotlin.Unit

public class Onboarding1Activity : AppCompatActivity() {
  private lateinit var binding: ActivityOnboarding1Binding

  private val viewModel: Onboarding1VM by viewModels<Onboarding1VM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_onboarding_1)
    binding.lifecycleOwner = this
    binding.onboarding1VM = viewModel
  }

  public companion object {
    public const val TAG: String = "ONBOARDING1ACTIVITY"
  }
}
