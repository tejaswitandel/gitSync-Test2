package com.wqes.app.modules.cart.`data`.model

import com.wqes.app.R
import com.wqes.app.appcomponents.di.MyApp
import kotlin.String

public data class CartRowModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txt200: String? = MyApp.getInstance().resources.getString(R.string.lbl_200)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txt2LollipopExtr: String? =
      MyApp.getInstance().resources.getString(R.string.msg_2_lollipop_extr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtChickenLollipo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_chicken_lollipo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txt: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etLblValue: String? = null
)
