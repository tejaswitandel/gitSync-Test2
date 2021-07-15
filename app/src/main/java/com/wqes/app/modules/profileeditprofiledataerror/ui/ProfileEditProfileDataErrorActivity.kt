package com.wqes.app.modules.profileeditprofiledataerror.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityProfileEditProfileDataErrorBinding
import com.wqes.app.modules.profileeditprofiledataerror.`data`.viewmodel.ProfileEditProfileDataErrorVM
import kotlin.String
import kotlin.Unit

public class ProfileEditProfileDataErrorActivity : AppCompatActivity() {
  private lateinit var binding: ActivityProfileEditProfileDataErrorBinding

  private val viewModel: ProfileEditProfileDataErrorVM by
      viewModels<ProfileEditProfileDataErrorVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding =
                   
        DataBindingUtil.setContentView(this,R.layout.activity_profile_edit_profile_data_error)
    binding.lifecycleOwner = this
    binding.profileEditProfileDataErrorVM = viewModel
  }

  public companion object {
    public const val TAG: String = "PROFILE_EDIT_PROFILE_DATA_ERROR_ACTIVITY"
  }
}
