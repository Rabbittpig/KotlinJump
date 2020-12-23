package com.example.kotlinjump

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        val date = intent.getStringExtra("date")
        val user = intent.getParcelableExtra<User>("user") as User
        tv_date.text = date
        tv_name.text = user.name
        tv_age.text = user.age.toString()
    }
}