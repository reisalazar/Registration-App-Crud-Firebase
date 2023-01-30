package com.example.userregistrationappcrudfirebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.userregistrationappcrudfirebase.databinding.ActivitySignupBinding

class SignupActivity : AppCompatActivity() {

    lateinit var signupBinding: ActivitySignupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        signupBinding = ActivitySignupBinding.inflate(layoutInflater)
        val view = signupBinding.root
        setContentView(view)


        signupBinding.btnSignUpUser.setOnClickListener {

        }
    }
}