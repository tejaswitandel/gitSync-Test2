package com.wqes.app.modules.cartordertracking1.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityCartOrderTracking1Binding
import com.wqes.app.modules.cartordertracking1.`data`.viewmodel.CartOrderTracking1VM
import kotlin.String
import kotlin.Unit

public class CartOrderTracking1Activity : AppCompatActivity() {
  private lateinit var binding: ActivityCartOrderTracking1Binding

  private val viewModel: CartOrderTracking1VM by viewModels<CartOrderTracking1VM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_cart_order_tracking_1)
    binding.lifecycleOwner = this
    binding.cartOrderTracking1VM = viewModel
  }

  public companion object {
    public const val TAG: String = "CART_ORDER_TRACKING1ACTIVITY"
  }
}
