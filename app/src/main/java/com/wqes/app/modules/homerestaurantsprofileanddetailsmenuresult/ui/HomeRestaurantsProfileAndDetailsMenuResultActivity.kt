package com.wqes.app.modules.homerestaurantsprofileanddetailsmenuresult.ui

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityHomeRestaurantsProfileAndDetailsMenuResultBinding
import com.wqes.app.modules.homerestaurantsprofileanddetailsmenuresult.`data`.model.HomeRestaurantsProfileAndDetailsMenuResultRowModel
import com.wqes.app.modules.homerestaurantsprofileanddetailsmenuresult.`data`.viewmodel.HomeRestaurantsProfileAndDetailsMenuResultVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class HomeRestaurantsProfileAndDetailsMenuResultActivity : AppCompatActivity() {
  private lateinit var binding: ActivityHomeRestaurantsProfileAndDetailsMenuResultBinding

  private val viewModel: HomeRestaurantsProfileAndDetailsMenuResultVM by
      viewModels<HomeRestaurantsProfileAndDetailsMenuResultVM>()

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: HomeRestaurantsProfileAndDetailsMenuResultRowModel
  ): Unit {
  }

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding =
                   
        DataBindingUtil.setContentView(this,R.layout.activity_home_restaurants_profile_and_details_menu_result)
    val recyclerViewAdapter = RecyclerViewAdapter(arrayListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
            object : RecyclerViewAdapter.OnItemClickListener {
                override fun onItemClick(view:View, position:Int, item :
                        HomeRestaurantsProfileAndDetailsMenuResultRowModel) {
                    onClickRecyclerView(view, position, item)
                }
            }
            )
    binding.lifecycleOwner = this
    binding.homeRestaurantsProfileAndDetailsMenuResultVM = viewModel
  }

  public companion object {
    public const val TAG: String = "HOME_RESTAURANTS_PROFILE_AND_DETAILS_MENU_RESULT_ACTIVITY"
  }
}
