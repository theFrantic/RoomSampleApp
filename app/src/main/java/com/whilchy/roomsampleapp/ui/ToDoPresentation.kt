package com.whilchy.roomsampleapp.ui

import com.whilchy.roomsampleapp.data.entities.Task

/**
 * Created by daniel on 29/06/2017.
 */
interface ToDoPresentation {

    fun showTasks(tasks: List<Task>)

    fun taskAddedAt(position: Int)

    fun scrollTo(position: Int)
}