package com.aaryaman.gstdatamaster.recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.aaryaman.gstdatamaster.Data
import com.aaryaman.gstdatamaster.HistoryDataItem
import com.aaryaman.gstdatamaster.R
import kotlinx.android.synthetic.main.history_list_item.view.*

class HistoryRecyclerAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return HistoryItemViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.history_list_item, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is HistoryItemViewHolder -> {
                holder.bind(Data.historyList[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return Data.historyList.size
    }
}


class HistoryItemViewHolder constructor(itemView : View) : RecyclerView.ViewHolder(itemView) {

    val name = itemView.item_name
    val date = itemView.item_name
    val location = itemView.item_name


    fun bind(data: HistoryDataItem) {
        name.text= data.name
        date.text= data.date
    }


    init {

    }

}