package com.wqes.app.modules.cartitemaddtocartpopupcustomfood.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityCartItemAddToCartPopupCustomFoodBinding
import com.wqes.app.modules.cartitemaddtocartpopupcustomfood.`data`.viewmodel.CartItemAddToCartPopupCustomFoodVM
import kotlin.String
import kotlin.Unit

public class CartItemAddToCartPopupCustomFoodActivity : AppCompatActivity() {
  private lateinit var binding: ActivityCartItemAddToCartPopupCustomFoodBinding

  private val viewModel: CartItemAddToCartPopupCustomFoodVM by
      viewModels<CartItemAddToCartPopupCustomFoodVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding =
                   
        DataBindingUtil.setContentView(this,R.layout.activity_cart_item_add_to_cart_popup_custom_food)
    binding.lifecycleOwner = this
    binding.cartItemAddToCartPopupCustomFoodVM = viewModel
  }

  public companion object {
    public const val TAG: String = "CART_ITEM_ADD_TO_CART_POPUP_CUSTOM_FOOD_ACTIVITY"
  }
}
