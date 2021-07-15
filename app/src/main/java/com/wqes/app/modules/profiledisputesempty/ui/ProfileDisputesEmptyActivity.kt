package com.wqes.app.modules.profiledisputesempty.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityProfileDisputesEmptyBinding
import com.wqes.app.modules.profiledisputesempty.`data`.viewmodel.ProfileDisputesEmptyVM
import kotlin.String
import kotlin.Unit

public class ProfileDisputesEmptyActivity : AppCompatActivity() {
  private lateinit var binding: ActivityProfileDisputesEmptyBinding

  private val viewModel: ProfileDisputesEmptyVM by viewModels<ProfileDisputesEmptyVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_profile_disputes_empty)
    binding.lifecycleOwner = this
    binding.profileDisputesEmptyVM = viewModel
  }

  public companion object {
    public const val TAG: String = "PROFILE_DISPUTES_EMPTY_ACTIVITY"
  }
}
