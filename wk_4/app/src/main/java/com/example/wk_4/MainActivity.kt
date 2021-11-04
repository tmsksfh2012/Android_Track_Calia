package com.example.wk_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wk_4.databinding.ActivityMainBinding

data class Person(val name: String, val content: String)
class MainActivity : AppCompatActivity() {
    lateinit var customAdapter: CustomAdapter
    var peopleList = ArrayList<Person>()
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)

        // 친구 데이터 리스트 생성
        for(x in 0 .. 30) {
            peopleList.add(Person("구","안녕")) // 0
            peopleList.add(Person("리","안녕")) // 1
            peopleList.add(Person("구","안녕")) // 2
            peopleList.add(Person("리","안녕")) // 3
        }

        customAdapter = CustomAdapter(this, peopleList)
        binding.listview.adapter = customAdapter

        // 메인 레이아웃, 아이템 래이아웃, 데이터 리스트
        // 데이터 리스트에서 각각의 위치에 있는 데이터들을 아이템 레이아웃에 넣어서 메인 레이아웃로 보내야 된다.

        // 데이터 리스트에서 인덱스 뽑는 메소드
        // 인덱스에 해당하는 메인 레이아웃 위치 뽑는 메소드
        // 아이템 레이아웃에 데이터 넣어주는 메소드

        // Adapter
    }
}