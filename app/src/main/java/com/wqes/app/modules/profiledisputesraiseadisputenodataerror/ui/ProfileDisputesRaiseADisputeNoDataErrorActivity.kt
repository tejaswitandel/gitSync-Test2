package com.wqes.app.modules.profiledisputesraiseadisputenodataerror.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityProfileDisputesRaiseADisputeNoDataErrorBinding
import com.wqes.app.modules.profiledisputesraiseadisputenodataerror.`data`.viewmodel.ProfileDisputesRaiseADisputeNoDataErrorVM
import kotlin.String
import kotlin.Unit

public class ProfileDisputesRaiseADisputeNoDataErrorActivity : AppCompatActivity() {
  private lateinit var binding: ActivityProfileDisputesRaiseADisputeNoDataErrorBinding

  private val viewModel: ProfileDisputesRaiseADisputeNoDataErrorVM by
      viewModels<ProfileDisputesRaiseADisputeNoDataErrorVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding =
                   
        DataBindingUtil.setContentView(this,R.layout.activity_profile_disputes_raise_a_dispute_no_data_error)
    binding.lifecycleOwner = this
    binding.profileDisputesRaiseADisputeNoDataErrorVM = viewModel
  }

  public companion object {
    public const val TAG: String = "PROFILE_DISPUTES_RAISE_A_DISPUTE_NO_DATA_ERROR_ACTIVITY"
  }
}
