package com.example.week_4

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.week_4.databinding.PseudoListviewItemBinding

class PseudoCustomAdapter(context: Context, private val peopleList: ArrayList<Person>): BaseAdapter() { // why use context?

    var inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    lateinit var listViewBinding: PseudoListviewItemBinding // why use lateinit?

    override fun getCount(): Int = peopleList.size

    override fun getItem(position: Int): Any = peopleList[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        listViewBinding = PseudoListviewItemBinding.inflate(inflater, parent, false)
        listViewBinding.name.text = peopleList[position].name
        listViewBinding.number.text = peopleList[position].number

        return listViewBinding.root
    }
}