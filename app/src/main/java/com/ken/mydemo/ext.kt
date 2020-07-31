package com.ken.mydemo

import android.app.Activity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx

/**
 * @author: ken
 * @date: 2020/7/30
 */
fun ViewPager2.initMain(fragment: Fragment): ViewPager2 {
    //是否可滑动
    this.isUserInputEnabled = false
    this.offscreenPageLimit = 5
    //设置适配器
    adapter = object : FragmentStateAdapter(fragment) {
        override fun createFragment(position: Int): Fragment {
            when (position) {
                0 -> {
                    return HomeFragment()
                }
                1 -> {
                    return ProjectFragment()
                }
                2 -> {
                    return TreeArrFragment()
                }
                else -> {
                    return HomeFragment()
                }
            }
        }
        override fun getItemCount() = 3
    }
    return this
}
fun BottomNavigationViewEx.init(navigationItemSelectedAction: (Int) -> Unit): BottomNavigationViewEx {
//    enableAnimation(true)
//    enableShiftingMode(false)
//    enableItemShiftingMode(true)
//    setTextSize(12F)
//    setOnNavigationItemSelectedListener {
//        navigationItemSelectedAction.invoke(it.itemId)
//        true
//    }

    return this
}