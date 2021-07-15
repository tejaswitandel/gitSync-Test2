package com.wqes.app.modules.bookmark.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityBookmarkBinding
import com.wqes.app.modules.bookmark.`data`.viewmodel.BookmarkVM
import kotlin.String
import kotlin.Unit

public class BookmarkActivity : AppCompatActivity() {
  private lateinit var binding: ActivityBookmarkBinding

  private val viewModel: BookmarkVM by viewModels<BookmarkVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_bookmark)
    binding.lifecycleOwner = this
    binding.bookmarkVM = viewModel
  }

  public companion object {
    public const val TAG: String = "BOOKMARK_ACTIVITY"
  }
}
