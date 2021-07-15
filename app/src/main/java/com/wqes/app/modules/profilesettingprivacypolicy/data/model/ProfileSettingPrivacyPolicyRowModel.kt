package com.wqes.app.modules.profilesettingprivacypolicy.`data`.model

import com.wqes.app.R
import com.wqes.app.appcomponents.di.MyApp
import kotlin.String

public data class ProfileSettingPrivacyPolicyRowModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtPrivacy: String? = MyApp.getInstance().resources.getString(R.string.lbl_privacy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtItIsALongEs: String? =
      MyApp.getInstance().resources.getString(R.string.msg_it_is_a_long_es)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtThePointOfUs: String? =
      MyApp.getInstance().resources.getString(R.string.msg_the_point_of_us)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtThePointOfUs1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_the_point_of_us)

)
