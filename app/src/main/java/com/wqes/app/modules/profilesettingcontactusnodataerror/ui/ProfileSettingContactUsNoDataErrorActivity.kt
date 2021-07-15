package com.wqes.app.modules.profilesettingcontactusnodataerror.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityProfileSettingContactUsNoDataErrorBinding
import com.wqes.app.modules.profilesettingcontactusnodataerror.`data`.viewmodel.ProfileSettingContactUsNoDataErrorVM
import kotlin.String
import kotlin.Unit

public class ProfileSettingContactUsNoDataErrorActivity : AppCompatActivity() {
  private lateinit var binding: ActivityProfileSettingContactUsNoDataErrorBinding

  private val viewModel: ProfileSettingContactUsNoDataErrorVM by
      viewModels<ProfileSettingContactUsNoDataErrorVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding =
                   
        DataBindingUtil.setContentView(this,R.layout.activity_profile_setting_contact_us_no_data_error)
    binding.lifecycleOwner = this
    binding.profileSettingContactUsNoDataErrorVM = viewModel
  }

  public companion object {
    public const val TAG: String = "PROFILE_SETTING_CONTACT_US_NO_DATA_ERROR_ACTIVITY"
  }
}
