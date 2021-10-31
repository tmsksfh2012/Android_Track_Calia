package com.example.week_4

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.week_4.databinding.PseudoActivityMainBinding

// 이름과 전화번호를 담은 데이터리스트
data class Person(val name: String, val number: String)

class PseudoCode: AppCompatActivity(){
    var peopleArrayList = ArrayList<Person>()
    private lateinit var customAdapter: PseudoCustomAdapter
    lateinit var binding: PseudoActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = PseudoActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // 데이터리스트 완성
        for (x in 0 .. 30) {
            peopleArrayList.add(Person("구", "010"))
            peopleArrayList.add(Person("리", "010"))
            peopleArrayList.add(Person("구", "010"))
            peopleArrayList.add(Person("리", "010"))
        }
        /* list view에 item을 엮어줄 필요가 있다.
        1. list view에서 위치(인덱스)를 반환하는 메소드
        2. 데이터 리스트에서 인덱스에 해당하는 데이터를 가져오는 메소드
        3. 데이터를 list view에 넣어주는 메소드
         */

        customAdapter = PseudoCustomAdapter(this, peopleArrayList)
        binding.listView.adapter = customAdapter
    }
}