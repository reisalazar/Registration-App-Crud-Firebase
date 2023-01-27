package com.example.userregistrationappcrudfirebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.userregistrationappcrudfirebase.databinding.ActivityAddUserBinding

lateinit var addUserBinding: ActivityAddUserBinding

class AddUserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        addUserBinding = ActivityAddUserBinding.inflate(layoutInflater)
        val view = addUserBinding.root
        setContentView(view)
    }
}