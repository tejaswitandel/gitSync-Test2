package com.wqes.app.modules.profilesettingslanguagepreferences.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityProfileSettingsLanguagePreferencesBinding
import com.wqes.app.modules.profilesettingslanguagepreferences.`data`.viewmodel.ProfileSettingsLanguagePreferencesVM
import kotlin.String
import kotlin.Unit

public class ProfileSettingsLanguagePreferencesActivity : AppCompatActivity() {
  private lateinit var binding: ActivityProfileSettingsLanguagePreferencesBinding

  private val viewModel: ProfileSettingsLanguagePreferencesVM by
      viewModels<ProfileSettingsLanguagePreferencesVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding =
                   
        DataBindingUtil.setContentView(this,R.layout.activity_profile_settings_language_preferences)
    binding.lifecycleOwner = this
    binding.profileSettingsLanguagePreferencesVM = viewModel
  }

  public companion object {
    public const val TAG: String = "PROFILE_SETTINGS_LANGUAGE_PREFERENCES_ACTIVITY"
  }
}
