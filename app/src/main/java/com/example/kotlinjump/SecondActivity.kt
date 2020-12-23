package com.example.kotlinjump

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        tv_second.setOnClickListener {
            Intent(this,ThirdActivity::class.java).apply {
                putExtras(intent.extras!!)
                //!!表示不会为空 
                startActivity(this)
            }
        }
    }
}