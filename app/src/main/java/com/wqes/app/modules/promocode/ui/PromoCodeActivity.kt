package com.wqes.app.modules.promocode.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityPromoCodeBinding
import com.wqes.app.modules.promocode.`data`.viewmodel.PromoCodeVM
import kotlin.String
import kotlin.Unit

public class PromoCodeActivity : AppCompatActivity() {
  private lateinit var binding: ActivityPromoCodeBinding

  private val viewModel: PromoCodeVM by viewModels<PromoCodeVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_promo_code)
    binding.lifecycleOwner = this
    binding.promoCodeVM = viewModel
  }

  public companion object {
    public const val TAG: String = "PROMO_CODE_ACTIVITY"
  }
}
