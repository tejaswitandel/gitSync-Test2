package com.wqes.app.modules.profilemyorderhistory.`data`.model

import com.wqes.app.R
import com.wqes.app.appcomponents.di.MyApp
import kotlin.String

public data class ProfileMyOrderHistoryRowModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtPizzaHut: String? = MyApp.getInstance().resources.getString(R.string.lbl_pizza_hut)

)
