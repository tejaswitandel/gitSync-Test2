package com.wqes.app.modules.homecurrentlocationsearchresults.`data`.model

import com.wqes.app.R
import com.wqes.app.appcomponents.di.MyApp
import kotlin.String

public data class HomeCurrentLocationSearchResultsRowModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtDawaliMarket: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_dawali_market)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtGwarinpaAbuja: String? =
      MyApp.getInstance().resources.getString(R.string.msg_gwarinpa_abuja)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txt10Km: String? = MyApp.getInstance().resources.getString(R.string.lbl_10_km)

)
