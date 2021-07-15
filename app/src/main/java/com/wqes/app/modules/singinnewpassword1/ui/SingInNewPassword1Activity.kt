package com.wqes.app.modules.singinnewpassword1.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivitySingInNewPassword1Binding
import com.wqes.app.modules.singinnewpassword1.`data`.viewmodel.SingInNewPassword1VM
import kotlin.String
import kotlin.Unit

public class SingInNewPassword1Activity : AppCompatActivity() {
  private lateinit var binding: ActivitySingInNewPassword1Binding

  private val viewModel: SingInNewPassword1VM by viewModels<SingInNewPassword1VM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_sing_in_new_password_1)
    binding.lifecycleOwner = this
    binding.singInNewPassword1VM = viewModel
  }

  public companion object {
    public const val TAG: String = "SING_IN_NEW_PASSWORD1ACTIVITY"
  }
}
