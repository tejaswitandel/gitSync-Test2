package com.wqes.app.modules.cartordertrackingorderdetail.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityCartOrderTrackingOrderDetailBinding
import com.wqes.app.modules.cartordertrackingorderdetail.`data`.viewmodel.CartOrderTrackingOrderDetailVM
import kotlin.String
import kotlin.Unit

public class CartOrderTrackingOrderDetailActivity : AppCompatActivity() {
  private lateinit var binding: ActivityCartOrderTrackingOrderDetailBinding

  private val viewModel: CartOrderTrackingOrderDetailVM by
      viewModels<CartOrderTrackingOrderDetailVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding =
                   
        DataBindingUtil.setContentView(this,R.layout.activity_cart_order_tracking_order_detail)
    binding.lifecycleOwner = this
    binding.cartOrderTrackingOrderDetailVM = viewModel
  }

  public companion object {
    public const val TAG: String = "CART_ORDER_TRACKING_ORDER_DETAIL_ACTIVITY"
  }
}
