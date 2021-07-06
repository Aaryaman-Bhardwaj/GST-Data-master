package com.aaryaman.gstdatamaster

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.database.sqlite.SQLiteQueryBuilder

class DbManager(context: Context) {

    val dbName= "GDM"
    val dbVersion = 1

    val dbTable = "history"
    val colID = "ID"
    val colFileName = "File name"
    val colDate = "Date"
    val colLocation = "Location"


    val sqlCreateTable = " Create table if not exists $dbTable(" +
            "$colID INTEGER PRIMARY KEY, " +
            "$colFileName TEXT, " +
            "$colDate TEXT, " +
            "$colLocation TEXT);"


    var sqlDB: SQLiteDatabase? = null

    init {
        var db = DatabaseHelper(context)
        sqlDB =db.writableDatabase
    }

    inner class DatabaseHelper(context: Context) : SQLiteOpenHelper(context, dbName, null, dbVersion) {

        var context: Context? = null

        override fun onCreate(p0: SQLiteDatabase?) {
            p0!!.execSQL(sqlCreateTable)
        }

        override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
            TODO("Not yet implemented")
        }


    }

    fun InsertEntry(values: ContentValues): Long{
        val id =sqlDB!!.insert(dbTable, "",  values)
        return id
    }

    fun Query(): Cursor{
        var qb=SQLiteQueryBuilder()
        qb.tables = dbTable
        return qb.query(sqlDB, null, null, null, null, null, null)
    }

}