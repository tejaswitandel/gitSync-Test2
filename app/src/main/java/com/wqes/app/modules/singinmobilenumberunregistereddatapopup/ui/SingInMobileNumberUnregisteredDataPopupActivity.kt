package com.wqes.app.modules.singinmobilenumberunregistereddatapopup.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivitySingInMobileNumberUnregisteredDataPopupBinding
import com.wqes.app.modules.singinmobilenumberunregistereddatapopup.`data`.viewmodel.SingInMobileNumberUnregisteredDataPopupVM
import kotlin.String
import kotlin.Unit

public class SingInMobileNumberUnregisteredDataPopupActivity : AppCompatActivity() {
  private lateinit var binding: ActivitySingInMobileNumberUnregisteredDataPopupBinding

  private val viewModel: SingInMobileNumberUnregisteredDataPopupVM by
      viewModels<SingInMobileNumberUnregisteredDataPopupVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding =
                   
        DataBindingUtil.setContentView(this,R.layout.activity_sing_in_mobile_number_unregistered_data_popup)
    binding.lifecycleOwner = this
    binding.singInMobileNumberUnregisteredDataPopupVM = viewModel
  }

  public companion object {
    public const val TAG: String = "SING_IN_MOBILE_NUMBER_UNREGISTERED_DATA_POPUP_ACTIVITY"
  }
}
