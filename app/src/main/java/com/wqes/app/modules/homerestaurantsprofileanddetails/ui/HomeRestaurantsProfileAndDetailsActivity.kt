package com.wqes.app.modules.homerestaurantsprofileanddetails.ui

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityHomeRestaurantsProfileAndDetailsBinding
import com.wqes.app.modules.homerestaurantsprofileanddetails.`data`.model.HomeRestaurantsProfileAndDetails1RowModel
import com.wqes.app.modules.homerestaurantsprofileanddetails.`data`.model.HomeRestaurantsProfileAndDetailsRowModel
import com.wqes.app.modules.homerestaurantsprofileanddetails.`data`.viewmodel.HomeRestaurantsProfileAndDetailsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class HomeRestaurantsProfileAndDetailsActivity : AppCompatActivity() {
  private lateinit var binding: ActivityHomeRestaurantsProfileAndDetailsBinding

  private val viewModel: HomeRestaurantsProfileAndDetailsVM by
      viewModels<HomeRestaurantsProfileAndDetailsVM>()

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: HomeRestaurantsProfileAndDetailsRowModel
  ): Unit {
  }

  public fun onClickRecyclerView1(
    view: View,
    position: Int,
    item: HomeRestaurantsProfileAndDetails1RowModel
  ): Unit {
  }

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding =
                   
        DataBindingUtil.setContentView(this,R.layout.activity_home_restaurants_profile_and_details)
    val recyclerViewAdapter = RecyclerViewAdapter(arrayListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
            object : RecyclerViewAdapter.OnItemClickListener {
                override fun onItemClick(view:View, position:Int, item :
                        HomeRestaurantsProfileAndDetailsRowModel) {
                    onClickRecyclerView(view, position, item)
                }
            }
            )
    val recyclerView1Adapter = RecyclerView1Adapter(arrayListOf())
    binding.recyclerView1.adapter = recyclerView1Adapter
    recyclerView1Adapter.setOnItemClickListener(
            object : RecyclerView1Adapter.OnItemClickListener {
                override fun onItemClick(view:View, position:Int, item :
                        HomeRestaurantsProfileAndDetails1RowModel) {
                    onClickRecyclerView1(view, position, item)
                }
            }
            )
    binding.lifecycleOwner = this
    binding.homeRestaurantsProfileAndDetailsVM = viewModel
  }

  public companion object {
    public const val TAG: String = "HOME_RESTAURANTS_PROFILE_AND_DETAILS_ACTIVITY"
  }
}
