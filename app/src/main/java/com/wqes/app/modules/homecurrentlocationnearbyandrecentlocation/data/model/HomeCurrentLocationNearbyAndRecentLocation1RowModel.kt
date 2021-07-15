package com.wqes.app.modules.homecurrentlocationnearbyandrecentlocation.`data`.model

import com.wqes.app.R
import com.wqes.app.appcomponents.di.MyApp
import kotlin.String

public data class HomeCurrentLocationNearbyAndRecentLocation1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtGwarinpa: String? = MyApp.getInstance().resources.getString(R.string.lbl_gwarinpa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txt143AbujaSoc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_143_abuja_soc)

)
