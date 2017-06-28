package com.whilchy.roomsampleapp.data

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.whilchy.roomsampleapp.data.dao.TaskDao
import com.whilchy.roomsampleapp.data.entities.Task

/**
 * Database class
 * Created by daniel on 28/06/2017.
 */
@Database(entities = arrayOf(Task::class), version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract fun taskDao(): TaskDao
}