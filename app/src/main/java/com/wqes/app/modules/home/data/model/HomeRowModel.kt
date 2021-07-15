package com.wqes.app.modules.home.`data`.model

import com.wqes.app.R
import com.wqes.app.appcomponents.di.MyApp
import kotlin.String

public data class HomeRowModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtMaoStreetChin: String? =
      MyApp.getInstance().resources.getString(R.string.msg_mao_street_chin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txt50: String? = MyApp.getInstance().resources.getString(R.string.lbl_5_0)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txt460FoodR: String? = MyApp.getInstance().resources.getString(R.string.lbl_460_food_r)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtNigerian: String? = MyApp.getInstance().resources.getString(R.string.lbl_nigerian)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtGwarinpaAbuja: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_gwarinpa_abuja)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txt52Km: String? = MyApp.getInstance().resources.getString(R.string.lbl_5_2_km)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtDeliveryIn22: String? =
      MyApp.getInstance().resources.getString(R.string.msg_delivery_in_22)

)
