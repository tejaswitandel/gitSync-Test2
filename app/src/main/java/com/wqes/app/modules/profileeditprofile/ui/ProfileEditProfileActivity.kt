package com.wqes.app.modules.profileeditprofile.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityProfileEditProfileBinding
import com.wqes.app.modules.profileeditprofile.`data`.viewmodel.ProfileEditProfileVM
import kotlin.String
import kotlin.Unit

public class ProfileEditProfileActivity : AppCompatActivity() {
  private lateinit var binding: ActivityProfileEditProfileBinding

  private val viewModel: ProfileEditProfileVM by viewModels<ProfileEditProfileVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_profile_edit_profile)
    binding.lifecycleOwner = this
    binding.profileEditProfileVM = viewModel
  }

  public companion object {
    public const val TAG: String = "PROFILE_EDIT_PROFILE_ACTIVITY"
  }
}
