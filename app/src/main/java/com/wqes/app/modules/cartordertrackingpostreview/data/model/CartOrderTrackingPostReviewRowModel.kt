package com.wqes.app.modules.cartordertrackingpostreview.`data`.model

import com.wqes.app.R
import com.wqes.app.appcomponents.di.MyApp
import kotlin.String

public data class CartOrderTrackingPostReviewRowModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtQualityOfFood: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_quality_of_food)

)
