package com.example.week7practice

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.week7practice.databinding.ActivitySharedpreferenceBinding

class SharedPreferenceActivity : AppCompatActivity() {
    var mBtnAdjust: Button? = null
    var mEditTitle: EditText? = null
    var mEditContents: EditText? = null
    lateinit var binding: ActivitySharedpreferenceBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySharedpreferenceBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)

        mBtnAdjust = binding.spBtnAdjustment
        mEditTitle = binding.spEditTitle
        mEditContents = binding.spEditContents

        mBtnAdjust!!.setOnClickListener {
            val sharedPreferences = getSharedPreferences("memo", MODE_PRIVATE)
            val editor = sharedPreferences.edit()
            editor.putString("title", mEditTitle?.text.toString())
            editor.putString("contents", mEditContents?.text.toString())
            editor.apply()
            finish()
        }

    }
}