package com.wqes.app.modules.cartofferspromocode.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityCartOffersPromoCodeBinding
import com.wqes.app.modules.cartofferspromocode.`data`.viewmodel.CartOffersPromoCodeVM
import kotlin.String
import kotlin.Unit

public class CartOffersPromoCodeActivity : AppCompatActivity() {
  private lateinit var binding: ActivityCartOffersPromoCodeBinding

  private val viewModel: CartOffersPromoCodeVM by viewModels<CartOffersPromoCodeVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_cart_offers_promo_code)
    binding.lifecycleOwner = this
    binding.cartOffersPromoCodeVM = viewModel
  }

  public companion object {
    public const val TAG: String = "CART_OFFERS_PROMO_CODE_ACTIVITY"
  }
}
