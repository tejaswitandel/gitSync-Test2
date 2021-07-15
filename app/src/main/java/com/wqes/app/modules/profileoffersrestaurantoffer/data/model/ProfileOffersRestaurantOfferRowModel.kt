package com.wqes.app.modules.profileoffersrestaurantoffer.`data`.model

import com.wqes.app.R
import com.wqes.app.appcomponents.di.MyApp
import kotlin.String

public data class ProfileOffersRestaurantOfferRowModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtOllarica: String? = MyApp.getInstance().resources.getString(R.string.lbl_ollarica)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txt50: String? = MyApp.getInstance().resources.getString(R.string.lbl_5_0)
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
  public val txtAmerican: String? = MyApp.getInstance().resources.getString(R.string.lbl_american)
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
  public val txt30OffOnAll: String? =
      MyApp.getInstance().resources.getString(R.string.msg_30_off_on_all)

)
