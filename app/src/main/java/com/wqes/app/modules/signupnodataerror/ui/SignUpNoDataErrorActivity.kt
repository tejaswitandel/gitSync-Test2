package com.wqes.app.modules.signupnodataerror.ui

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivitySignUpNoDataErrorBinding
import com.wqes.app.modules.signupnodataerror.`data`.model.SignUpNoDataErrorRowModel
import com.wqes.app.modules.signupnodataerror.`data`.viewmodel.SignUpNoDataErrorVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class SignUpNoDataErrorActivity : AppCompatActivity() {
  private lateinit var binding: ActivitySignUpNoDataErrorBinding

  private val viewModel: SignUpNoDataErrorVM by viewModels<SignUpNoDataErrorVM>()

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: SignUpNoDataErrorRowModel
  ): Unit {
  }

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_sign_up_no_data_error)
    val recyclerViewAdapter = RecyclerViewAdapter(arrayListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
            object : RecyclerViewAdapter.OnItemClickListener {
                override fun onItemClick(view:View, position:Int, item : SignUpNoDataErrorRowModel)
        {
                    onClickRecyclerView(view, position, item)
                }
            }
            )
    binding.lifecycleOwner = this
    binding.signUpNoDataErrorVM = viewModel
  }

  public companion object {
    public const val TAG: String = "SIGN_UP_NO_DATA_ERROR_ACTIVITY"
  }
}
