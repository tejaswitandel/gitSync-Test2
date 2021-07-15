package com.wqes.app.modules.splash1.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivitySplash1Binding
import com.wqes.app.modules.splash1.`data`.viewmodel.Splash1VM
import kotlin.String
import kotlin.Unit

public class Splash1Activity : AppCompatActivity() {
  private lateinit var binding: ActivitySplash1Binding

  private val viewModel: Splash1VM by viewModels<Splash1VM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_splash_1)
    binding.lifecycleOwner = this
    binding.splash1VM = viewModel
  }

  public companion object {
    public const val TAG: String = "SPLASH1ACTIVITY"
  }
}
