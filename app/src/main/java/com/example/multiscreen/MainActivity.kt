package com.example.multiscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //creating key
    companion object{
        const val Key="com.example.multiscreen.MainActivity.Key"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOrder.setOnClickListener {
            val orderPlaced= et1.text.toString() + " " + et2.text.toString() + " " + et3.text.toString() + " " + et4.text
            intent= Intent(this, Order::class.java)
            intent.putExtra(Key,orderPlaced)
            startActivity(intent)
        }
    }
}