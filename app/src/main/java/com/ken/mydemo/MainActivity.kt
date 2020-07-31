package com.ken.mydemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      //  mainViewpager.initMain(this)
        //初始化 bottombar
//        mainBottom.init{
//            when (it) {
//                R.id.menu_main -> mainViewpager.setCurrentItem(0, false)
//                R.id.menu_project -> mainViewpager.setCurrentItem(1, false)
//                R.id.menu_system -> mainViewpager.setCurrentItem(2, false)
//                R.id.menu_public -> mainViewpager.setCurrentItem(3, false)
//                R.id.menu_me -> mainViewpager.setCurrentItem(4, false)
//            }
//        }
    }
}