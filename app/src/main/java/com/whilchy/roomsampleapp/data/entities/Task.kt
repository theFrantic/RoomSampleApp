package com.whilchy.roomsampleapp.data.entities

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * Entity to define a task
 * Created by daniel on 28/06/2017.
 */
@Entity(tableName = "task")
data class Task(@ColumnInfo(name = "completed_flag") var completed: Boolean = false,
                @ColumnInfo(name = "task_desciption") var description: String = "") {
    @ColumnInfo(name = "id")
    @PrimaryKey(autoGenerate = true) var id: Long = 0
}