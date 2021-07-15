package com.wqes.app.modules.profileeditprofilenodataerror.`data`.model

import com.wqes.app.R
import com.wqes.app.appcomponents.di.MyApp
import kotlin.String

public data class ProfileEditProfileNoDataErrorRowModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtGender: String? = MyApp.getInstance().resources.getString(R.string.lbl_gender)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etGenderValue: String? = MyApp.getInstance().resources.getString(R.string.lbl_gender)

)
