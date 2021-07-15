package com.wqes.app.modules.homecurrentlocationnearbyandrecentlocation.ui

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityHomeCurrentLocationNearbyAndRecentLocationBinding
import com.wqes.app.modules.homecurrentlocationnearbyandrecentlocation.`data`.model.HomeCurrentLocationNearbyAndRecentLocation1RowModel
import com.wqes.app.modules.homecurrentlocationnearbyandrecentlocation.`data`.model.HomeCurrentLocationNearbyAndRecentLocationRowModel
import com.wqes.app.modules.homecurrentlocationnearbyandrecentlocation.`data`.viewmodel.HomeCurrentLocationNearbyAndRecentLocationVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class HomeCurrentLocationNearbyAndRecentLocationActivity : AppCompatActivity() {
  private lateinit var binding: ActivityHomeCurrentLocationNearbyAndRecentLocationBinding

  private val viewModel: HomeCurrentLocationNearbyAndRecentLocationVM by
      viewModels<HomeCurrentLocationNearbyAndRecentLocationVM>()

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: HomeCurrentLocationNearbyAndRecentLocationRowModel
  ): Unit {
  }

  public fun onClickRecyclerView1(
    view: View,
    position: Int,
    item: HomeCurrentLocationNearbyAndRecentLocation1RowModel
  ): Unit {
  }

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding =
                   
        DataBindingUtil.setContentView(this,R.layout.activity_home_current_location_nearby_and_recent_location)
    val recyclerViewAdapter = RecyclerViewAdapter(arrayListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
            object : RecyclerViewAdapter.OnItemClickListener {
                override fun onItemClick(view:View, position:Int, item :
                        HomeCurrentLocationNearbyAndRecentLocationRowModel) {
                    onClickRecyclerView(view, position, item)
                }
            }
            )
    val recyclerView1Adapter = RecyclerView1Adapter(arrayListOf())
    binding.recyclerView1.adapter = recyclerView1Adapter
    recyclerView1Adapter.setOnItemClickListener(
            object : RecyclerView1Adapter.OnItemClickListener {
                override fun onItemClick(view:View, position:Int, item :
                        HomeCurrentLocationNearbyAndRecentLocation1RowModel) {
                    onClickRecyclerView1(view, position, item)
                }
            }
            )
    binding.lifecycleOwner = this
    binding.homeCurrentLocationNearbyAndRecentLocationVM = viewModel
  }

  public companion object {
    public const val TAG: String = "HOME_CURRENT_LOCATION_NEARBY_AND_RECENT_LOCATION_ACTIVITY"
  }
}
