package com.example.multiscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_order.*

class Order : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val orderP= intent.getStringExtra(MainActivity.Key)
        tvorder.text= "Order Placed are: " + orderP.toString()
    }
}