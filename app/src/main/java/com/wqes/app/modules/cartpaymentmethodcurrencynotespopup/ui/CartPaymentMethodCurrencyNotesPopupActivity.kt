package com.wqes.app.modules.cartpaymentmethodcurrencynotespopup.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityCartPaymentMethodCurrencyNotesPopupBinding
import com.wqes.app.modules.cartpaymentmethodcurrencynotespopup.`data`.viewmodel.CartPaymentMethodCurrencyNotesPopupVM
import kotlin.String
import kotlin.Unit

public class CartPaymentMethodCurrencyNotesPopupActivity : AppCompatActivity() {
  private lateinit var binding: ActivityCartPaymentMethodCurrencyNotesPopupBinding

  private val viewModel: CartPaymentMethodCurrencyNotesPopupVM by
      viewModels<CartPaymentMethodCurrencyNotesPopupVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding =
                   
        DataBindingUtil.setContentView(this,R.layout.activity_cart_payment_method_currency_notes_popup)
    binding.lifecycleOwner = this
    binding.cartPaymentMethodCurrencyNotesPopupVM = viewModel
  }

  public companion object {
    public const val TAG: String = "CART_PAYMENT_METHOD_CURRENCY_NOTES_POPUP_ACTIVITY"
  }
}
