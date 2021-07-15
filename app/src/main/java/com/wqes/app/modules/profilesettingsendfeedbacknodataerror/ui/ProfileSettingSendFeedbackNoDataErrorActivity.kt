package com.wqes.app.modules.profilesettingsendfeedbacknodataerror.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityProfileSettingSendFeedbackNoDataErrorBinding
import com.wqes.app.modules.profilesettingsendfeedbacknodataerror.`data`.viewmodel.ProfileSettingSendFeedbackNoDataErrorVM
import kotlin.String
import kotlin.Unit

public class ProfileSettingSendFeedbackNoDataErrorActivity : AppCompatActivity() {
  private lateinit var binding: ActivityProfileSettingSendFeedbackNoDataErrorBinding

  private val viewModel: ProfileSettingSendFeedbackNoDataErrorVM by
      viewModels<ProfileSettingSendFeedbackNoDataErrorVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding =
                   
        DataBindingUtil.setContentView(this,R.layout.activity_profile_setting_send_feedback_no_data_error)
    binding.lifecycleOwner = this
    binding.profileSettingSendFeedbackNoDataErrorVM = viewModel
  }

  public companion object {
    public const val TAG: String = "PROFILE_SETTING_SEND_FEEDBACK_NO_DATA_ERROR_ACTIVITY"
  }
}
