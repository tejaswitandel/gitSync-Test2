package com.wqes.app.modules.profilenotifications.ui

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityProfileNotificationsBinding
import com.wqes.app.modules.profilenotifications.`data`.model.ProfileNotificationsRowModel
import com.wqes.app.modules.profilenotifications.`data`.viewmodel.ProfileNotificationsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class ProfileNotificationsActivity : AppCompatActivity() {
  private lateinit var binding: ActivityProfileNotificationsBinding

  private val viewModel: ProfileNotificationsVM by viewModels<ProfileNotificationsVM>()

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: ProfileNotificationsRowModel
  ): Unit {
  }

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_profile_notifications)
    val recyclerViewAdapter = RecyclerViewAdapter(arrayListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
            object : RecyclerViewAdapter.OnItemClickListener {
                override fun onItemClick(view:View, position:Int, item :
        ProfileNotificationsRowModel) {
                    onClickRecyclerView(view, position, item)
                }
            }
            )
    binding.lifecycleOwner = this
    binding.profileNotificationsVM = viewModel
  }

  public companion object {
    public const val TAG: String = "PROFILE_NOTIFICATIONS_ACTIVITY"
  }
}
