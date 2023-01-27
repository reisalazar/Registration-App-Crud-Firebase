package com.example.userregistrationappcrudfirebase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.userregistrationappcrudfirebase.databinding.ActivityMainBinding

lateinit var mainBinding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = mainBinding.root
        setContentView(view)

        mainBinding.fabAdd.setOnClickListener {

            val intent = Intent(this, AddUserActivity::class.java)
            startActivity(intent)
        }
    }
}