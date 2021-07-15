package com.wqes.app.modules.home.ui

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wqes.app.R
import com.wqes.app.databinding.ActivityHomeBinding
import com.wqes.app.modules.home.`data`.model.Home1RowModel
import com.wqes.app.modules.home.`data`.model.Home2RowModel
import com.wqes.app.modules.home.`data`.model.HomeRowModel
import com.wqes.app.modules.home.`data`.viewmodel.HomeVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class HomeActivity : AppCompatActivity() {
  private lateinit var binding: ActivityHomeBinding

  private val viewModel: HomeVM by viewModels<HomeVM>()

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: HomeRowModel
  ): Unit {
  }

  public fun onClickRecyclerView1(
    view: View,
    position: Int,
    item: Home1RowModel
  ): Unit {
  }

  public fun onClickRecyclerView2(
    view: View,
    position: Int,
    item: Home2RowModel
  ): Unit {
  }

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_home)
    val recyclerViewAdapter = RecyclerViewAdapter(arrayListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
            object : RecyclerViewAdapter.OnItemClickListener {
                override fun onItemClick(view:View, position:Int, item : HomeRowModel) {
                    onClickRecyclerView(view, position, item)
                }
            }
            )
    val recyclerView1Adapter = RecyclerView1Adapter(arrayListOf())
    binding.recyclerView1.adapter = recyclerView1Adapter
    recyclerView1Adapter.setOnItemClickListener(
            object : RecyclerView1Adapter.OnItemClickListener {
                override fun onItemClick(view:View, position:Int, item : Home1RowModel) {
                    onClickRecyclerView1(view, position, item)
                }
            }
            )
    val recyclerView2Adapter = RecyclerView2Adapter(arrayListOf())
    binding.recyclerView2.adapter = recyclerView2Adapter
    recyclerView2Adapter.setOnItemClickListener(
            object : RecyclerView2Adapter.OnItemClickListener {
                override fun onItemClick(view:View, position:Int, item : Home2RowModel) {
                    onClickRecyclerView2(view, position, item)
                }
            }
            )
    binding.lifecycleOwner = this
    binding.homeVM = viewModel
  }

  public companion object {
    public const val TAG: String = "HOME_ACTIVITY"
  }
}
