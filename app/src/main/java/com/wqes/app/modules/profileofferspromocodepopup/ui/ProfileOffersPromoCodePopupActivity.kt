package com.wqes.app.modules.profileofferspromocodepopup.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityProfileOffersPromoCodePopupBinding
import com.wqes.app.modules.profileofferspromocodepopup.`data`.viewmodel.ProfileOffersPromoCodePopupVM
import kotlin.String
import kotlin.Unit

public class ProfileOffersPromoCodePopupActivity : AppCompatActivity() {
  private lateinit var binding: ActivityProfileOffersPromoCodePopupBinding

  private val viewModel: ProfileOffersPromoCodePopupVM by
      viewModels<ProfileOffersPromoCodePopupVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding =
                   
        DataBindingUtil.setContentView(this,R.layout.activity_profile_offers_promo_code_popup)
    binding.lifecycleOwner = this
    binding.profileOffersPromoCodePopupVM = viewModel
  }

  public companion object {
    public const val TAG: String = "PROFILE_OFFERS_PROMO_CODE_POPUP_ACTIVITY"
  }
}
