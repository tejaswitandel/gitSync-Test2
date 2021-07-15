package com.wqes.app.modules.cartcheckoutorderplacedsuccessfully.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityCartCheckoutOrderPlacedSuccessfullyBinding
import com.wqes.app.modules.cartcheckoutorderplacedsuccessfully.`data`.viewmodel.CartCheckoutOrderPlacedSuccessfullyVM
import kotlin.String
import kotlin.Unit

public class CartCheckoutOrderPlacedSuccessfullyActivity : AppCompatActivity() {
  private lateinit var binding: ActivityCartCheckoutOrderPlacedSuccessfullyBinding

  private val viewModel: CartCheckoutOrderPlacedSuccessfullyVM by
      viewModels<CartCheckoutOrderPlacedSuccessfullyVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding =
                   
        DataBindingUtil.setContentView(this,R.layout.activity_cart_checkout_order_placed_successfully)
    binding.lifecycleOwner = this
    binding.cartCheckoutOrderPlacedSuccessfullyVM = viewModel
  }

  public companion object {
    public const val TAG: String = "CART_CHECKOUT_ORDER_PLACED_SUCCESSFULLY_ACTIVITY"
  }
}
