package com.example.week_4

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

class CustomAdapter(context:Context, private val cardArrayList: ArrayList<Card>):BaseAdapter() {
    val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    lateinit var binding:ListviewItemBinding

    override fun getCount(): Int = cardArrayList.size

    override fun getItem(position: Int): Any =cardArrayList[position]

    override fun getItemId(position: Int): Long =position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view=position
    }
}