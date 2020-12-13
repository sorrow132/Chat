package com.yuresko.chat.ui.activities

import android.os.Bundle
import com.yuresko.chat.R
import com.yuresko.chat.base.BaseActivity
import com.yuresko.chat.extentions.replaceFragment
import com.yuresko.chat.ui.fragments.Registration

class LoginActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    override fun onStart() {
        super.onStart()
        replaceFragment(Registration())
    }


    private fun initFields(){
    }

}