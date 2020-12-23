package com.example.kotlinjump

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.UserHandle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_first.setOnClickListener{
            Intent(this,SecondActivity::class.java).apply {
                putExtra("date","2020-12-23")
                putExtra("user",User())
                startActivity(this)
            }
        }
    }
}