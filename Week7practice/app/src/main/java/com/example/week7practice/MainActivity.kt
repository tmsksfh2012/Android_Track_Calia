package com.example.week7practice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ListView
import com.example.week7practice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var binding:ActivityMainBinding
    private lateinit var mListViewAdapter:ListViewAdapter
    var mArrayList = ArrayList<Data>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.mainBtnCreate.setOnClickListener(this)
        binding.mainBtnInquiry.setOnClickListener(this)

        mArrayList.add(Data("guri", "here"))
        mArrayList.add(Data("guri", "nice"))

        mListViewAdapter = ListViewAdapter(mArrayList, this)
        binding.mainListview.adapter = mListViewAdapter
    }

    override fun onClick(p0: View) {
        when(p0.id) {
            R.id.main_btn_create -> {
                val intent = Intent(this@MainActivity, SharedPreferenceActivity::class.java)
                startActivity(intent)
            }
            R.id.main_btn_inquiry -> {
                mArrayList.clear()
                val sharedPreferences = getSharedPreferences("memo", MODE_PRIVATE)
                mArrayList.add(Data(sharedPreferences.getString("title","")!!, sharedPreferences.getString("contents", "")!!))
                mListViewAdapter!!.notifyDataSetChanged()
            }
        }
    }
}