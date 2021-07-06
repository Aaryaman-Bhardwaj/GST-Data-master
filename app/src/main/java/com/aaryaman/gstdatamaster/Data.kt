package com.aaryaman.gstdatamaster

import android.net.Uri

class HistoryDataItem(val name: String, val date: String, val location: String)

object Data {
   var fileLocation: Uri? = null
   var historyList: ArrayList<HistoryDataItem> = ArrayList()
}