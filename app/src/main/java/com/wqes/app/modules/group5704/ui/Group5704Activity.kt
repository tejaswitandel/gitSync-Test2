package com.wqes.app.modules.group5704.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityGroup5704Binding
import com.wqes.app.modules.group5704.`data`.viewmodel.Group5704VM
import kotlin.String
import kotlin.Unit

public class Group5704Activity : AppCompatActivity() {
  private lateinit var binding: ActivityGroup5704Binding

  private val viewModel: Group5704VM by viewModels<Group5704VM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_group_5704)
    binding.lifecycleOwner = this
    binding.group5704VM = viewModel
  }

  public companion object {
    public const val TAG: String = "GROUP5704ACTIVITY"
  }
}
