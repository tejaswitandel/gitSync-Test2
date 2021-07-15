package com.wqes.app.modules.singinnewpassworddataerror.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivitySingInNewPasswordDataErrorBinding
import com.wqes.app.modules.singinnewpassworddataerror.`data`.viewmodel.SingInNewPasswordDataErrorVM
import kotlin.String
import kotlin.Unit

public class SingInNewPasswordDataErrorActivity : AppCompatActivity() {
  private lateinit var binding: ActivitySingInNewPasswordDataErrorBinding

  private val viewModel: SingInNewPasswordDataErrorVM by viewModels<SingInNewPasswordDataErrorVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding =
                   
        DataBindingUtil.setContentView(this,R.layout.activity_sing_in_new_password_data_error)
    binding.lifecycleOwner = this
    binding.singInNewPasswordDataErrorVM = viewModel
  }

  public companion object {
    public const val TAG: String = "SING_IN_NEW_PASSWORD_DATA_ERROR_ACTIVITY"
  }
}
