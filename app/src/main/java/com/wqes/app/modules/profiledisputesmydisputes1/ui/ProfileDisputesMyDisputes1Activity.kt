package com.wqes.app.modules.profiledisputesmydisputes1.ui

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityProfileDisputesMyDisputes1Binding
import com.wqes.app.modules.profiledisputesmydisputes1.`data`.model.ProfileDisputesMyDisputes1RowModel
import com.wqes.app.modules.profiledisputesmydisputes1.`data`.viewmodel.ProfileDisputesMyDisputes1VM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class ProfileDisputesMyDisputes1Activity : AppCompatActivity() {
  private lateinit var binding: ActivityProfileDisputesMyDisputes1Binding

  private val viewModel: ProfileDisputesMyDisputes1VM by viewModels<ProfileDisputesMyDisputes1VM>()

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: ProfileDisputesMyDisputes1RowModel
  ): Unit {
  }

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding =
                   
        DataBindingUtil.setContentView(this,R.layout.activity_profile_disputes_my_disputes_1)
    val recyclerViewAdapter = RecyclerViewAdapter(arrayListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
            object : RecyclerViewAdapter.OnItemClickListener {
                override fun onItemClick(view:View, position:Int, item :
                        ProfileDisputesMyDisputes1RowModel) {
                    onClickRecyclerView(view, position, item)
                }
            }
            )
    binding.lifecycleOwner = this
    binding.profileDisputesMyDisputes1VM = viewModel
  }

  public companion object {
    public const val TAG: String = "PROFILE_DISPUTES_MY_DISPUTES1ACTIVITY"
  }
}
