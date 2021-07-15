package com.wqes.app.modules.cartordertrackingpostreview.ui

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityCartOrderTrackingPostReviewBinding
import com.wqes.app.modules.cartordertrackingpostreview.`data`.model.CartOrderTrackingPostReviewRowModel
import com.wqes.app.modules.cartordertrackingpostreview.`data`.viewmodel.CartOrderTrackingPostReviewVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class CartOrderTrackingPostReviewActivity : AppCompatActivity() {
  private lateinit var binding: ActivityCartOrderTrackingPostReviewBinding

  private val viewModel: CartOrderTrackingPostReviewVM by
      viewModels<CartOrderTrackingPostReviewVM>()

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: CartOrderTrackingPostReviewRowModel
  ): Unit {
  }

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding =
                   
        DataBindingUtil.setContentView(this,R.layout.activity_cart_order_tracking_post_review)
    val recyclerViewAdapter = RecyclerViewAdapter(arrayListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
            object : RecyclerViewAdapter.OnItemClickListener {
                override fun onItemClick(view:View, position:Int, item :
                        CartOrderTrackingPostReviewRowModel) {
                    onClickRecyclerView(view, position, item)
                }
            }
            )
    binding.lifecycleOwner = this
    binding.cartOrderTrackingPostReviewVM = viewModel
  }

  public companion object {
    public const val TAG: String = "CART_ORDER_TRACKING_POST_REVIEW_ACTIVITY"
  }
}
