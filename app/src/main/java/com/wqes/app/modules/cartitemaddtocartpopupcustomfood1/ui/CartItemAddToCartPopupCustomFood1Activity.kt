package com.wqes.app.modules.cartitemaddtocartpopupcustomfood1.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityCartItemAddToCartPopupCustomFood1Binding
import com.wqes.app.modules.cartitemaddtocartpopupcustomfood1.`data`.viewmodel.CartItemAddToCartPopupCustomFood1VM
import kotlin.String
import kotlin.Unit

public class CartItemAddToCartPopupCustomFood1Activity : AppCompatActivity() {
  private lateinit var binding: ActivityCartItemAddToCartPopupCustomFood1Binding

  private val viewModel: CartItemAddToCartPopupCustomFood1VM by
      viewModels<CartItemAddToCartPopupCustomFood1VM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding =
                   
        DataBindingUtil.setContentView(this,R.layout.activity_cart_item_add_to_cart_popup_custom_food_1)
    binding.lifecycleOwner = this
    binding.cartItemAddToCartPopupCustomFood1VM = viewModel
  }

  public companion object {
    public const val TAG: String = "CART_ITEM_ADD_TO_CART_POPUP_CUSTOM_FOOD1ACTIVITY"
  }
}
