package com.wqes.app.modules.singinmobilenumbernodataerror.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivitySingInMobileNumberNoDataErrorBinding
import com.wqes.app.modules.singinmobilenumbernodataerror.`data`.viewmodel.SingInMobileNumberNoDataErrorVM
import kotlin.String
import kotlin.Unit

public class SingInMobileNumberNoDataErrorActivity : AppCompatActivity() {
  private lateinit var binding: ActivitySingInMobileNumberNoDataErrorBinding

  private val viewModel: SingInMobileNumberNoDataErrorVM by
      viewModels<SingInMobileNumberNoDataErrorVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding =
                   
        DataBindingUtil.setContentView(this,R.layout.activity_sing_in_mobile_number_no_data_error)
    binding.lifecycleOwner = this
    binding.singInMobileNumberNoDataErrorVM = viewModel
  }

  public companion object {
    public const val TAG: String = "SING_IN_MOBILE_NUMBER_NO_DATA_ERROR_ACTIVITY"
  }
}
