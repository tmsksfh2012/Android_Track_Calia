package com.example.wk_4

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.wk_4.databinding.ListviewItemBinding

class CustomAdapter(context: Context, val peopleList: ArrayList<Person>): BaseAdapter() {
    var inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    lateinit var listViewBinding: ListviewItemBinding

    override fun getCount(): Int = peopleList.size

    override fun getItem(p0: Int): Any = peopleList[p0]

    override fun getItemId(p0: Int): Long = p0.toLong()

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        listViewBinding = ListviewItemBinding.inflate(inflater, p2, false)
        listViewBinding.name.text = peopleList[p0].name
        listViewBinding.name.text = peopleList[p0].content

        return listViewBinding.root
    }
}