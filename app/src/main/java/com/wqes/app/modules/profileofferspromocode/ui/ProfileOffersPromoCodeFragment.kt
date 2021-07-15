package com.wqes.app.modules.profileofferspromocode.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.wqes.app.databinding.FragmentProfileOffersPromoCodeBinding
import com.wqes.app.modules.profileofferspromocode.`data`.viewmodel.ProfileOffersPromoCodeVM
import kotlin.String

public class ProfileOffersPromoCodeFragment : Fragment() {
  private lateinit var binding: FragmentProfileOffersPromoCodeBinding

  private val viewModel: ProfileOffersPromoCodeVM by viewModels<ProfileOffersPromoCodeVM>()

  public override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    binding = FragmentProfileOffersPromoCodeBinding.inflate(inflater)
    binding.lifecycleOwner = requireActivity()
    binding.profileOffersPromoCodeVM = viewModel
    return binding.root
  }

  public companion object {
    public const val TAG: String = "PROFILE_OFFERS_PROMO_CODE_FRAGMENT"
  }
}
