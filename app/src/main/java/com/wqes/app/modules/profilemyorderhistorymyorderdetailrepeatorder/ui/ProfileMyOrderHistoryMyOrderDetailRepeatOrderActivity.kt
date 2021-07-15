package com.wqes.app.modules.profilemyorderhistorymyorderdetailrepeatorder.ui

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityProfileMyOrderHistoryMyOrderDetailRepeatOrderBinding
import com.wqes.app.modules.profilemyorderhistorymyorderdetailrepeatorder.`data`.model.ProfileMyOrderHistoryMyOrderDetailRepeatOrderRowModel
import com.wqes.app.modules.profilemyorderhistorymyorderdetailrepeatorder.`data`.viewmodel.ProfileMyOrderHistoryMyOrderDetailRepeatOrderVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class ProfileMyOrderHistoryMyOrderDetailRepeatOrderActivity : AppCompatActivity() {
  private lateinit var binding: ActivityProfileMyOrderHistoryMyOrderDetailRepeatOrderBinding

  private val viewModel: ProfileMyOrderHistoryMyOrderDetailRepeatOrderVM by
      viewModels<ProfileMyOrderHistoryMyOrderDetailRepeatOrderVM>()

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: ProfileMyOrderHistoryMyOrderDetailRepeatOrderRowModel
  ): Unit {
  }

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding =
                   
        DataBindingUtil.setContentView(this,R.layout.activity_profile_my_order_history_my_order_detail_repeat_order)
    val recyclerViewAdapter = RecyclerViewAdapter(arrayListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
            object : RecyclerViewAdapter.OnItemClickListener {
                override fun onItemClick(view:View, position:Int, item :
                        ProfileMyOrderHistoryMyOrderDetailRepeatOrderRowModel) {
                    onClickRecyclerView(view, position, item)
                }
            }
            )
    binding.lifecycleOwner = this
    binding.profileMyOrderHistoryMyOrderDetailRepeatOrderVM = viewModel
  }

  public companion object {
    public const val TAG: String = "PROFILE_MY_ORDER_HISTORY_MY_ORDER_DETAIL_REPEAT_ORDER_ACTIVITY"
  }
}
