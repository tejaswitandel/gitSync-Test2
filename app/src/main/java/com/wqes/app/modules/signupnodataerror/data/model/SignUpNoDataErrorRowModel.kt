package com.wqes.app.modules.signupnodataerror.`data`.model

import com.wqes.app.R
import com.wqes.app.appcomponents.di.MyApp
import kotlin.String

public data class SignUpNoDataErrorRowModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtCity: String? = MyApp.getInstance().resources.getString(R.string.lbl_city)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etCityValue: String? = MyApp.getInstance().resources.getString(R.string.lbl_city)

)
