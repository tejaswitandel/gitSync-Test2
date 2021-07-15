package com.wqes.app.modules.profilechangepasswordnodataerror.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityProfileChangePasswordNoDataErrorBinding
import com.wqes.app.modules.profilechangepasswordnodataerror.`data`.viewmodel.ProfileChangePasswordNoDataErrorVM
import kotlin.String
import kotlin.Unit

public class ProfileChangePasswordNoDataErrorActivity : AppCompatActivity() {
  private lateinit var binding: ActivityProfileChangePasswordNoDataErrorBinding

  private val viewModel: ProfileChangePasswordNoDataErrorVM by
      viewModels<ProfileChangePasswordNoDataErrorVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding =
                   
        DataBindingUtil.setContentView(this,R.layout.activity_profile_change_password_no_data_error)
    binding.lifecycleOwner = this
    binding.profileChangePasswordNoDataErrorVM = viewModel
  }

  public companion object {
    public const val TAG: String = "PROFILE_CHANGE_PASSWORD_NO_DATA_ERROR_ACTIVITY"
  }
}
