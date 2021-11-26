package com.example.week_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var milk = 0
        Thread() {
            while(true){
                milk++
            }
        }.start()

        Thread() {
            while(true) {
                milk--
                if(milk < 0)
                    println("악!!")
            }
        }.start()
    }
}