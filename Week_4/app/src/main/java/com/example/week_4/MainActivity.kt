package com.example.week_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

data class  Card(val name:String, val contents: String)

class MainActivity : AppCompatActivity() {

    var cardArrayList = ArrayList<Card>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        for(x in 0..30){
            cardArrayList.add(Card("구", "하이"))
            cardArrayList.add(Card("리", "하이"))
            cardArrayList.add(Card("구", "하이"))
            cardArrayList.add(Card("리", "하이"))
        }
        main_listview
    }
}