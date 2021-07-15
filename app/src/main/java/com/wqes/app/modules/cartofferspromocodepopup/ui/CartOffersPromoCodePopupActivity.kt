package com.wqes.app.modules.cartofferspromocodepopup.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityCartOffersPromoCodePopupBinding
import com.wqes.app.modules.cartofferspromocodepopup.`data`.viewmodel.CartOffersPromoCodePopupVM
import kotlin.String
import kotlin.Unit

public class CartOffersPromoCodePopupActivity : AppCompatActivity() {
  private lateinit var binding: ActivityCartOffersPromoCodePopupBinding

  private val viewModel: CartOffersPromoCodePopupVM by viewModels<CartOffersPromoCodePopupVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding =
                   
        DataBindingUtil.setContentView(this,R.layout.activity_cart_offers_promo_code_popup)
    binding.lifecycleOwner = this
    binding.cartOffersPromoCodePopupVM = viewModel
  }

  public companion object {
    public const val TAG: String = "CART_OFFERS_PROMO_CODE_POPUP_ACTIVITY"
  }
}
