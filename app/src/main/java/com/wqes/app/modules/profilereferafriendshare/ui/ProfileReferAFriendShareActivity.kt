package com.wqes.app.modules.profilereferafriendshare.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityProfileReferAFriendShareBinding
import com.wqes.app.modules.profilereferafriendshare.`data`.viewmodel.ProfileReferAFriendShareVM
import kotlin.String
import kotlin.Unit

public class ProfileReferAFriendShareActivity : AppCompatActivity() {
  private lateinit var binding: ActivityProfileReferAFriendShareBinding

  private val viewModel: ProfileReferAFriendShareVM by viewModels<ProfileReferAFriendShareVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding =
                   
        DataBindingUtil.setContentView(this,R.layout.activity_profile_refer_a_friend_share)
    binding.lifecycleOwner = this
    binding.profileReferAFriendShareVM = viewModel
  }

  public companion object {
    public const val TAG: String = "PROFILE_REFER_A_FRIEND_SHARE_ACTIVITY"
  }
}
