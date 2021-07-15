package com.wqes.app.modules.bookmarkempty.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityBookmarkEmptyBinding
import com.wqes.app.modules.bookmarkempty.`data`.viewmodel.BookmarkEmptyVM
import kotlin.String
import kotlin.Unit

public class BookmarkEmptyActivity : AppCompatActivity() {
  private lateinit var binding: ActivityBookmarkEmptyBinding

  private val viewModel: BookmarkEmptyVM by viewModels<BookmarkEmptyVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_bookmark_empty)
    binding.lifecycleOwner = this
    binding.bookmarkEmptyVM = viewModel
  }

  public companion object {
    public const val TAG: String = "BOOKMARK_EMPTY_ACTIVITY"
  }
}
