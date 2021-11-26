package com.example.week6_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.week6_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        var handler = Handler(Looper.getMainLooper())

        var animalList = ArrayList<Int>()

        animalList.add(R.drawable.cat)
        animalList.add(R.drawable.dog)
        animalList.add(R.drawable.koala)

        Thread() {
            for(i in animalList) {
                Thread.sleep(1000)

                handler.post {
                    binding.picture.setImageResource(i)
                }
            }
        }.start()
    }
}