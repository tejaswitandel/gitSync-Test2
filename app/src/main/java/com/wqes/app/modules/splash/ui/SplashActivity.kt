package com.wqes.app.modules.splash.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivitySplashBinding
import com.wqes.app.modules.splash.`data`.viewmodel.SplashVM
import kotlin.String
import kotlin.Unit

public class SplashActivity : AppCompatActivity() {
  private lateinit var binding: ActivitySplashBinding

  private val viewModel: SplashVM by viewModels<SplashVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_splash)
    binding.lifecycleOwner = this
    binding.splashVM = viewModel
  }

  public companion object {
    public const val TAG: String = "SPLASH_ACTIVITY"
  }
}
