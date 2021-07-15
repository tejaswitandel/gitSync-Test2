package com.wqes.app.modules.cartemptyscreen.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityCartEmptyScreenBinding
import com.wqes.app.modules.cartemptyscreen.`data`.viewmodel.CartEmptyScreenVM
import kotlin.String
import kotlin.Unit

public class CartEmptyScreenActivity : AppCompatActivity() {
  private lateinit var binding: ActivityCartEmptyScreenBinding

  private val viewModel: CartEmptyScreenVM by viewModels<CartEmptyScreenVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_cart_empty_screen)
    binding.lifecycleOwner = this
    binding.cartEmptyScreenVM = viewModel
  }

  public companion object {
    public const val TAG: String = "CART_EMPTY_SCREEN_ACTIVITY"
  }
}
