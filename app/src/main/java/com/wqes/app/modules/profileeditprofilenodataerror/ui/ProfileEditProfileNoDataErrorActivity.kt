package com.wqes.app.modules.profileeditprofilenodataerror.ui

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityProfileEditProfileNoDataErrorBinding
import com.wqes.app.modules.profileeditprofilenodataerror.`data`.model.ProfileEditProfileNoDataErrorRowModel
import com.wqes.app.modules.profileeditprofilenodataerror.`data`.viewmodel.ProfileEditProfileNoDataErrorVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class ProfileEditProfileNoDataErrorActivity : AppCompatActivity() {
  private lateinit var binding: ActivityProfileEditProfileNoDataErrorBinding

  private val viewModel: ProfileEditProfileNoDataErrorVM by
      viewModels<ProfileEditProfileNoDataErrorVM>()

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: ProfileEditProfileNoDataErrorRowModel
  ): Unit {
  }

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding =
                   
        DataBindingUtil.setContentView(this,R.layout.activity_profile_edit_profile_no_data_error)
    val recyclerViewAdapter = RecyclerViewAdapter(arrayListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
            object : RecyclerViewAdapter.OnItemClickListener {
                override fun onItemClick(view:View, position:Int, item :
                        ProfileEditProfileNoDataErrorRowModel) {
                    onClickRecyclerView(view, position, item)
                }
            }
            )
    binding.lifecycleOwner = this
    binding.profileEditProfileNoDataErrorVM = viewModel
  }

  public companion object {
    public const val TAG: String = "PROFILE_EDIT_PROFILE_NO_DATA_ERROR_ACTIVITY"
  }
}
