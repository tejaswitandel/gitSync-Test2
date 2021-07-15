package com.wqes.app.modules.cartordertrackingorderdetailextratip.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityCartOrderTrackingOrderDetailExtraTipBinding
import com.wqes.app.modules.cartordertrackingorderdetailextratip.`data`.viewmodel.CartOrderTrackingOrderDetailExtraTipVM
import kotlin.String
import kotlin.Unit

public class CartOrderTrackingOrderDetailExtraTipActivity : AppCompatActivity() {
  private lateinit var binding: ActivityCartOrderTrackingOrderDetailExtraTipBinding

  private val viewModel: CartOrderTrackingOrderDetailExtraTipVM by
      viewModels<CartOrderTrackingOrderDetailExtraTipVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding =
                   
        DataBindingUtil.setContentView(this,R.layout.activity_cart_order_tracking_order_detail_extra_tip)
    binding.lifecycleOwner = this
    binding.cartOrderTrackingOrderDetailExtraTipVM = viewModel
  }

  public companion object {
    public const val TAG: String = "CART_ORDER_TRACKING_ORDER_DETAIL_EXTRA_TIP_ACTIVITY"
  }
}
