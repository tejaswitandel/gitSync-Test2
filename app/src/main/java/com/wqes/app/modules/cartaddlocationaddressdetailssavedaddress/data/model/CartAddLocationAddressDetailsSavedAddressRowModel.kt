package com.wqes.app.modules.cartaddlocationaddressdetailssavedaddress.`data`.model

import com.wqes.app.R
import com.wqes.app.appcomponents.di.MyApp
import kotlin.String

public data class CartAddLocationAddressDetailsSavedAddressRowModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtGym: String? = MyApp.getInstance().resources.getString(R.string.lbl_gym)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txt4PpMarketG: String? =
      MyApp.getInstance().resources.getString(R.string.msg_4_pp_market_g)

)
