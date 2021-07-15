package com.wqes.app.modules.homecurrentlocationsearchresults.ui

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityHomeCurrentLocationSearchResultsBinding
import com.wqes.app.modules.homecurrentlocationsearchresults.`data`.model.HomeCurrentLocationSearchResultsRowModel
import com.wqes.app.modules.homecurrentlocationsearchresults.`data`.viewmodel.HomeCurrentLocationSearchResultsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class HomeCurrentLocationSearchResultsActivity : AppCompatActivity() {
  private lateinit var binding: ActivityHomeCurrentLocationSearchResultsBinding

  private val viewModel: HomeCurrentLocationSearchResultsVM by
      viewModels<HomeCurrentLocationSearchResultsVM>()

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: HomeCurrentLocationSearchResultsRowModel
  ): Unit {
  }

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding =
                   
        DataBindingUtil.setContentView(this,R.layout.activity_home_current_location_search_results)
    val recyclerViewAdapter = RecyclerViewAdapter(arrayListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
            object : RecyclerViewAdapter.OnItemClickListener {
                override fun onItemClick(view:View, position:Int, item :
                        HomeCurrentLocationSearchResultsRowModel) {
                    onClickRecyclerView(view, position, item)
                }
            }
            )
    binding.lifecycleOwner = this
    binding.homeCurrentLocationSearchResultsVM = viewModel
  }

  public companion object {
    public const val TAG: String = "HOME_CURRENT_LOCATION_SEARCH_RESULTS_ACTIVITY"
  }
}
