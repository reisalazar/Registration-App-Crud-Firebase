package com.example.userregistrationappcrudfirebase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.userregistrationappcrudfirebase.databinding.ActivityLoginBinding

lateinit var loginBinding: ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loginBinding = ActivityLoginBinding.inflate(layoutInflater)
        val view = loginBinding.root
        setContentView(view)

        loginBinding.btnSingIn.setOnClickListener {  }

        loginBinding.btnSignUp.setOnClickListener {

            val intent = Intent(this@LoginActivity, SignupActivity::class.java)
            startActivity(intent)

        }
    }
}