package com.wqes.app.modules.homerestaurantsprofileanddetailsmenuresult.`data`.model

import com.wqes.app.R
import com.wqes.app.appcomponents.di.MyApp
import kotlin.String

public data class HomeRestaurantsProfileAndDetailsMenuResultRowModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtOlivesOnion: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_olives_onion)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txt50: String? = MyApp.getInstance().resources.getString(R.string.lbl_5_0)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtClassicTomato: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_classic_tomato)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txt40Votes: String? = MyApp.getInstance().resources.getString(R.string.lbl_40_votes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txt150: String? = MyApp.getInstance().resources.getString(R.string.lbl_150)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etOrderNowValue: String? = null
)
