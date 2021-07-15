package com.wqes.app.modules.profilenotifications.`data`.model

import com.wqes.app.R
import com.wqes.app.appcomponents.di.MyApp
import kotlin.String

public data class ProfileNotificationsRowModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtYourOrder358: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_order_358)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txt2DaysAgo: String? = MyApp.getInstance().resources.getString(R.string.lbl_2_days_ago)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtDelivered: String? = MyApp.getInstance().resources.getString(R.string.lbl_delivered)

)
