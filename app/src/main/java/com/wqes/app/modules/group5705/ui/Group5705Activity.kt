package com.wqes.app.modules.group5705.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityGroup5705Binding
import com.wqes.app.modules.group5705.`data`.viewmodel.Group5705VM
import kotlin.String
import kotlin.Unit

public class Group5705Activity : AppCompatActivity() {
  private lateinit var binding: ActivityGroup5705Binding

  private val viewModel: Group5705VM by viewModels<Group5705VM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_group_5705)
    binding.lifecycleOwner = this
    binding.group5705VM = viewModel
  }

  public companion object {
    public const val TAG: String = "GROUP5705ACTIVITY"
  }
}
