package com.whilchy.roomsampleapp.ui.adapters

import android.support.v7.widget.RecyclerView.ViewHolder
import com.whilchy.roomsampleapp.R
import com.whilchy.roomsampleapp.data.entities.Task

/**
 * Created by daniel on 29/06/2017.
 */
class TaskAdapter(var tasks: List<Task>) : android.support.v7.widget.RecyclerView.Adapter<TaskAdapter.TaskViewHolder>() {

    override fun onCreateViewHolder(parent: android.view.ViewGroup, type: Int): TaskAdapter.TaskViewHolder {
        return TaskViewHolder(parent)
    }

    override fun onBindViewHolder(viewHolder: TaskAdapter.TaskViewHolder, position: Int) {
        viewHolder.bind(tasks[position])
    }

    override fun getItemCount(): Int = tasks.size

    inner class TaskViewHolder(parent: android.view.ViewGroup)
        : ViewHolder(android.view.LayoutInflater.from(parent.context).inflate(R.layout.item_to_do,
            parent,
            false)) {

        fun bind(task: Task) = with(itemView) {
            val taskCb = findViewById(R.id.task_cb) as android.widget.CheckBox      // TODO: Change this to not use findViewById
            taskCb.text = task.description
            taskCb.isChecked = task.completed
        }
    }
}