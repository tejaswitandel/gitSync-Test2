package com.wqes.app.modules.home.`data`.model

import com.wqes.app.R
import com.wqes.app.appcomponents.di.MyApp
import kotlin.String

public data class Home1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtAbeIgi: String? = MyApp.getInstance().resources.getString(R.string.lbl_abe_igi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txt50: String? = MyApp.getInstance().resources.getString(R.string.lbl_5_0)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txt460FoodRevie: String? =
      MyApp.getInstance().resources.getString(R.string.msg_460_food_revie)
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
  public val txt10Km: String? = MyApp.getInstance().resources.getString(R.string.lbl_10_km)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtDeliveryIn22: String? =
      MyApp.getInstance().resources.getString(R.string.msg_delivery_in_22)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txt50OffUseC: String? =
      MyApp.getInstance().resources.getString(R.string.msg_50_off_use_c)

)
