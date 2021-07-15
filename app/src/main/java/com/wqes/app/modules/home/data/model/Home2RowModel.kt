package com.wqes.app.modules.home.`data`.model

import com.wqes.app.R
import com.wqes.app.appcomponents.di.MyApp
import kotlin.String

public data class Home2RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtBarkonoGrill: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_barkono_grill)
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
  public val txtAmerican: String? = MyApp.getInstance().resources.getString(R.string.lbl_american)
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
  public val txt15Km: String? = MyApp.getInstance().resources.getString(R.string.lbl_15_km)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtDeliveryIn22: String? =
      MyApp.getInstance().resources.getString(R.string.msg_delivery_in_22)

)
