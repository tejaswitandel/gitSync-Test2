package com.wqes.app.modules.cartordertracking.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.wqes.app.databinding.FragmentCartOrderTrackingBinding
import com.wqes.app.modules.cartordertracking.`data`.viewmodel.CartOrderTrackingVM
import kotlin.String

public class CartOrderTrackingFragment : Fragment() {
  private lateinit var binding: FragmentCartOrderTrackingBinding

  private val viewModel: CartOrderTrackingVM by viewModels<CartOrderTrackingVM>()

  public override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    binding = FragmentCartOrderTrackingBinding.inflate(inflater)
    binding.lifecycleOwner = requireActivity()
    binding.cartOrderTrackingVM = viewModel
    return binding.root
  }

  public companion object {
    public const val TAG: String = "CART_ORDER_TRACKING_FRAGMENT"
  }
}
