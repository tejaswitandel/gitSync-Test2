package com.wqes.app.modules.profiledisputes1.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityProfileDisputes1Binding
import com.wqes.app.modules.profiledisputes1.`data`.viewmodel.ProfileDisputes1VM
import kotlin.String
import kotlin.Unit

public class ProfileDisputes1Activity : AppCompatActivity() {
  private lateinit var binding: ActivityProfileDisputes1Binding

  private val viewModel: ProfileDisputes1VM by viewModels<ProfileDisputes1VM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_profile_disputes_1)
    binding.lifecycleOwner = this
    binding.profileDisputes1VM = viewModel
  }

  public companion object {
    public const val TAG: String = "PROFILE_DISPUTES1ACTIVITY"
  }
}
