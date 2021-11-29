package com.example.week7practice

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.week7practice.databinding.ItemLayoutBinding

class ListViewAdapter(var mArrayList:ArrayList<Data>, mContext: Context) : BaseAdapter() {
    private var mLayoutInflater: LayoutInflater = mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    lateinit var item: ItemLayoutBinding
    var mTitle: TextView? = null
    var mContexts: TextView? = null

    override fun getCount(): Int {
        return mArrayList.size
    }

    override fun getItem(p0: Int): Any {
        return mArrayList[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        item = ItemLayoutBinding.inflate(mLayoutInflater, parent, false)

        item.itemLayoutTitle.text=mArrayList[position].title
        item.itemLayoutContents.text=mArrayList[position].contents
        return item.root
    }
}