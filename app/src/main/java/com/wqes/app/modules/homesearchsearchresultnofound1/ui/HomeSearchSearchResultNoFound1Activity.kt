package com.wqes.app.modules.homesearchsearchresultnofound1.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityHomeSearchSearchResultNoFound1Binding
import com.wqes.app.modules.homesearchsearchresultnofound1.`data`.viewmodel.HomeSearchSearchResultNoFound1VM
import kotlin.String
import kotlin.Unit

public class HomeSearchSearchResultNoFound1Activity : AppCompatActivity() {
  private lateinit var binding: ActivityHomeSearchSearchResultNoFound1Binding

  private val viewModel: HomeSearchSearchResultNoFound1VM by
      viewModels<HomeSearchSearchResultNoFound1VM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding =
                   
        DataBindingUtil.setContentView(this,R.layout.activity_home_search_search_result_no_found_1)
    binding.lifecycleOwner = this
    binding.homeSearchSearchResultNoFound1VM = viewModel
  }

  public companion object {
    public const val TAG: String = "HOME_SEARCH_SEARCH_RESULT_NO_FOUND1ACTIVITY"
  }
}
