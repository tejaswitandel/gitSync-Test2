package com.wqes.app.modules.profiledisputes.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityProfileDisputesBinding
import com.wqes.app.modules.profiledisputes.`data`.viewmodel.ProfileDisputesVM
import kotlin.String
import kotlin.Unit

public class ProfileDisputesActivity : AppCompatActivity() {
  private lateinit var binding: ActivityProfileDisputesBinding

  private val viewModel: ProfileDisputesVM by viewModels<ProfileDisputesVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_profile_disputes)
    binding.lifecycleOwner = this
    binding.profileDisputesVM = viewModel
  }

  public companion object {
    public const val TAG: String = "PROFILE_DISPUTES_ACTIVITY"
  }
}
