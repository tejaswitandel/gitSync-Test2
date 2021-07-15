package com.wqes.app.modules.profilesettingfaqs.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityProfileSettingFaqsBinding
import com.wqes.app.modules.profilesettingfaqs.`data`.viewmodel.ProfileSettingFaqsVM
import kotlin.String
import kotlin.Unit

public class ProfileSettingFaqsActivity : AppCompatActivity() {
  private lateinit var binding: ActivityProfileSettingFaqsBinding

  private val viewModel: ProfileSettingFaqsVM by viewModels<ProfileSettingFaqsVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_profile_setting_faqs)
    binding.lifecycleOwner = this
    binding.profileSettingFaqsVM = viewModel
  }

  public companion object {
    public const val TAG: String = "PROFILE_SETTING_FAQS_ACTIVITY"
  }
}
