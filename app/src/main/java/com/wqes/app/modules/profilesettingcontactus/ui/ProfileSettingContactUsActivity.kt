package com.wqes.app.modules.profilesettingcontactus.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityProfileSettingContactUsBinding
import com.wqes.app.modules.profilesettingcontactus.`data`.viewmodel.ProfileSettingContactUsVM
import kotlin.String
import kotlin.Unit

public class ProfileSettingContactUsActivity : AppCompatActivity() {
  private lateinit var binding: ActivityProfileSettingContactUsBinding

  private val viewModel: ProfileSettingContactUsVM by viewModels<ProfileSettingContactUsVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_profile_setting_contact_us)
    binding.lifecycleOwner = this
    binding.profileSettingContactUsVM = viewModel
  }

  public companion object {
    public const val TAG: String = "PROFILE_SETTING_CONTACT_US_ACTIVITY"
  }
}
