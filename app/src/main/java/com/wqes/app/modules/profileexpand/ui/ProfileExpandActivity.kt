package com.wqes.app.modules.profileexpand.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityProfileExpandBinding
import com.wqes.app.modules.profileexpand.`data`.viewmodel.ProfileExpandVM
import kotlin.String
import kotlin.Unit

public class ProfileExpandActivity : AppCompatActivity() {
  private lateinit var binding: ActivityProfileExpandBinding

  private val viewModel: ProfileExpandVM by viewModels<ProfileExpandVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_profile_expand)
    binding.lifecycleOwner = this
    binding.profileExpandVM = viewModel
  }

  public companion object {
    public const val TAG: String = "PROFILE_EXPAND_ACTIVITY"
  }
}
