package com.aaryaman.gstdatamaster.recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.aaryaman.gstdatamaster.R

class HistoryRecyclerView: RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return HistoryItemViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.history_list_item, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is HistoryItemViewHolder -> {
                holder.bind(dateList[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return dateList.size
    }
}


class HistoryItemViewHolder constructor(itemView : View) : RecyclerView.ViewHolder(itemView) {

    val box = itemView.date_view


    fun bind(str: ListBaseString) {
        box.text= str.str
    }

}