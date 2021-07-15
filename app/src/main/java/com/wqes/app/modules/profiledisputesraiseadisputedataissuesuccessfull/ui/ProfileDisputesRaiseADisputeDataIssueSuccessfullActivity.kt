package com.wqes.app.modules.profiledisputesraiseadisputedataissuesuccessfull.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityProfileDisputesRaiseADisputeDataIssueSuccessfullBinding
import com.wqes.app.modules.profiledisputesraiseadisputedataissuesuccessfull.`data`.viewmodel.ProfileDisputesRaiseADisputeDataIssueSuccessfullVM
import kotlin.String
import kotlin.Unit

public class ProfileDisputesRaiseADisputeDataIssueSuccessfullActivity : AppCompatActivity() {
  private lateinit var binding: ActivityProfileDisputesRaiseADisputeDataIssueSuccessfullBinding

  private val viewModel: ProfileDisputesRaiseADisputeDataIssueSuccessfullVM by
      viewModels<ProfileDisputesRaiseADisputeDataIssueSuccessfullVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding =
                   
        DataBindingUtil.setContentView(this,R.layout.activity_profile_disputes_raise_a_dispute_data_issue_successfull)
    binding.lifecycleOwner = this
    binding.profileDisputesRaiseADisputeDataIssueSuccessfullVM = viewModel
  }

  public companion object {
    public const val TAG: String =
        "PROFILE_DISPUTES_RAISE_A_DISPUTE_DATA_ISSUE_SUCCESSFULL_ACTIVITY"
  }
}
