package com.example.week_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.week_4.databinding.ActivityMainBinding

data class  Card(val name:String, val contents: String)

class MainActivity : AppCompatActivity() {

    var cardArrayList = ArrayList<Card>()
    private lateinit var customAdapter: CustomAdapter
    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        for(x in 0..30){
            cardArrayList.add(Card("구", "하이"))
            cardArrayList.add(Card("리", "하이"))
            cardArrayList.add(Card("구", "하이"))
            cardArrayList.add(Card("리", "하이"))
        }

        customAdapter = CustomAdapter(this, cardArrayList)
        binding.mainListview.adapter = customAdapter
    }
}