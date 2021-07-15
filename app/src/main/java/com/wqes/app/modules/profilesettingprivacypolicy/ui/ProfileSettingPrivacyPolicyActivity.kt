package com.wqes.app.modules.profilesettingprivacypolicy.ui

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityProfileSettingPrivacyPolicyBinding
import com.wqes.app.modules.profilesettingprivacypolicy.`data`.model.ProfileSettingPrivacyPolicyRowModel
import com.wqes.app.modules.profilesettingprivacypolicy.`data`.viewmodel.ProfileSettingPrivacyPolicyVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class ProfileSettingPrivacyPolicyActivity : AppCompatActivity() {
  private lateinit var binding: ActivityProfileSettingPrivacyPolicyBinding

  private val viewModel: ProfileSettingPrivacyPolicyVM by
      viewModels<ProfileSettingPrivacyPolicyVM>()

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: ProfileSettingPrivacyPolicyRowModel
  ): Unit {
  }

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding =
                   
        DataBindingUtil.setContentView(this,R.layout.activity_profile_setting_privacy_policy)
    val recyclerViewAdapter = RecyclerViewAdapter(arrayListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
            object : RecyclerViewAdapter.OnItemClickListener {
                override fun onItemClick(view:View, position:Int, item :
                        ProfileSettingPrivacyPolicyRowModel) {
                    onClickRecyclerView(view, position, item)
                }
            }
            )
    binding.lifecycleOwner = this
    binding.profileSettingPrivacyPolicyVM = viewModel
  }

  public companion object {
    public const val TAG: String = "PROFILE_SETTING_PRIVACY_POLICY_ACTIVITY"
  }
}
