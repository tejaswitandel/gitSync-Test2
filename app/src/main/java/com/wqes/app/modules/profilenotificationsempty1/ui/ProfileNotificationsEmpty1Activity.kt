package com.wqes.app.modules.profilenotificationsempty1.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityProfileNotificationsEmpty1Binding
import com.wqes.app.modules.profilenotificationsempty1.`data`.viewmodel.ProfileNotificationsEmpty1VM
import kotlin.String
import kotlin.Unit

public class ProfileNotificationsEmpty1Activity : AppCompatActivity() {
  private lateinit var binding: ActivityProfileNotificationsEmpty1Binding

  private val viewModel: ProfileNotificationsEmpty1VM by viewModels<ProfileNotificationsEmpty1VM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding =
                   
        DataBindingUtil.setContentView(this,R.layout.activity_profile_notifications_empty_1)
    binding.lifecycleOwner = this
    binding.profileNotificationsEmpty1VM = viewModel
  }

  public companion object {
    public const val TAG: String = "PROFILE_NOTIFICATIONS_EMPTY1ACTIVITY"
  }
}
