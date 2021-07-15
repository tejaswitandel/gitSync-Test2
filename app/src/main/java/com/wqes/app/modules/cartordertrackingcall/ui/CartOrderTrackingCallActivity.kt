package com.wqes.app.modules.cartordertrackingcall.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityCartOrderTrackingCallBinding
import com.wqes.app.modules.cartordertrackingcall.`data`.viewmodel.CartOrderTrackingCallVM
import kotlin.String
import kotlin.Unit

public class CartOrderTrackingCallActivity : AppCompatActivity() {
  private lateinit var binding: ActivityCartOrderTrackingCallBinding

  private val viewModel: CartOrderTrackingCallVM by viewModels<CartOrderTrackingCallVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_cart_order_tracking_call)
    binding.lifecycleOwner = this
    binding.cartOrderTrackingCallVM = viewModel
  }

  public companion object {
    public const val TAG: String = "CART_ORDER_TRACKING_CALL_ACTIVITY"
  }
}
