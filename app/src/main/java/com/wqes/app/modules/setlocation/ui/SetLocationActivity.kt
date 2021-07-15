package com.wqes.app.modules.setlocation.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivitySetLocationBinding
import com.wqes.app.modules.setlocation.`data`.viewmodel.SetLocationVM
import kotlin.String
import kotlin.Unit

public class SetLocationActivity : AppCompatActivity() {
  private lateinit var binding: ActivitySetLocationBinding

  private val viewModel: SetLocationVM by viewModels<SetLocationVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_set_location)
    binding.lifecycleOwner = this
    binding.setLocationVM = viewModel
  }

  public companion object {
    public const val TAG: String = "SET_LOCATION_ACTIVITY"
  }
}
