package com.aaryaman.gstdatamaster.Fragment

import android.database.Cursor
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.aaryaman.gstdatamaster.Data
import com.aaryaman.gstdatamaster.DbManager
import com.aaryaman.gstdatamaster.HistoryDataItem
import com.aaryaman.gstdatamaster.R



class HistoryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_history, container, false)

        val cursor= LoadQuery()

        val itemNames = mutableListOf<String>()
        val itemDates = mutableListOf<String>()
        val itemLocations = mutableListOf<String>()
        with(cursor) {
            while (moveToNext()) {
                val itemName = getString(getColumnIndexOrThrow("File Name"))
                val itemDate = getString(getColumnIndexOrThrow("Date"))
                val itemLocation = getString(getColumnIndexOrThrow("Location"))
                itemNames.add(itemName)
                itemDates.add(itemDate)
                itemLocations.add(itemLocation)
            }
        }

        for( i in 0 until itemNames.size) run {
            val name = itemNames[i]
            val tick = itemDates[i]
            val time = itemLocations[i]
            val a= HistoryDataItem(name, tick, time)
            Data.historyList.add(a)
        }


        return view
    }

    private fun LoadQuery(): Cursor{
        val dbManager = DbManager(requireContext())
        return dbManager.Query()
    }
}