package com.wqes.app.modules.profilesettingfaqsquestionssearch.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityProfileSettingFaqsQuestionsSearchBinding
import com.wqes.app.modules.profilesettingfaqsquestionssearch.`data`.viewmodel.ProfileSettingFaqsQuestionsSearchVM
import kotlin.String
import kotlin.Unit

public class ProfileSettingFaqsQuestionsSearchActivity : AppCompatActivity() {
  private lateinit var binding: ActivityProfileSettingFaqsQuestionsSearchBinding

  private val viewModel: ProfileSettingFaqsQuestionsSearchVM by
      viewModels<ProfileSettingFaqsQuestionsSearchVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding =
                   
        DataBindingUtil.setContentView(this,R.layout.activity_profile_setting_faqs_questions_search)
    binding.lifecycleOwner = this
    binding.profileSettingFaqsQuestionsSearchVM = viewModel
  }

  public companion object {
    public const val TAG: String = "PROFILE_SETTING_FAQS_QUESTIONS_SEARCH_ACTIVITY"
  }
}
