package com.wqes.app.modules.cartaddlocationaddressdetailssavedaddress.ui

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityCartAddLocationAddressDetailsSavedAddressBinding
import com.wqes.app.modules.cartaddlocationaddressdetailssavedaddress.`data`.model.CartAddLocationAddressDetailsSavedAddressRowModel
import com.wqes.app.modules.cartaddlocationaddressdetailssavedaddress.`data`.viewmodel.CartAddLocationAddressDetailsSavedAddressVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class CartAddLocationAddressDetailsSavedAddressActivity : AppCompatActivity() {
  private lateinit var binding: ActivityCartAddLocationAddressDetailsSavedAddressBinding

  private val viewModel: CartAddLocationAddressDetailsSavedAddressVM by
      viewModels<CartAddLocationAddressDetailsSavedAddressVM>()

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: CartAddLocationAddressDetailsSavedAddressRowModel
  ): Unit {
  }

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding =
                   
        DataBindingUtil.setContentView(this,R.layout.activity_cart_add_location_address_details_saved_address)
    val recyclerViewAdapter = RecyclerViewAdapter(arrayListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
            object : RecyclerViewAdapter.OnItemClickListener {
                override fun onItemClick(view:View, position:Int, item :
                        CartAddLocationAddressDetailsSavedAddressRowModel) {
                    onClickRecyclerView(view, position, item)
                }
            }
            )
    binding.lifecycleOwner = this
    binding.cartAddLocationAddressDetailsSavedAddressVM = viewModel
  }

  public companion object {
    public const val TAG: String = "CART_ADD_LOCATION_ADDRESS_DETAILS_SAVED_ADDRESS_ACTIVITY"
  }
}
