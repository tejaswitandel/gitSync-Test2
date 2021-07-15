package com.wqes.app.modules.profilechangepassworddataerror.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityProfileChangePasswordDataErrorBinding
import com.wqes.app.modules.profilechangepassworddataerror.`data`.viewmodel.ProfileChangePasswordDataErrorVM
import kotlin.String
import kotlin.Unit

public class ProfileChangePasswordDataErrorActivity : AppCompatActivity() {
  private lateinit var binding: ActivityProfileChangePasswordDataErrorBinding

  private val viewModel: ProfileChangePasswordDataErrorVM by
      viewModels<ProfileChangePasswordDataErrorVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding =
                   
        DataBindingUtil.setContentView(this,R.layout.activity_profile_change_password_data_error)
    binding.lifecycleOwner = this
    binding.profileChangePasswordDataErrorVM = viewModel
  }

  public companion object {
    public const val TAG: String = "PROFILE_CHANGE_PASSWORD_DATA_ERROR_ACTIVITY"
  }
}
