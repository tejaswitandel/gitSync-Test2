package com.wqes.app.modules.profilechangepasswordpopup.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityProfileChangePasswordPopupBinding
import com.wqes.app.modules.profilechangepasswordpopup.`data`.viewmodel.ProfileChangePasswordPopupVM
import kotlin.String
import kotlin.Unit

public class ProfileChangePasswordPopupActivity : AppCompatActivity() {
  private lateinit var binding: ActivityProfileChangePasswordPopupBinding

  private val viewModel: ProfileChangePasswordPopupVM by viewModels<ProfileChangePasswordPopupVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding =
                   
        DataBindingUtil.setContentView(this,R.layout.activity_profile_change_password_popup)
    binding.lifecycleOwner = this
    binding.profileChangePasswordPopupVM = viewModel
  }

  public companion object {
    public const val TAG: String = "PROFILE_CHANGE_PASSWORD_POPUP_ACTIVITY"
  }
}
