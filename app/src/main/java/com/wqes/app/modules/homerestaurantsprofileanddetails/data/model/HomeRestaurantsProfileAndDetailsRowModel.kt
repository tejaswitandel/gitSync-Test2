package com.wqes.app.modules.homerestaurantsprofileanddetails.`data`.model

import com.wqes.app.R
import com.wqes.app.appcomponents.di.MyApp
import kotlin.String

public data class HomeRestaurantsProfileAndDetailsRowModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtPotatoOnion: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_potato_onion)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txt50: String? = MyApp.getInstance().resources.getString(R.string.lbl_5_0)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtFrenchFries: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_french_fries)
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
