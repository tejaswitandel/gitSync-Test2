package com.wqes.app.modules.homecurrentlocationnearbyandrecentlocation.`data`.model

import com.wqes.app.R
import com.wqes.app.appcomponents.di.MyApp
import kotlin.String

public data class HomeCurrentLocationNearbyAndRecentLocationRowModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtDiamondStreet: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_diamond_street)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtDawakiAbuja: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_dawaki_abuja)

)
