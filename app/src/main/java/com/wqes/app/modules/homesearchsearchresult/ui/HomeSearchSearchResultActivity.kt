package com.wqes.app.modules.homesearchsearchresult.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityHomeSearchSearchResultBinding
import com.wqes.app.modules.homesearchsearchresult.`data`.viewmodel.HomeSearchSearchResultVM
import kotlin.String
import kotlin.Unit

public class HomeSearchSearchResultActivity : AppCompatActivity() {
  private lateinit var binding: ActivityHomeSearchSearchResultBinding

  private val viewModel: HomeSearchSearchResultVM by viewModels<HomeSearchSearchResultVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_home_search_search_result)
    binding.lifecycleOwner = this
    binding.homeSearchSearchResultVM = viewModel
  }

  public companion object {
    public const val TAG: String = "HOME_SEARCH_SEARCH_RESULT_ACTIVITY"
  }
}
