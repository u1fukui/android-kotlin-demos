package com.u1fukui.android.kotlin.demos

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class DemoItemListAdapter(context: Context, itemList: List<DemoItem>) : ArrayAdapter<DemoItem>(context, 0, itemList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var holder: ViewHolder
        var view: View

        if(convertView == null){
            view =  LayoutInflater.from(context).inflate(android.R.layout.simple_list_item_1, parent, false);
            holder = ViewHolder(view)
            view.tag = holder
        } else {
            holder = convertView.tag as ViewHolder
            view = convertView
        }

        holder.textView?.text = getItem(position).displayName

        return view
    }

    internal class ViewHolder(view: View?) {
        var textView: TextView? = view?.findViewById(android.R.id.text1) as TextView?
    }
}