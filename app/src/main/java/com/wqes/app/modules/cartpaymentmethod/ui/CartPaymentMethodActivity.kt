package com.wqes.app.modules.cartpaymentmethod.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityCartPaymentMethodBinding
import com.wqes.app.modules.cartpaymentmethod.`data`.viewmodel.CartPaymentMethodVM
import kotlin.String
import kotlin.Unit

public class CartPaymentMethodActivity : AppCompatActivity() {
  private lateinit var binding: ActivityCartPaymentMethodBinding

  private val viewModel: CartPaymentMethodVM by viewModels<CartPaymentMethodVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_cart_payment_method)
    binding.lifecycleOwner = this
    binding.cartPaymentMethodVM = viewModel
  }

  public companion object {
    public const val TAG: String = "CART_PAYMENT_METHOD_ACTIVITY"
  }
}
