package com.wqes.app.modules.profilemyorderhistorymyorderdetailrepeatorder.`data`.model

import com.wqes.app.R
import com.wqes.app.appcomponents.di.MyApp
import kotlin.String

public data class ProfileMyOrderHistoryMyOrderDetailRepeatOrderRowModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtRestaurantLoca: String? =
      MyApp.getInstance().resources.getString(R.string.msg_restaurant_loca)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtPizzaHut: String? = MyApp.getInstance().resources.getString(R.string.lbl_pizza_hut)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txt143AbujaSoc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_143_abuja_soc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txt234: String? = MyApp.getInstance().resources.getString(R.string.lbl_234)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txt6655443322: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_6655443322)

)
