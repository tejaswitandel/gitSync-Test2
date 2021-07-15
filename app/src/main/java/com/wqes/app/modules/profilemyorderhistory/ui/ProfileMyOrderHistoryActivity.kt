package com.wqes.app.modules.profilemyorderhistory.ui

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityProfileMyOrderHistoryBinding
import com.wqes.app.modules.profilemyorderhistory.`data`.model.ProfileMyOrderHistoryRowModel
import com.wqes.app.modules.profilemyorderhistory.`data`.viewmodel.ProfileMyOrderHistoryVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class ProfileMyOrderHistoryActivity : AppCompatActivity() {
  private lateinit var binding: ActivityProfileMyOrderHistoryBinding

  private val viewModel: ProfileMyOrderHistoryVM by viewModels<ProfileMyOrderHistoryVM>()

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: ProfileMyOrderHistoryRowModel
  ): Unit {
  }

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_profile_my_order_history)
    val recyclerViewAdapter = RecyclerViewAdapter(arrayListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
            object : RecyclerViewAdapter.OnItemClickListener {
                override fun onItemClick(view:View, position:Int, item :
                        ProfileMyOrderHistoryRowModel) {
                    onClickRecyclerView(view, position, item)
                }
            }
            )
    binding.lifecycleOwner = this
    binding.profileMyOrderHistoryVM = viewModel
  }

  public companion object {
    public const val TAG: String = "PROFILE_MY_ORDER_HISTORY_ACTIVITY"
  }
}
