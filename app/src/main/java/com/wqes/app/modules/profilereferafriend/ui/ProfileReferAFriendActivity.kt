package com.wqes.app.modules.profilereferafriend.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityProfileReferAFriendBinding
import com.wqes.app.modules.profilereferafriend.`data`.viewmodel.ProfileReferAFriendVM
import kotlin.String
import kotlin.Unit

public class ProfileReferAFriendActivity : AppCompatActivity() {
  private lateinit var binding: ActivityProfileReferAFriendBinding

  private val viewModel: ProfileReferAFriendVM by viewModels<ProfileReferAFriendVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_profile_refer_a_friend)
    binding.lifecycleOwner = this
    binding.profileReferAFriendVM = viewModel
  }

  public companion object {
    public const val TAG: String = "PROFILE_REFER_A_FRIEND_ACTIVITY"
  }
}
