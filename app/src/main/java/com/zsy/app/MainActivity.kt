package com.zsy.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alibaba.android.arouter.launcher.ARouter
import com.zsy.app.databinding.ActivityMainBinding
import com.zsy.common.utils.precision2

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btLogin.setOnClickListener {
//            ARouter.getInstance().build("/main/test/activity").navigation()
            ARouter.getInstance().build("/login/activity").navigation()
//            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}