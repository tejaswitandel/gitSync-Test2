package com.wqes.app.modules.profilemyorderhistoryempty1.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityProfileMyOrderHistoryEmpty1Binding
import com.wqes.app.modules.profilemyorderhistoryempty1.`data`.viewmodel.ProfileMyOrderHistoryEmpty1VM
import kotlin.String
import kotlin.Unit

public class ProfileMyOrderHistoryEmpty1Activity : AppCompatActivity() {
  private lateinit var binding: ActivityProfileMyOrderHistoryEmpty1Binding

  private val viewModel: ProfileMyOrderHistoryEmpty1VM by
      viewModels<ProfileMyOrderHistoryEmpty1VM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding =
                   
        DataBindingUtil.setContentView(this,R.layout.activity_profile_my_order_history_empty_1)
    binding.lifecycleOwner = this
    binding.profileMyOrderHistoryEmpty1VM = viewModel
  }

  public companion object {
    public const val TAG: String = "PROFILE_MY_ORDER_HISTORY_EMPTY1ACTIVITY"
  }
}
