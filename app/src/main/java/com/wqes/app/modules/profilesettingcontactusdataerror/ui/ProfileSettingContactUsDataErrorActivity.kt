package com.wqes.app.modules.profilesettingcontactusdataerror.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityProfileSettingContactUsDataErrorBinding
import com.wqes.app.modules.profilesettingcontactusdataerror.`data`.viewmodel.ProfileSettingContactUsDataErrorVM
import kotlin.String
import kotlin.Unit

public class ProfileSettingContactUsDataErrorActivity : AppCompatActivity() {
  private lateinit var binding: ActivityProfileSettingContactUsDataErrorBinding

  private val viewModel: ProfileSettingContactUsDataErrorVM by
      viewModels<ProfileSettingContactUsDataErrorVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding =
                   
        DataBindingUtil.setContentView(this,R.layout.activity_profile_setting_contact_us_data_error)
    binding.lifecycleOwner = this
    binding.profileSettingContactUsDataErrorVM = viewModel
  }

  public companion object {
    public const val TAG: String = "PROFILE_SETTING_CONTACT_US_DATA_ERROR_ACTIVITY"
  }
}
