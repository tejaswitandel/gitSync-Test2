package com.wqes.app.modules.cartaddlocation.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityCartAddLocationBinding
import com.wqes.app.modules.cartaddlocation.`data`.viewmodel.CartAddLocationVM
import kotlin.String
import kotlin.Unit

public class CartAddLocationActivity : AppCompatActivity() {
  private lateinit var binding: ActivityCartAddLocationBinding

  private val viewModel: CartAddLocationVM by viewModels<CartAddLocationVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_cart_add_location)
    binding.lifecycleOwner = this
    binding.cartAddLocationVM = viewModel
  }

  public companion object {
    public const val TAG: String = "CART_ADD_LOCATION_ACTIVITY"
  }
}
