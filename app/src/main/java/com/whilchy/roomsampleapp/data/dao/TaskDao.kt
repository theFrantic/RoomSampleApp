package com.whilchy.roomsampleapp.data.dao

import android.arch.persistence.room.*
import android.arch.persistence.room.OnConflictStrategy.REPLACE
import com.whilchy.roomsampleapp.data.entities.Task

/**
 * Dao Interface using Room. With this interface Room (at compile time) will generate the actual
 * implementation of this class for us to use
 * Created by daniel on 28/06/2017.
 */
@Dao interface TaskDao {

    @Query("select * from task")
    fun getAllTasks(): List<Task>

    @Query("select * from task where id = :arg0")         // TODO: Change :p0 for :id on new versions of Room Library
    fun findTaskById(id: Long): Task

    @Insert(onConflict = REPLACE)
    fun insertTask(task: Task)

    @Update(onConflict = REPLACE)
    fun updateTask(task: Task)

    @Delete
    fun deleteTask(task: Task)
}