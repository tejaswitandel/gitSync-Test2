package com.wqes.app.modules.homerestaurantsprofileanddetailsreview.ui

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityHomeRestaurantsProfileAndDetailsReviewBinding
import com.wqes.app.modules.homerestaurantsprofileanddetailsreview.`data`.model.HomeRestaurantsProfileAndDetailsReview1RowModel
import com.wqes.app.modules.homerestaurantsprofileanddetailsreview.`data`.model.HomeRestaurantsProfileAndDetailsReview2RowModel
import com.wqes.app.modules.homerestaurantsprofileanddetailsreview.`data`.model.HomeRestaurantsProfileAndDetailsReviewRowModel
import com.wqes.app.modules.homerestaurantsprofileanddetailsreview.`data`.viewmodel.HomeRestaurantsProfileAndDetailsReviewVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class HomeRestaurantsProfileAndDetailsReviewActivity : AppCompatActivity() {
  private lateinit var binding: ActivityHomeRestaurantsProfileAndDetailsReviewBinding

  private val viewModel: HomeRestaurantsProfileAndDetailsReviewVM by
      viewModels<HomeRestaurantsProfileAndDetailsReviewVM>()

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: HomeRestaurantsProfileAndDetailsReviewRowModel
  ): Unit {
  }

  public fun onClickRecyclerView1(
    view: View,
    position: Int,
    item: HomeRestaurantsProfileAndDetailsReview1RowModel
  ): Unit {
  }

  public fun onClickRecyclerView2(
    view: View,
    position: Int,
    item: HomeRestaurantsProfileAndDetailsReview2RowModel
  ): Unit {
  }

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding =
                   
        DataBindingUtil.setContentView(this,R.layout.activity_home_restaurants_profile_and_details_review)
    val recyclerViewAdapter = RecyclerViewAdapter(arrayListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
            object : RecyclerViewAdapter.OnItemClickListener {
                override fun onItemClick(view:View, position:Int, item :
                        HomeRestaurantsProfileAndDetailsReviewRowModel) {
                    onClickRecyclerView(view, position, item)
                }
            }
            )
    val recyclerView1Adapter = RecyclerView1Adapter(arrayListOf())
    binding.recyclerView1.adapter = recyclerView1Adapter
    recyclerView1Adapter.setOnItemClickListener(
            object : RecyclerView1Adapter.OnItemClickListener {
                override fun onItemClick(view:View, position:Int, item :
                        HomeRestaurantsProfileAndDetailsReview1RowModel) {
                    onClickRecyclerView1(view, position, item)
                }
            }
            )
    val recyclerView2Adapter = RecyclerView2Adapter(arrayListOf())
    binding.recyclerView2.adapter = recyclerView2Adapter
    recyclerView2Adapter.setOnItemClickListener(
            object : RecyclerView2Adapter.OnItemClickListener {
                override fun onItemClick(view:View, position:Int, item :
                        HomeRestaurantsProfileAndDetailsReview2RowModel) {
                    onClickRecyclerView2(view, position, item)
                }
            }
            )
    binding.lifecycleOwner = this
    binding.homeRestaurantsProfileAndDetailsReviewVM = viewModel
  }

  public companion object {
    public const val TAG: String = "HOME_RESTAURANTS_PROFILE_AND_DETAILS_REVIEW_ACTIVITY"
  }
}
