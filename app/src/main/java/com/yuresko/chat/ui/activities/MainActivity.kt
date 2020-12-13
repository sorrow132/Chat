package com.yuresko.chat.ui.activities

import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.firebase.auth.FirebaseAuth
import com.yuresko.chat.R
import com.yuresko.chat.base.BaseActivity
import com.yuresko.chat.extentions.replaceActivity
import com.yuresko.chat.extentions.replaceFragment
import com.yuresko.chat.ui.fragments.Chats

class MainActivity : BaseActivity() {
    private lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onStart() {
        super.onStart()
        initFields()
        authorization()
    }

    private fun authorization() {
        if (mAuth.currentUser != null) {
            replaceFragment(Chats.newInstance())
        } else {
            replaceActivity(LoginActivity())
            finish()
        }
    }

    private fun initFields() {
        val navView: BottomNavigationView = findViewById(R.id.bottomNavigationView)
        val navController = findNavController(R.id.fragmentContainer)
        navView.setupWithNavController(navController)
        mAuth = FirebaseAuth.getInstance()

    }
}